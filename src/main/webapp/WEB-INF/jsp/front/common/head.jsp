<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	pageContext.setAttribute("PATH", request.getContextPath());
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	path = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
	pageContext.setAttribute("path", path);
%>

<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
	<link rel="stylesheet" href="${PATH }/common/css/bootstrap.min-1.css">
	<link rel="stylesheet" href="${PATH }/common/css/common.css">
	<script src="${PATH }/common/js/jquery.min.js"></script>
	<link rel="stylesheet" href="${PATH }/common/css/login-register.css" />
	<link rel="stylesheet" href="${PATH }/bootstrap/dist/css/font-awesome.css">
	<script src="${PATH }/bootstrap/dist/js/bootstrap.min.js"></script>
	<script charset="UTF-8" src="${PATH }/common/js/login-register.js" ></script>
	<script type="text/javascript">
		function logout() {
			if(confirm("您确定要退出吗?")){
				window.location.href = "${PATH }/logout.htm";
			}
		}
	</script>
</head>
<div class="top">
  <div class="wrap clearfix">
    <em class="myfont">&#xe632;</em><span class="songti">服务热线：</span><span class="tel">400-700-1307</span>
    <a href="#" target="_blank" class="ico weibo"></a>
    <a href="#" target="_blank" class="ico weixin"></a>
    <a href="${PATH }/qqlogin.htm" target="_blank" class="ico qq"></a>
		<span class="fr">
			<c:if test="${phone != null and phone !=''}">
				<span style="color: white;">欢迎您：</span>
				<a style="right: 95px;color:#FFFFFF;" href="${PATH }/mycenter.htm" class="username orghover">${phone}</a>
				<a> <a href="javascript:;"  title="退出系统"> 
						<a style="cursor:pointer;color: white;" onclick="logout();" >退出</a>
					</a> 
				</a>
			</c:if>
			<c:if test="${phone == null}">
				<a href="javascript:;" class="loginbtn">登录</a>
				<a href="javascript:;" class="o regbtn">免费注册</a>
			</c:if>
		</span>
  </div>
</div>
<div class="head">
  <div class="wrap pct-h clearfix">
    <a  style = "height: 65px;width: 242px;" href="${PATH }/index.htm" class="logo indent">logo</a>
    <ul class="nav" style = "width: 620px;">
      <li><a href="${PATH }/index.htm">首页</a></li>
      <li><a href="${PATH }/invest.htm">我要投资</a></li>
      <li><a href="${PATH }/borrow.htm">我要借款</a></li>
      <li><a href="${PATH }/about.htm">关于我们</a></li>
      <li><a href="${PATH }/calculator.htm">理财计算器</a></li>
    </ul>
  </div>
</div>
</html>
