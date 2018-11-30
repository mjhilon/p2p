package com.xdl.p2p.manger.system.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xdl.p2p.manger.system.entity.Banner;
import com.xdl.p2p.manger.system.entity.UserManger;
import com.xdl.p2p.manger.system.service.IBannerService;
import com.xdl.p2p.publics.controller.BaseController;
import com.xdl.p2p.publics.util.AjaxFileUpload;
import com.xdl.p2p.publics.util.JsonUtil;
import com.xdl.p2p.publics.util.Msg;
import com.xdl.p2p.publics.util.UserContext;

@Controller
public class BannerController extends BaseController{

	
	@Autowired
	private IBannerService bannerService;
	
	@RequestMapping(value = "/bannerList.do",method=RequestMethod.GET)
	public String bannerList(HttpServletRequest request){
		if (UserContext.getMangerLoginUser() != null) {
			return "/manger/banner/banner";
		}
		return "/manger/login";
	}
	
	@RequestMapping(value = "/bannerToAdd.do",method=RequestMethod.GET)
	public String bannerToAdd(HttpServletRequest request){
		if (UserContext.getMangerLoginUser() != null) {
			return "/manger/banner/picture-add";
		}
		return "/manger/login";
	}
	
	@RequestMapping(value = "/uploadImgs.do")
	public @ResponseBody Map<String, Object> uploadImgs(MultipartFile imageFile,HttpServletRequest request,HttpServletResponse response){
		String filepath = AjaxFileUpload.ajaxUploadImg(imageFile, request, "banner");
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("filepath", filepath);
		return jsonMap;
	}
	
	@RequestMapping(value = "/bannerAdd.do",method = RequestMethod.POST)
	public @ResponseBody Msg bannerAdd(HttpServletRequest request,Banner banner){
		if (banner != null) {
			bannerService.saveBanner(banner);
			return Msg.success();
		}
		return Msg.fail();
	}
	
	@RequestMapping(value = "/queryBannerList.do",method = RequestMethod.GET)
	public @ResponseBody Msg queryBannerList(HttpServletRequest request,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
		PageHelper.startPage(pageNum, 5);
		List<Banner> bannerlist = bannerService.queryBannerList();
		PageInfo page = new PageInfo(bannerlist, 5);
		return Msg.success().add("pageInfo", page);
	}
	
	@RequestMapping(value = "/queryBannerByType.htm",method = RequestMethod.GET)
	public @ResponseBody String queryBannerByType(HttpServletRequest request,String imgType){
		 if (StringUtils.isNotBlank(imgType)) {
			List<Banner> list = bannerService.queryBannerByType(imgType);
			return JsonUtil.object2json(list);
		}
		 return null;
	}
	
}
