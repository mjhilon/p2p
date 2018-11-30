package com.xdl.p2p.front.invest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xdl.p2p.publics.controller.BaseController;

@Controller
public class InvestController extends BaseController{

	@RequestMapping(value = "/invest-list.htm",method=RequestMethod.GET)
	public String investList(HttpServletRequest request){
		return "/front/invest/invest-list";
	}
	
	
	@RequestMapping(value = "/invest-show.htm",method=RequestMethod.GET)
	public String investShow(HttpServletRequest request){
		return "/front/invest/invest-show";
	}
	
}
