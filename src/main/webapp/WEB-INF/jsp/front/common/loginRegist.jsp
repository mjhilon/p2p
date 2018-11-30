<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<div class="Pop-up">
  <div class="pop-bd">
    <div class="hand"><div class="myfont close">&#xe611;</div></div>
    <div class="bd" id="form1">
      <div class="hd">会员登录</div>
      <div class="txt"><h1>为您提供简单、安全、高收益的理财服务</h1>优先选择有担保的优质债权 足值抵押物可以降低风险 分散投资，更能降低风险</div>
      <div class="form">
        <label>
        	<span>手机号</span><input id="phone" type="text" class="form-control first" value="" name="phone">
        </label>
        <label>
        	<span>密码</span><input id="password" type="password" class="form-control last" value="" name="password">
        </label>
        <button type="button" value="" class="button login" id="login" onclick="loginAjax()">登录</button>
        <div class="mt15"><a href="javascript:;" id="btnreg">没有帐号？</a>&nbsp;|&nbsp;<a href="#">忘记密码？</a></div>
      </div>      
    </div>
    <div class="bd none" id="form2">
      <div class="hd">会员注册</div>
      <div class="txt"><h1>为您提供简单、安全、高收益的理财服务</h1>优先选择有担保的优质债权 足值抵押物可以降低风险 分散投资，更能降低风险</div>
      <div class="form">
        <label><span>用户名</span><input type="text" class="form-control first" value="" name="username" id="username"></label>
        <label><span>手机</span><input type="text" class="form-control" value="" name="phone" id="phone1"></label>
        <label><span>密码</span><input type="password" class="form-control" value="" name="password" id="password1"></label>
        <button type="button" value="" class="button login" id="reg" onclick="loginRegist()">注册</button>
        <div class="mt15"><a href="javascript:;" id="btnlogin" style="color: blue">已有帐号</a>&nbsp;|&nbsp;<a href="#">忘记密码？</a></div>
      </div>      
    </div>
  </div>
</div>
</html>