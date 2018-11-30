package com.xdl.p2p.publics.util;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.xdl.p2p.front.usercenter.entity.User;
import com.xdl.p2p.manger.system.entity.UserManger;



public class UserContext {
	public static final String LOGIN_USER_FRONT = "login_user_front"; 
	public static final String LOGIN_USER_MANGER = "login_user_manger";
	
	/*********************前台用户***************************/
	private static HttpServletRequest getRequest() {
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	}
	
	public static User getFrontLoginUser(){
		return (User) getRequest().getSession(true).getAttribute(UserContext.LOGIN_USER_FRONT);
	}
	
	public static void setFrontLoginUser(User user){
		getRequest().getSession(true).setAttribute(UserContext.LOGIN_USER_FRONT, user);
	}
	
	public static void clearFrontLoginUser(){
		getRequest().getSession(true).removeAttribute(UserContext.LOGIN_USER_FRONT);
	}
	
	/*********************后台用户***************************/
	
	public static UserManger getMangerLoginUser(){
		return (UserManger) getRequest().getSession(true).getAttribute(UserContext.LOGIN_USER_MANGER);
	}
	
	public static void setMangerLoginUser(UserManger mangeruser){
		getRequest().getSession(true).setAttribute(UserContext.LOGIN_USER_MANGER, mangeruser);
	}
	
	public static void clearMangerLoginUser(){
		getRequest().getSession(true).removeAttribute(UserContext.LOGIN_USER_MANGER);
	}
	
}
