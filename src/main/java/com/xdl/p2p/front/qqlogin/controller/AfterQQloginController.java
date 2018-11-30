package com.xdl.p2p.front.qqlogin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qq.connect.QQConnectException;
import com.qq.connect.api.OpenID;
import com.qq.connect.api.qzone.UserInfo;
import com.qq.connect.javabeans.AccessToken;
import com.qq.connect.javabeans.qzone.UserInfoBean;
import com.qq.connect.oauth.Oauth;
import com.xdl.p2p.publics.controller.BaseController;

@Controller
public class AfterQQloginController extends BaseController{

	
	private static String qqoppID = null;

	
	/**
	 * 点击QQ第三方登录图标事件
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
    @RequestMapping(value="/afterlogin.htm",method=RequestMethod.GET)
    public String getQQloginAfter(Model model,HttpServletRequest request, HttpServletResponse response) throws IOException {
    	
        response.setContentType("text/html; charset=utf-8");
        try {
            AccessToken accessTokenObj = (new Oauth()).getAccessTokenByRequest(request);
            String accessToken   = null,
                   openID        = null;
            long tokenExpireIn = 0L;
            if (accessTokenObj.getAccessToken().equals("")) {////网站被攻击了或者用户取消了授权
            } else {
                accessToken = accessTokenObj.getAccessToken();
                tokenExpireIn = accessTokenObj.getExpireIn();
                request.getSession().setAttribute("demo_access_token", accessToken);
                request.getSession().setAttribute("demo_token_expirein", String.valueOf(tokenExpireIn));
                // 利用获取到的accessToken 去获取当前用的openid -------- start
                OpenID openIDObj =  new OpenID(accessToken);
                openID = openIDObj.getUserOpenID();//用户QQid
                qqoppID = openID;
                UserInfo qzoneUserInfo = new UserInfo(accessToken, openID);
                UserInfoBean userInfoBean = qzoneUserInfo.getUserInfo();
                String nickname = null;
                if (userInfoBean.getRet() == 0) {
                	nickname = userInfoBean.getNickname();
                }
                //TODO ......qqoppID
            }
        } catch (QQConnectException e) {
        }
        return null;
    }
    
   
}
