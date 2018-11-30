package com.xdl.p2p.publics.controller;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import sun.misc.BASE64Decoder;

/**
 * 控制器基类
 * @author likang
 * @date   2017-4-11 下午3:20:37
 */
public abstract class BaseController implements InitializingBean {
	
	protected static final Integer GLOBAL_PAGESIZE = 20;
	
	public static final String URL_SUFFIX = ".htm";
	
	public void afterPropertiesSet() throws Exception {

	}
	
	/**
	 * 返回到指定普通视图，没有任何属性
	 * @param view
	 * @return
	 */
	public String view(String view) {
		return view;
	}
	/**
	 * 返回一个包含对象o的视图
	 * @param view
	 * @param model
	 * @return
	 */
	public ModelAndView view(String view, Map<String, Object> model) {
		return new ModelAndView(view, "o", model);
	}

	/**
	 * 解决请求跨域问题
	 * @author likang	
	 * @param request
	 * @param response
	 * 2016年3月25日 下午1:17:07
	 */
	public void ajaxSolve(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html");
	    response.setCharacterEncoding("utf-8");
	    response.addHeader("Access-Control-Allow-Origin","*");//'*'表示允许所有域名访问，可以设置为指定域名访问，多个域名中间用','隔开
	  //如果IE浏览器则设置头信息如下
	    if("IE".equals(this.getRequest().getParameter("type"))){
	    	 response.addHeader("XDomainRequestAllowed","1");
	    }
	}
	
	protected HttpServletRequest getRequest() {
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	}

	 
	 
	/**
	 * 重定向
	 * @param view
	 * @return
	 */
	public String redirect(String view) {
		return parseRedirectView(view);
	}
	
	private String parseRedirectView(String view) {
		if (!StringUtils.hasText(view))
			throw new NullPointerException("view page can not be not null");
		String paramString = "";
		String tempView = "";
		if (view.indexOf("?") != -1) {
			tempView = view.substring(0, view.indexOf("?"));
			paramString = view.substring(view.indexOf("?"));
		} else
			tempView = view;
		if (!tempView.startsWith("/") && !tempView.endsWith(URL_SUFFIX))
			tempView = "/" + tempView + URL_SUFFIX;
		else if (tempView.startsWith("/") && !tempView.endsWith(URL_SUFFIX))
			tempView = tempView + URL_SUFFIX;
		else if (!tempView.startsWith("/") && tempView.endsWith(URL_SUFFIX))
			tempView = "/" + tempView;
		return "redirect:" + tempView + paramString;
	}
	
	
	/**
	 *  base64字符串转化成图片
	 * @author likang	
	 * @param imgStr
	 * @param imgFilePath
	 * @return
	 * 2016年5月25日 下午3:34:46
	 */
	public static boolean GenerateImage(String imgStr, String imgFilePath) { // 对字节数组字符串进行Base64解码并生成图片
		if (imgStr == null) // 图像数据为空
			return false;
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			// Base64解码
			byte[] b = decoder.decodeBuffer(imgStr);
			for (int i = 0; i < b.length; ++i) {
				if (b[i] < 0) {// 调整异常数据
					b[i] += 256;
				}
			}
			// 生成jpeg图片
			OutputStream out = new FileOutputStream(imgFilePath);
			out.write(b);
			out.flush();
			out.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	   
}
