package com.xdl.p2p.front.usercenter.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xdl.p2p.front.bmoney.service.BorrowmoneyService;
import com.xdl.p2p.front.invest.service.InvestinfoService;
import com.xdl.p2p.publics.controller.BaseController;

/**
 * @author likang
 * @date   2017-9-5 下午3:40:39
 */
@Controller
public class WebController extends BaseController{

	@Autowired
	private InvestinfoService investinfoService;
	@Autowired
	private BorrowmoneyService borrowmoneyService;
	
	
	/**
	 * 前台首页
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/index.htm",method = RequestMethod.GET)
	public String index(Model model,HttpServletRequest request){
		Double tm = investinfoService.getSumMoney(null);
		long sizeTm = investinfoService.getCountTmoney();
		long sizeBm = borrowmoneyService.getCountBmoney();
		model.addAttribute("tm",tm);//累计投资金额......累计收益 = 累计投资金额 * 0.3
		model.addAttribute("sizeTm",sizeTm);//投资人数
		model.addAttribute("sizeBm",sizeBm);//借款人数
		return "front/index";
	}
	
	@RequestMapping(value = "/invest.htm",method = RequestMethod.GET)
	public String invest(Model model,HttpServletRequest request){
		return "front/invest/invest";
	}
	
	@RequestMapping(value = "/borrow.htm",method = RequestMethod.GET)
	public String borrow(Model model,HttpServletRequest request){
		return "front/borrow/borrow";
	}
	
	@RequestMapping(value = "/about.htm",method = RequestMethod.GET)
	public String about(Model model,HttpServletRequest request){
		return "front/common/about";
	}
	
	@RequestMapping(value = "/calculator.htm",method = RequestMethod.GET)
	public String calculator(Model model,HttpServletRequest request){
		return "front/common/calculator";
	}
	
}
