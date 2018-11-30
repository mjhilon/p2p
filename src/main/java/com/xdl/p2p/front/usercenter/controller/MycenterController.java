package com.xdl.p2p.front.usercenter.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xdl.p2p.publics.controller.BaseController;

@Controller
public class MycenterController extends BaseController{

	/**
	 * 资产统计
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/asset-Statistics.htm",method=RequestMethod.GET)
	public String assetStatistics(HttpServletRequest request){
		return "/front/usercenter/asset-Statistics";
	}
	
	/**
	 * 我要充值
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/recharge.htm",method=RequestMethod.GET)
	public String recharge(HttpServletRequest request){
		return "/front/usercenter/recharge";
	}
	
	/**
	 * 我要提现
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/withdrawals.htm",method=RequestMethod.GET)
	public String withdrawals(HttpServletRequest request){
		return "/front/usercenter/withdrawals";
	}
	
	/**
	 * 银行卡管理 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/bank-Card.htm",method=RequestMethod.GET)
	public String bankCard(HttpServletRequest request){
		return "/front/usercenter/bank-Card";
	}
	
	/**
	 * 交易记录
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/record.htm",method=RequestMethod.GET)
	public String record(HttpServletRequest request){
		return "/front/usercenter/record";
	}
	
	/**
	 * 我的投资
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/my-investment.htm",method=RequestMethod.GET)
	public String myInvestment(HttpServletRequest request){
		return "/front/usercenter/my-investment";
	}
	
	/**
	 * 我的借款
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/loan.htm",method=RequestMethod.GET)
	public String loan(HttpServletRequest request){
		return "/front/usercenter/loan";
	}
	
	/**
	 * 站内信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/infomation.htm",method=RequestMethod.GET)
	public String infomation(HttpServletRequest request){
		return "/front/usercenter/infomation";
	}
	
	/**
	 * 安全设置
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/safe.htm",method=RequestMethod.GET)
	public String safe(HttpServletRequest request){
		return "/front/usercenter/safe";
	}
	
	/**
	 * 推荐好友
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/recommend.htm",method=RequestMethod.GET)
	public String recommend(HttpServletRequest request){
		return "/front/usercenter/recommend";
	}
	
	
}
