<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <%@ include file="../common/head.jsp" %>
<link href="${PATH }/front/common/css/css.css" rel="stylesheet">
<link href="${PATH }/front/common/images/favicon.ico" rel="SHORTCUT ICON">
<title>兄弟连金融-关于我们</title>
</head>


<body cur="3">
 
<!--main-->
<div class="wrap mt10 clearfix">
  <div class="aside fl">
    <!--side-nav-->
    <ul class="side-nav f14 bdr">
      <li class="active"><a href="${PATH }/about.htm">关于我们</a></li>
      <li><a href="${PATH }/qualification.htm">公司资质</a></li>
      <li><a href="${PATH }/news.htm">网站公告</a></li>
      <li><a href="${PATH }/reports.htm">媒体报道</a></li>
      <li><a href="${PATH }/partners.htm">合作伙伴</a></li>
      <!-- <li><a href="/about.htm">安全保障</a></li>
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
      <div class="crumbs"><span>关于我们</span></div>
      <div class="container clearfix">
        <img src="${PATH}/front/common/upload/img8.jpg">
        <p class="f16"><strong>兄弟连金融——服务于北京行业的内部“银行”</strong></p>
        <p> &nbsp;&nbsp;&nbsp;&nbsp;兄弟连教育隶属于易第优（北京）教育咨询股份有限公司，成立于2006年（以下简称兄弟连）。专注于IT技术培训，是国内专业的<br>
        PHP/LAMP技术专业培训学校。兄弟连现已开设PHP、UI/UE、HTML5、Java/大数据、Java/Android、Linux/云计算、全栈工程师<br>等众多学科，累计培养数万名学员。 

        
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