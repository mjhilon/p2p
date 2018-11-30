<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ include file="../common/head.jsp" %>
<link href="${PATH }/front/common/css/css.css" rel="stylesheet">
<link href="${PATH }/front/common/images/favicon.ico" rel="SHORTCUT ICON">
<title>金融借贷-我要充值</title>
</head>
<body>
 
<!--main-->
<div class="wrap mt10 clearfix">
  <div class="aside fl">
    <!--side-nav-->
    <a href="${PATH }/mycenter.htm" class="member-aside-title"><em class="myfont">&#xe627;</em>帐户中心</a>
     <ul class="side-nav f14 bdr">
				<li><a href="${PATH }/asset-Statistics.htm">资产统计</a></li>
				<li class="active"><a href="${PATH }/recharge.htm">我要充值</a></li>
				<li><a href="${PATH }/withdrawals.htm">我要提现</a></li>
				<li><a href="${PATH }/bank-Card.htm">银行卡管理</a></li>
				<li><a href="${PATH }/record.htm">交易记录</a></li>
				<li><a href="${PATH }/my-investment.htm">我的投资</a></li>
				<li><a href="${PATH }/loan.htm">我的借款</a></li>
				<li><a href="${PATH }/infomation.htm">站内信息</a></li>
				<li><a href="${PATH }/safe.htm">安全设置</a></li>
				<li><a href="${PATH }/recommend.htm">推荐好友</a></li>
	</ul>
        
  </div>
  
  <div class="section fr">
    <!--recharge-->
    <div class="pd20 bg-w mt10 bdr">
      <div class="crumbs"><span>我要充值</span></div>
      
      <div class="rechargebox">
        <div class="banklist clearfix">
          <a href="javascript:;" class="img"><img src="${PATH }/front/common/images/bank1.jpg"></a>
          <a href="javascript:;" class="img"><img src="${PATH }/front/common/images/bank2.jpg"></a>
          <a href="javascript:;" class="img"><img src="${PATH }/front/common/images/bank3.jpg"></a>
          <a href="javascript:;" class="img"><img src="${PATH }/front/common/images/bank4.jpg"></a>
          <a href="javascript:;" class="img"><img src="${PATH }/front/common/images/bank5.jpg"></a>
          <a href="javascript:;" class="img"><img src="${PATH }/front/common/images/bank6.jpg"></a>
          <a href="#">选择其他银行</a>
        </div>
         
        <table class="recharge-tab">
          <tr>
            <td width="140" class="tr">账户余额：</td>
            <td><span class="o">50.59</span> 元</td>
          </tr>
          <tr>
            <td class="tr">充值金额：</td>
            <td><input type="text" name="" value="" > 元</td>
          </tr>
          <tr>
            <td class="tr">验证码：</td>
            <td><input type="text" name="" value="" class="code" maxlength="4" > <img src="upload/img13.jpg"></td>
          </tr>
          <tr>
            <td></td>
            <td>
              <p class="f12"><input name="" type="checkbox" value="" checked > 本人已阅读，并确认下方重要提示信息</p>
              <p class="mt10"><button type="button" class="button ico Bid">充值</button></p>
            </td>
          </tr>
        </table>
      
        <div class="Tips mt40">
          <div class="hd">温馨提示</div>
          1、您的账户资金将由第三方平台托管。<br>
          2、为了您的资金安全，请您在充值前完成手机绑定，身份认证及支付密码设置。<br>
          3、十七金融严禁信用卡充值、套现等行为，一经发现将予以处罚，包括但不限于：限制收款、冻结账户、永久停止服务，并会影响银行征信记录。<br>
          4、充值过程遇到问题，请联系客服，400-601-6629
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