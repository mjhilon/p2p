<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	pageContext.setAttribute("PATH", request.getContextPath());
%>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link href="${PATH }/manager/static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${PATH }/manager/static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
<link href="${PATH }/manager/static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
<link href="${PATH }/manager/lib/Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css" />
<title>后台登录 - P2P借贷系统</title>
<meta name="keywords" content="P2P借贷系统">
<meta name="description" content="P2P借贷系统">
</head>
<body>
<input type="hidden" id="TenantId" name="TenantId" value="" />
<div class="loginWraper">
  <div id="loginform" class="loginBox">
	<h2 align="center">P2P后台管理系统V1.0</h2>
    <form class="form form-horizontal" action="/login.do" method="post">
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
        <div class="formControls col-xs-8">
          <input id="phone" name="phone" type="text" placeholder="账户手机号" class="input-text size-L">
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
        <div class="formControls col-xs-8">
          <input id="passwordm" name="passwordm" type="password" placeholder="密码" class="input-text size-L">
        </div>
      </div>
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
<!--           <input name="" type="submit" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
 -->          <button type="button" value="" class="btn btn-success radius size-L" id="login" onclick="loginAjax()">登录</button>
         	 &nbsp;&nbsp;&nbsp;&nbsp;	 &nbsp;&nbsp;&nbsp;&nbsp;
          <input name="" type="reset" class="btn btn-default radius size-L" value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
        </div>
      </div>
    </form>
  </div>
</div>
<div class="footer">Copyright 易第优（北京）教育咨询股份有限公司 2006 - 2017 Edu Inc. 京ICP备11018177号 京公网安备11011402000177</div>
<script type="text/javascript" src="${PATH }/manager/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${PATH }/manager/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="${PATH }/manager/static/h-ui.admin/js/login-admin.js"></script>
</body>
</html>