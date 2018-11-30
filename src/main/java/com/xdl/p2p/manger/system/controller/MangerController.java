package com.xdl.p2p.manger.system.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

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

import com.xdl.p2p.manger.system.entity.UserManger;
import com.xdl.p2p.manger.system.service.IUserMangerService;
import com.xdl.p2p.publics.constants.ReturnConstants;
import com.xdl.p2p.publics.controller.BaseController;
import com.xdl.p2p.publics.util.MD5Tools;
import com.xdl.p2p.publics.util.UserContext;

@Controller
public class MangerController extends BaseController{
	
	public static final String COOKIE_KEY = "auth_key";//登录时cookie的key 
	public static final String COOKIE_KEY_SEPARATE = "_#_";//登录时的cookie的分隔符
	
	@Autowired
	private IUserMangerService userMangerService;

	@RequestMapping(value = "/main.do",method = RequestMethod.GET)
	public String mangerIndex(Model model,HttpServletRequest request){
		if (UserContext.getMangerLoginUser() != null) {
			return "/manger/main";
		}
		return "/manger/login";
	}
	
	@RequestMapping(value = "/login.do",method = RequestMethod.POST)
	public @ResponseBody String login(Model model,HttpServletRequest request,HttpServletResponse response,String phone,String passwordm) throws UnsupportedEncodingException{
		if (StringUtils.isNotBlank(phone) && StringUtils.isNotBlank(passwordm)) {
			UserManger user = userMangerService.queryUserMangerByPhone(phone);
			if (user != null) {
				//校验密码是否正确
				boolean ismatch = userMangerService.isPasswordMatch(phone, passwordm);
				if (!ismatch) {
					return ReturnConstants.PASSWORD_ERROR;
				}
				UserContext.setMangerLoginUser(user);
				//设置Cookies
				Cookie cookie = new Cookie(COOKIE_KEY,URLEncoder.encode(phone, "UTF-8")+COOKIE_KEY_SEPARATE+MD5Tools.encode(passwordm));
				cookie.setMaxAge(-1);
				cookie.setPath("/");
				response.addCookie(cookie);
				request.getSession(true).setAttribute("usernamem",user.getUsernamem());
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
	@RequestMapping(value = "/logout.do",method = RequestMethod.GET)
	public  String logout(HttpServletRequest request,HttpServletResponse response){
		UserContext.clearFrontLoginUser();
		Cookie cookie = new Cookie(MangerController.COOKIE_KEY,null);
		cookie.setMaxAge(0);
		cookie.setPath("/");
		response.addCookie(cookie);
		Cookie cookieJSESSIONID = new Cookie("JSESSIONID",null);
		String contextPath = request.getContextPath();
		cookieJSESSIONID.setMaxAge(0);
		cookieJSESSIONID.setPath(contextPath+"/");
		response.addCookie(cookieJSESSIONID);
		request.getSession(true).removeAttribute("usernamem");
		request.getSession(true).removeAttribute("loginFlag");
		return "redirect:/main.do";
	}
	
	
}
