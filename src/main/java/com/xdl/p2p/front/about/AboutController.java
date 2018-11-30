package com.xdl.p2p.front.about;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xdl.p2p.publics.controller.BaseController;

@Controller
public class AboutController extends BaseController{

	/**
	 * 公司资质
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/qualification.htm",method = RequestMethod.GET)
	public String qualification(HttpServletRequest request){
		return "/front/about/qualification";
	}
	
	/**
	 * 网站公告
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/news.htm",method = RequestMethod.GET)
	public String news(HttpServletRequest request){
		return "/front/about/news";
	}
	
	/**
	 * 媒体报道
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/reports.htm",method = RequestMethod.GET)
	public String reports(HttpServletRequest request){
		return "/front/about/reports";
	}
	
	/**
	 * 合作伙伴
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/partners.htm",method = RequestMethod.GET)
	public String partners(HttpServletRequest request){
		return "/front/about/partners";
	}
	
	/**
	 * 安全保障
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/sofapub.htm",method = RequestMethod.GET)
	public String sofapub(HttpServletRequest request){
		return "/front/about/sofapub";
	}
	

	/**
	 * 网站公告详情
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/newshow.htm",method = RequestMethod.GET)
	public String newshow(HttpServletRequest request){
		return "/front/about/newshow";
	}
	

}
