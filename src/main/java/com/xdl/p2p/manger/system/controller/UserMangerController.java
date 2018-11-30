package com.xdl.p2p.manger.system.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jdt.internal.compiler.ast.ArrayAllocationExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xdl.p2p.manger.system.entity.UserManger;
import com.xdl.p2p.manger.system.service.IUserMangerService;
import com.xdl.p2p.publics.controller.BaseController;
import com.xdl.p2p.publics.util.Msg;
import com.xdl.p2p.publics.util.UserContext;

@Controller
public class UserMangerController extends BaseController{
	
	
	@Autowired
	private IUserMangerService userMangerService;
	
	@RequestMapping(value = "/userManger.do",method = RequestMethod.GET)
	public String userMangerList(HttpServletRequest request){
		if (UserContext.getMangerLoginUser() != null) {
			return "/manger/userManger";
		}
		return "/manger/login";
	}
	
	@RequestMapping(value = "/userList.do",method = RequestMethod.GET)
	public @ResponseBody Msg userList(HttpServletRequest request,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
		PageHelper.startPage(pageNum, 5);
		List<UserManger> userlist = userMangerService.queryUserMangerList();
		PageInfo page = new PageInfo(userlist, 5);
		return Msg.success().add("pageInfo", page);
	}
	
	@RequestMapping(value = "/userSearchList.do",method = RequestMethod.GET)
	public @ResponseBody Msg userSearchList(HttpServletRequest request,String phone){
		PageHelper.startPage(1, 5);
		UserManger user = userMangerService.queryUserMangerByPhone(phone);
		List<UserManger> userlist = new ArrayList<UserManger>();
		userlist.add(user);
		PageInfo page = new PageInfo(userlist, 1);
		return Msg.success().add("pageInfo", page);
	}
	
	@RequestMapping(value = "/userToAdd.do",method = RequestMethod.GET)
	public String userTOAdd(HttpServletRequest request){
		if (UserContext.getMangerLoginUser() != null) {
			return "/manger/userManger-add";
		}
		return "/manger/login";
	}
	
	@RequestMapping(value = "/userAdd.do",method = RequestMethod.POST)
	public @ResponseBody Msg userAdd(HttpServletRequest request,UserManger userManger){
		if (userManger != null) {
			userMangerService.saveUser(userManger);
			return Msg.success();
		}
		return Msg.fail();
	}
	
	@RequestMapping(value = "/userDelete.do",method = RequestMethod.POST)
	public @ResponseBody Msg userDelete(HttpServletRequest request,String useridm){
		if (StringUtils.isNotBlank(useridm)) {
			userMangerService.deleteUserById(useridm);
			return Msg.success();
		}
		return Msg.fail();
	}
	
	@RequestMapping(value = "/userStop.do",method = RequestMethod.POST)
	public @ResponseBody Msg userStop(HttpServletRequest request,String useridm){
		if (StringUtils.isNotBlank(useridm)) {
			UserManger userManger = new UserManger();
			userManger.setUseridm(Long.valueOf(useridm));
			userManger.setDr(1);
			userMangerService.userStop(userManger);
			return Msg.success();
		}
		return Msg.fail();
	}
	
	@RequestMapping(value = "/userStar.do",method = RequestMethod.POST)
	public @ResponseBody Msg userStar(HttpServletRequest request,String useridm){
		if (StringUtils.isNotBlank(useridm)) {
			UserManger userManger = new UserManger();
			userManger.setUseridm(Long.valueOf(useridm));
			userManger.setDr(0);
			userMangerService.userStop(userManger);
			return Msg.success();
		}
		return Msg.fail();
	}
	
}
