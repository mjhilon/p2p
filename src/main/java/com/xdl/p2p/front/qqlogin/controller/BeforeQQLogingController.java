package com.xdl.p2p.front.qqlogin.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qq.connect.QQConnectException;
import com.qq.connect.oauth.Oauth;
import com.xdl.p2p.publics.controller.BaseController;

@Controller
public class BeforeQQLogingController extends BaseController{
	
	@RequestMapping(value="/qqlogin.htm",method=RequestMethod.GET)
    protected void getQQlogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        try {
            response.sendRedirect(new Oauth().getAuthorizeURL(request));
        } catch (QQConnectException e) {
            e.printStackTrace();
        }
    }
}
