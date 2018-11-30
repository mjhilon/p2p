<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ include file="../common/head.jsp" %>
<link href="${PATH }/front/common/css/css.css" rel="stylesheet">
<link href="${PATH }/front/common/images/favicon.ico" rel="SHORTCUT ICON">
<title>金融借贷-安全设置</title>
</head>
<body>
 
<!--main-->
<div class="wrap mt10 clearfix">
  <div class="aside fl">
    <!--side-nav-->
    <a href="${PATH }/mycenter.htm" class="member-aside-title"><em class="myfont">&#xe627;</em>帐户中心</a>
    <ul class="side-nav f14 bdr">
				<li><a href="${PATH }/asset-Statistics.htm">资产统计</a></li>
				<li><a href="${PATH }/recharge.htm">我要充值</a></li>
				<li><a href="${PATH }/withdrawals.htm">我要提现</a></li>
				<li><a href="${PATH }/bank-Card.htm">银行卡管理</a></li>
				<li><a href="${PATH }/record.htm">交易记录</a></li>
				<li><a href="${PATH }/my-investment.htm">我的投资</a></li>
				<li><a href="${PATH }/loan.htm">我的借款</a></li>
				<li><a href="${PATH }/infomation.htm">站内信息</a></li>
				<li class="active"><a href="${PATH }/safe.htm">安全设置</a></li>
				<li><a href="${PATH }/recommend.htm">推荐好友</a></li>
		</ul>
        
  </div>
  
  <div class="section fr">
    <!--Security Settings-->
    <div class="pd20 bg-w mt10 bdr">
      <div class="crumbs"><span>安全设置</span></div>
      <div class="safe">
        <table class="safe-tab">
          <tr>
            <th>登录密码：</th>
            <td>保障账户安全，建议您定期更换密码</td>
            <td class="bg"><em class="icon done"></em>已经设置</td>
            <td><a href="#">修改</a></td>
          </tr>
          <tr>
            <th>交易密码：</th>
            <td>保障资金安全，建议您交易密码区别于登录密码</td>
            <td class="bg"><em class="icon no"></em>未修改</td>
            <td><a href="#">修改</a>|<a href="#">找回</a></td>
          </tr>
          <tr>
            <th>手机号码：</th>
            <td>保障账户与资金安全，是您在十七金融重要的身份凭证</td>
            <td class="bg"><em class="icon done"></em>已经设置</td>
            <td>183****2953  <a href="#">修改</a></td>
          </tr>
          <tr>
            <th>实名认证：</th>
            <td>保障账户安全，只有通过实名认证，才能充值投资、申请贷款</td>
            <td class="bg"><em class="icon done"></em>已经认证</td>
            <td>2********************2</td>
          </tr>
          <tr>
            <th>银行卡信息：</th>
            <td>保障资金安全，只有绑定银行卡，才能提现</td>
            <td class="bg"><em class="icon no"></em>未设置</td>
            <td><a href="#">绑定</a></td>
          </tr>
          <tr>
            <th>安全保护问题：</th>
            <td>保障隐私安全，也是修改个人信息、快速找会密码的重要途径。</td>
            <td class="bg"><em class="icon no"></em>未设置</td>
            <td><a href="#">立即设置</a></td>
          </tr>
          <tr>
            <th>电子邮箱：</th>
            <td>邮件接收账户通知，及时了解账户信息变动情况</td>
            <td class="bg"><em class="icon no"></em>未设置</td>
            <td><a href="#">绑定</a></td>
          </tr>
          <tr class="last">
            <th>登录保护：</th>
            <td>开通手机验证的二次保护功能，有效的保护您的账户安全。</td>
            <td class="bg"><em class="icon done"></em>已设置</td>
            <td><a href="#">修改</a></td>
          </tr>
        </table>
      </div>    
      
    </div>
    
  </div>
  
</div>

 <script src="${PATH }/front/common/js/jquery.js"></script>
	<script src="${PATH }/front/common/js/Action.js"></script>
	<script src="${PATH }/front/common/js/waste.js"></script>
	<script src="${PATH }/front/common/js/banner.js"></script>
	<script src="${PATH }/front/common/js/jQuery-jcMarquee.js"></script>
	<!--foot-->
	<%@ include file="../common/foot.jsp" %>
	<%@ include file="../common/loginRegist.jsp" %>
	
	
<script>
$(function(){
    $('#Marquee_x').jcMarquee({ 'marquee':'x','margin_right':'10px','speed':20 });	
	$(".loginbtn").click(function(){
		$(".Pop-up").show();
		$(".pop-bd").slideDown(500);
		$("#form2").hide().siblings("#form1").show();
	});
	$(".regbtn").click(function(){
		$(".Pop-up").show();
		$(".pop-bd").slideDown(500);
		$("#form1").hide().siblings("#form2").show();
	});
	$("#btnreg").click(function(){$(this).parents("#form1").hide().siblings("#form2").show();})
	$("#btnlogin").click(function(){$(this).parents("#form2").hide().siblings("#form1").show();})
	$(".close").click(function(){$(this).parents(".Pop-up").hide().find(".pop-bd").hide()});
	
	$(".form .form-control").each(function(){
		var thisVal=$(this).val();
		if(thisVal!=""){
			$(this).siblings("span").hide();
		}
		else{
			$(this).siblings("span").show();
		}
		$(this).focus(function(){
			$(this).siblings("span").hide().parents("label").css("z-index","10009").siblings("label").css("z-index","10008");
		}).blur(function(){
			var val=$(this).val();
			if(val!=""){
				$(this).siblings("span").hide().siblings("label").css("z-index","10008");
				}
			else{
				$(this).siblings("span").show().siblings("label").css("z-index","10008");
			} 
		});
	});
});
</script>
</body>
</html>