<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	pageContext.setAttribute("PATH", request.getContextPath());
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ include file="../common/head.jsp" %>
<link href="${PATH }/front/common/css/css.css" rel="stylesheet">
<link href="${PATH }/front/common/images/favicon.ico" rel="SHORTCUT ICON">
<title>兄弟连金融-我要投资</title>
</head>
<body cur="1">
 
<!--main-->
<div class="wrap mt10 clearfix">
  <div class="bg-w pd20 bdr">
    <!--invest-->
    <div class="crumbs" style="margin-bottom:20px;">
    	<span>净值标</span>
    	<c:if test="${phone == null}">
    		<a href="#" class="ico Prompt indent loginbtn">您尚未登录</a>
    	</c:if>
    </div>
    <p class="f14">每天固定时间发布新项目，首次投资可前往“<span class="o">净值标</span>”投资新手专享项目，抢债权可前往“<span class="o">转让区</span>”</p>
  </div> 
  
  <div class="invest mt20 clearfix">
    <div class="item mark bdr">
      <div class="bd">
        <div class="title"><em class="ico"></em>净值标</div>
        <ul class="list">
          <li>一次性加入，省去每天投资烦恼</li>
          <li>多种期限可选，满足不同流动性需求</li>
          <li class="o">每月返还收益，到期返还本金</li>
          <li>1000元即可加入，期限内可随时赎回</li>
        </ul>
        <a href="${PATH }/invest-list.htm" class="ico more">查看更多</a>
      </div>
      <div class="bottom">97,781人已加入，完成4,252,686,000元投资额</div>
    </div>
    <div class="item Credit mid bdr">
      <div class="lj indent">ico</div>
      <div class="lj lj_l indent">ico</div>
      <div class="bd">
        <div class="title"><em class="ico"></em>信用标</div>
        <ul class="list">
          <li>享受每天自主投资乐趣</li>
          <li>年化收益率可达13.24%，是银行的30倍</li>
          <li class="o">每月还本付息，月月都有现金流</li>
          <li>50元即可体验，期限内可随时赎回</li>
        </ul>
        <a href="${PATH }/invest-list.htm" class="ico more">查看更多</a>
      </div>
      <div class="bottom">97,781人已加入，完成4,252,686,000元投资额</div>
    </div>
    <div class="item claims bdr">
      <div class="bd">
        <div class="title"><em class="ico"></em>债权转让</div>
        <ul class="list">
          <li>一次性加入，省去每天投资烦恼</li>
          <li>多种期限可选，满足不同流动性需求</li>
          <li class="o">每月返还收益，到期返还本金</li>
          <li>1000元即可加入，期限内可随时赎回</li>
        </ul>
        <a href="${PATH }/invest-list.htm" class="ico more">查看更多</a>
      </div>
      <div class="bottom">97,781人已加入，完成4,252,686,000元投资额</div>
    </div>
  </div>
  
  <div class="ad img mt20"><img src="${PATH }/front/common/images/ad.jpg"></div>
   
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