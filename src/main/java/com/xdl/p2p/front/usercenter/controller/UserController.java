package com.xdl.p2p.front.usercenter.controller;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xdl.p2p.front.usercenter.entity.User;
import com.xdl.p2p.front.usercenter.service.UserMapper;
import com.xdl.p2p.front.usercenter.service.UserService;
import com.xdl.p2p.publics.constants.ReturnConstants;
import com.xdl.p2p.publics.controller.BaseController;
import com.xdl.p2p.publics.util.MD5Tools;
import com.xdl.p2p.publics.util.Msg;
import com.xdl.p2p.publics.util.UserContext;

 
@Controller
public class UserController extends BaseController{
	
	public static final String COOKIE_KEY = "auth_key";//登录时cookie的key 
	public static final String COOKIE_KEY_SEPARATE = "_#_";//登录时的cookie的分隔符
	
	public static CopyOnWriteArraySet<String> loginUserList = new CopyOnWriteArraySet<String>();
	
	@Autowired
	private UserService userService;
	
	/**
	 * 前台用户登录
	 * @param model
	 * @param request
	 * @param response
	 * @param phone
	 * @param password
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping(value = "/login.htm",method = RequestMethod.POST)
	public @ResponseBody String login(Model model,HttpServletRequest request,HttpServletResponse response,String phone,String password) throws UnsupportedEncodingException{
		if (StringUtils.isNotBlank(phone) && StringUtils.isNotBlank(password)) {
			User user = userService.queryUserByPhone(phone);
			if (user != null) {
				//校验密码是否正确
				boolean ismatch = userService.isPasswordMatch(phone, password);
				if (!ismatch) {
					return ReturnConstants.PASSWORD_ERROR;
				}
				UserContext.setFrontLoginUser(user);
				//设置Cookies
				Cookie cookie = new Cookie(COOKIE_KEY,URLEncoder.encode(phone, "UTF-8")+COOKIE_KEY_SEPARATE+MD5Tools.encode(password));
				cookie.setMaxAge(-1);
				cookie.setPath("/");
				response.addCookie(cookie);
				loginUserList.add(phone);
				request.getSession(true).setAttribute("phone",phone);
				request.getSession(true).setAttribute("loginFlag",ReturnConstants.SUCCESS);
				return ReturnConstants.SUCCESS;// 登陆成功
			}
			return ReturnConstants.USER_NO_EXIT;//用户不存在
		}
		return ReturnConstants.PARAM_IS_NULL;// 
	}
	
	/**
	 * 前台用户退出
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/logout.htm",method = RequestMethod.GET)
	public  String logout(HttpServletRequest request,HttpServletResponse response){
		if(UserContext.getFrontLoginUser()!=null){
			loginUserList.remove(UserContext.getFrontLoginUser().getPhone());
		}
		UserContext.clearFrontLoginUser();
		Cookie cookie = new Cookie(UserController.COOKIE_KEY,null);
		cookie.setMaxAge(0);
		cookie.setPath("/");
		response.addCookie(cookie);
		Cookie cookieJSESSIONID = new Cookie("JSESSIONID",null);
		String contextPath = request.getContextPath();
		cookieJSESSIONID.setMaxAge(0);
		cookieJSESSIONID.setPath(contextPath+"/");
		response.addCookie(cookieJSESSIONID);
		request.getSession(true).removeAttribute("phone");
		request.getSession(true).removeAttribute("loginFlag");
		return "redirect:/index.htm";
	}
	
	/**
	 * 跳转个人中心
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/mycenter.htm",method = RequestMethod.GET)
	public String mycenter(Model model,HttpServletRequest request,HttpServletResponse response) {
		if(UserContext.getFrontLoginUser()!=null){
			return "front/usercenter/mycenter";
		}
		return "redirect:/index.htm";
	}
	
	@RequestMapping(value="/loginRegist.htm",method = RequestMethod.POST)
	public @ResponseBody String loginRegist(HttpServletRequest request, User user){
		if (user != null && StringUtils.isNotBlank(user.getPhone())) {
			//查询手机号是否存在
			User usersys = userService.queryUserByPhone(user.getPhone());
			if (usersys != null) {
				return "0";//用户已经存在
			}
			//保存用户信息
			userService.saveUser(user);
			return ReturnConstants.SUCCESS;
		}
		return "1";// 
	}
	
	
}
