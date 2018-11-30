<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <%@ include file="../common/head.jsp" %>
<link href="${PATH }/front/common/css/css.css" rel="stylesheet">
<link href="${PATH }/front/common/images/favicon.ico" rel="SHORTCUT ICON">
<title>兄弟连金融-网站公告</title>
</head>
<body cur="3">
 
<!--main-->
<div class="wrap mt10 clearfix">
  <div class="aside fl">
    <!--side-nav-->
     <ul class="side-nav f14 bdr">
      <li><a href="${PATH }/about.htm">关于我们</a></li>
      <li><a href="${PATH }/qualification.htm">公司资质</a></li>
      <li class="active"><a href="${PATH }/news.htm">网站公告</a></li>
      <li><a href="${PATH }/reports.htm">媒体报道</a></li>
      <li><a href="${PATH }/partners.htm">合作伙伴</a></li>
      <!-- <li><a href="/sofapub.htm">安全保障</a></li>
      <li><a href="/about.htm">本金保障</a></li>
      <li><a href="/about.htm">帮助中心</a></li>
      <li><a href="/about.htm">如何投资</a></li>
      <li><a href="/about.htm">如何借款</a></li> -->
    </ul>
      
    <!--ad-->
    <div class="ad img mt10"><a href="#" class="btn-reg"><img src="${PATH}/front/common/upload/img7.jpg"></a></div>
        
  </div>
  
  <div class="section bdr fr">
    <div class="main">
      <!--Site Notice-->
      <div class="crumbs"><span>网站公告</span></div>
      <div class="container clearfix">
        <div class="news-title tc">
          <div class="title">有钱返现超任性——安捷财富“双蛋”大狂欢</div>
          发布时间：2014-08-25        来源：十七金融
        </div>
         
        <img src="${PATH}/front/common/upload/img9.jpg">
        <p>&nbsp;</p>
        <p>&nbsp;&nbsp;&nbsp;&nbsp;安捷财富自成立近五个月以来，受到广大投资人的青睐，网站注册人员数量一路飙升突破30000人，交易量突破一个亿。为了拓展安捷财富在国内的市场，扩大安捷财富的知名度和影响力，为广大投资朋友提供一个安全、可靠的P2P平台，除上海的总公司外，安捷财富在北京、深圳、合肥也分别成立了运营中心。在未来安捷财富将会在各个省份城市成立分公司，同时也欢迎广大投资朋友来我们公司实地考察，你们的支持是我们前进的动力。</p>
        <p>&nbsp;&nbsp;&nbsp;&nbsp;安捷财富有第三方担保机构，诚信保证；第三方支付账号，安全托管；并且有28000000元的风险保证基金；符合IB/TE-315：9002信用管理体系标准GB/CCA9002企业信用评价标准试用条款的要求被评定为AAA级信用企业，是国内金融机构的最高信用等级。并且安捷财富平台总公司控股的公司合肥智朴信息科技有限公司也已在地区性交易中心上市，股权代码为700128。现在安捷财富更是与元宝街P2P平台形成合作关系。</p>
        <p>&nbsp;&nbsp;&nbsp;&nbsp;安捷财富现在出新手标啦，18%高收益，20元起投，参与就有抽奖机会，百分百中奖，最低都可中5元哦，如有疑问，请联系客服，客服QQ ①：321560031，客服QQ ②：785022591，免费咨询热线：400-601-6629 。</p>
        <p>&nbsp;&nbsp;&nbsp;&nbsp;为了让大家在安捷财富注册时方便快捷，小安现在告诉你个小秘密，注册安捷财富时的登陆密码、汇付天下的登陆密码可以设置成一个哦，因汇付天下的登陆密码和交易密码必需不同，所以交易密码要另外设一个。另外在汇付天下提现的银行卡必需要是本人身份证办理的哦，要不然是无法提现的。</p>
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