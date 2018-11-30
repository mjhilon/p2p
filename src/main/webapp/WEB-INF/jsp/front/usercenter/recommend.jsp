<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ include file="../common/head.jsp" %>
<link href="${PATH }/front/common/css/css.css" rel="stylesheet">
<link href="${PATH }/front/common/images/favicon.ico" rel="SHORTCUT ICON">
<title>金融借贷-推荐好友</title>
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
				<li><a href="${PATH }/safe.htm">安全设置</a></li>
				<li class="active"><a href="${PATH }/recommend.htm">推荐好友</a></li>
		</ul>
        
  </div>
  
  <div class="section fr">
    <!--My loan-->
    <div class="pd20 bg-w mt10 bdr">
      <div class="crumbs"><span>推荐好友</span></div>
      <div class="membox">
      <!--Recommend to a friend-->
      <div class="Recommend-bd">
        <div class="ico Benefit indent">惠</div>
        <div class="songti">
          <p>邀请一人成功注册并投资可得到返利10元（10元/人次）</p>
          <p>·发送邀请码给好友，请他在注册投资时输入邀请码，邀请码可反复使用</p>
          <p>·好友投资新手标，推荐人不享受推荐奖励；</p>
          <p>·您还可以通过邀请链接或者手机推荐码获得返利（两种方式只记一次返利）；</p>
        </div>
        <table class="Recommend-tab mt15">
          <tr>
            <td width="77">邀请码</td>
            <td width="143">您的返利</td>
            <td>链接</td>
          </tr>
          <tr>
            <td><b class="black">gaealv</b></td>
            <td>0元</td>
            <td><a href="#" target="_blank">http://www.haoinvest.com/?cn=gaealv</a></td>
          </tr>
        </table>
        <div class="mt10 black">
          输入您好友的手机号码 <input type="text" name="" value="" > <button type="button" class="button btn-send" value="">发送推荐码</button>
        </div>
      </div>
      
      <div class="mt20" style="padding-bottom:100px;">
        <b class="black f16">邀请记录：您已累计邀请 1 人，获取返利 0 元</b>
        <table class="Record-tab mt20">
          <tr><th width="170">用户ID</th><th width="140">用户名</th><th width="140">真实姓名</th><th width="170">注册时间</th><th>已投资金额</th></tr>
          <tr><td>6535</td><td>13611621989</td><td></td><td class="o">2013-01-06</td><td>0.00元</td></tr>
        </table>
          
      </div>
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