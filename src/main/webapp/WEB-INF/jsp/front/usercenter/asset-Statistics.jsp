<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ include file="../common/head.jsp" %>
<link href="${PATH }/front/common/css/css.css" rel="stylesheet">
<link href="${PATH }/front/common/images/favicon.ico" rel="SHORTCUT ICON">
<title>金融借贷-账户中心</title>
</head>
<body>
 
<!--main-->
<div class="wrap mt10 clearfix">
  <div class="aside fl">
    <!--side-nav-->
    <a href="${PATH }/mycenter.htm" class="member-aside-title"><em class="myfont">&#xe627;</em>帐户中心</a>
    <ul class="side-nav f14 bdr">
				<li class="active"><a href="${PATH }/asset-Statistics.htm">资产统计</a></li>
				<li><a href="${PATH }/recharge.htm">我要充值</a></li>
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
    <!--Asset Statistics-->
    <div class="pd20 bg-w mt10 bdr">
      <div class="crumbs"><span>资产统计</span></div>
      <div class="Asset-Statistics clearfix">
        <div class="item">
          账户余额
          <h1>0.00元</h1>
        </div>
        <div class="item">
          <a href="#" class="button ico Bid mt5">充值</a>
          <a href="#" class="button ico Repayment mt10">提现</a>
        </div>
        <div class="item">
          资
          产总计
<h1>0.00元</h1>
        </div>
        <div class="item">
          冻结资金
          <h1>0.00元</h1>
        </div>
        <div class="item">
          已收总额
          <h1>0.00元</h1>
        </div>
      </div>
    </div>
    
    <!--My investment-->
    <div class="pd20 bg-w mt10 bdr">
      <div class="crumbs"><span>我的投资</span></div>
      <div class="My-investment clearfix">
        <div class="item"><div class="box clearfix"><span class="money">500.00元</span><em class="invest">投</em>总投资金额</div></div>
        <div class="item"><div class="box clearfix"><span class="money">28.47元</span><em class="invest">投</em>总投收益</div></div>
        <div class="item"><div class="box clearfix"><span class="money">400.01元</span><em class="invest">投</em>待收本金</div></div>
        <div class="item"><div class="box clearfix"><span class="money">15.77元</span><em class="invest">投</em>待收收益</div></div>
      </div>
    </div>
    
    <!--My loan-->
    <div class="pd20 bg-w mt10 bdr">
      <div class="crumbs"><span>我的借款</span></div>
      <div class="My-investment My-loan clearfix">
        <div class="item"><div class="box clearfix"><span class="money">0.00元</span><em class="invest">债</em>借入资金额</div></div>
        <div class="item"><div class="box clearfix"><span class="money">0.00元</span><em class="invest">债</em>已还款总额</div></div>
        <div class="item"><div class="box clearfix"><span class="money">0.00元</span><em class="invest">债</em>未还款总额</div></div>
        <div class="item"><div class="box clearfix"><span class="money">0.00元</span><em class="invest">债</em>最近应还款金额</div></div>
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