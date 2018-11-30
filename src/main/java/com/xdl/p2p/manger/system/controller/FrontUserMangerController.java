package com.xdl.p2p.manger.system.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xdl.p2p.front.usercenter.entity.User;
import com.xdl.p2p.manger.system.entity.UserManger;
import com.xdl.p2p.manger.system.service.IFrontUserMangerService;
import com.xdl.p2p.publics.controller.BaseController;
import com.xdl.p2p.publics.util.Msg;
import com.xdl.p2p.publics.util.UserContext;
@Controller
public class FrontUserMangerController extends BaseController{
	
	@Autowired
	private IFrontUserMangerService frontuserMangerService;
	
	
	@RequestMapping(value = "/frontuserManger.do",method = RequestMethod.GET)
	public String frontuserManger(HttpServletRequest request){
		if (UserContext.getMangerLoginUser() != null) {
			return "/manger/frontuserManger";
		}
		return "/manger/login";
	}
	

	@RequestMapping(value = "/frontuserList.do",method = RequestMethod.GET)
	public @ResponseBody Msg frontuserList(HttpServletRequest request,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
		PageHelper.startPage(pageNum, 5);
		List<User> userlist = frontuserMangerService.queryfrontUserMangerList();
		PageInfo page = new PageInfo(userlist, 5);
		return Msg.success().add("pageInfo", page);
	}
	
	
	@RequestMapping(value = "/frontuserSearchList.do",method = RequestMethod.GET)
	public @ResponseBody Msg userSearchList(HttpServletRequest request,String phone){
		PageHelper.startPage(1, 5);
		User user = frontuserMangerService.queryfrontUserMangerByPhone(phone);
		List<User> userlist = new ArrayList<User>();
		userlist.add(user);
		PageInfo page = new PageInfo(userlist, 1);
		return Msg.success().add("pageInfo", page);
	}
	
	@RequestMapping(value = "/frontuserStop.do",method = RequestMethod.POST)
	public @ResponseBody Msg frontuserStop(HttpServletRequest request,String userid){
		if (StringUtils.isNotBlank(userid)) {
			User user = new User();
			user.setUserid(Long.valueOf(userid));
			user.setDr(1);
			frontuserMangerService.userStop(user);
			return Msg.success();
		}
		return Msg.fail();
	}
	
	@RequestMapping(value = "/frontuserStar.do",method = RequestMethod.POST)
	public @ResponseBody Msg frontuserStar(HttpServletRequest request,String userid){
		if (StringUtils.isNotBlank(userid)) {
			User user = new User();
			user.setUserid(Long.valueOf(userid));
			user.setDr(0);
			frontuserMangerService.userStop(user);
			return Msg.success();
		}
		return Msg.fail();
	}
}
