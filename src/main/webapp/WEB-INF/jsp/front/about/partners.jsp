<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <%@ include file="../common/head.jsp" %>
<link href="${PATH }/front/common/css/css.css" rel="stylesheet">
<link href="${PATH }/front/common/images/favicon.ico" rel="SHORTCUT ICON">
<title>兄弟连金融-合作伙伴</title>
</head>
<body cur="3">
 
<!--main-->
<div class="wrap mt10 clearfix">
  <div class="aside fl">
    <!--side-nav-->
     <ul class="side-nav f14 bdr">
      <li><a href="${PATH }/about.htm">关于我们</a></li>
      <li><a href="${PATH }/qualification.htm">公司资质</a></li>
      <li><a href="${PATH }/news.htm">网站公告</a></li>
      <li><a href="${PATH }/reports.htm">媒体报道</a></li>
      <li class="active"><a href="${PATH }/partners.htm">合作伙伴</a></li>
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
      <!--partners-->
      <div class="crumbs"><span>合作伙伴</span></div>
      <div class="container partners clearfix">
        <div class="item">
          <div class="title">合肥启东商贸有限公司</div>
          <div class="txt">启东商贸公司成立于2001年，2007年6月以前一直以个人的名义经营服装销售，2007年6月注册“合肥启东商贸公司”。2005年经爱<br>登堡（中国）有限公司授权开始拥有爱登堡品牌安徽地区的一级代理资格，在安徽省进行“爱登堡服饰”系列产品的批发及销售，爱<br>登堡服饰主要分为商务系列、城市生活系列、旅游运动系列，以25—45岁都市白领男性为主要消费群体。</div>
        </div>
        <div class="item">
          <div class="title">合肥天锦商贸有限公司</div>
          <div class="txt">合肥天锦商贸有限公司位于胜利路万事达广场３幢１０３室。公司成立了以市场为导向，以质量为标准，以客户满意为宗旨的生产、<br>销售的服务体系。公司除了有完善的产品解决方案外，还建立了一支在全国范围内完整的营销团队和执行团队。公司凭借产品优越的<br>性能价格比和完善的售后服务在同行业中脱颖而出。“让每一位客户满意”是我们公司全体同仁始终不变的宗旨。</div>
        </div>
        <div class="item">
          <div class="title">安徽辰逸商贸有限公司</div>
          <div class="txt">辰逸商贸有限公司，创立于1994年底，是一家具有独特品牌文化理念、先进研发设计中心、现代化生产基地、为满足中国盛年女性不<br>同生活方式及多样化着装风格的需求，赢家服饰与欧洲知名设计师联手，分别创立、引进合作及引进代理了两个知名女装品牌：包括<br>“自信干练”SIWEINASI(西纳维思）品牌、“时尚大气”JIARENYUAN（佳人苑）品牌。适合风格各异的盛年女性出席不同场合穿着<br>，满足她们不同的审美情趣。</div>
        </div>
        <div class="item">
          <div class="title">安徽博奥体育用品有限公司</div>
          <div class="txt">安徽博奥体育用品有限公司创立于2007年9月22日，是以原安徽特步鞋服销售业务为基础，经过整合重组而成。2009年12月经合肥市<br>瑶海区人民政府招商引资入驻瑶海工业园纬D路7号博奥大厦。公司拥有特步（中国）有限公司旗下“特步”运动品牌在安徽的总代理<br>权，全面运作“特步””品牌在安徽区域内的推广、开发、销售和维护工作。</div>
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