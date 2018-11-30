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
<title>兄弟连金融-投标</title>

</head>
<body cur="1"> 
  
<!--main-->
<div class="wrap mt10">
  <div class="bg-w bdr">
    <div class="pd20">
      <!--invest-->
      <div class="crumbs clearfix" style="margin-bottom:20px;">
      	<a href="${PATH }/invest.htm" class="ico back">返回</a>
      	<span>我要投资</span>
      	<a href="#" class="ico Prompt loginbtn indent">您尚未登录</a>
      	<span class="Yesterday-turnover">昨日成交金额：<b class="o">13,601,945.00 </b>元</span></div>
    </div>
    <table class="invest-list-tab">
      <tr>
        <th width="120">信用等级</th>
        <th width="280">项目名称</th>
        <th width="135">借款年利率</th>
        <th width="100">期限</th>
        <th width="130">投资金额</th>
        <th width="195">进度</th>
        <th class="Statistics">共<span class="o">329</span>个标</th>
      </tr>
      <tr>
        <td><span class="ico lebel_B indent">B</span></td>
        <td class="tl">阿里巴巴实力大卖家，二次借……</td>
        <td class="o">12% </td>
        <td>90天</td>
        <td>16,000.00元</td>
        <td class="tl"><span class="process"><span class="process-bar" style="width:75%"></span></span>75%</td>
        <td><a href="${PATH }/invest-show.htm" class="button ico Bid">投标</a></td>
      </tr>
      <tr>
        <td><span class="ico lebel_B indent">B</span></td>
        <td class="tl">阿里巴巴实力大卖家，二次借……</td>
        <td class="o">12% </td>
        <td>90天</td>
        <td>16,000.00元</td>
        <td class="tl"><span class="process"><span class="process-bar" style="width:75%"></span></span>75%</td>
        <td><a href="${PATH }/invest-show.htm" class="button ico Bid">投标</a></td>
      </tr>
      <tr>
        <td><span class="ico lebel_B indent">B</span></td>
        <td class="tl">阿里巴巴实力大卖家，二次借……</td>
        <td class="o">12% </td>
        <td>90天</td>
        <td>16,000.00元</td>
        <td class="tl"><span class="process"><span class="process-bar" style="width:75%"></span></span>75%</td>
        <td><a href="${PATH }/invest-show.htm" class="button ico Bid">投标</a></td>
      </tr>
      <tr>
        <td><span class="ico lebel_B indent">B</span></td>
        <td class="tl">阿里巴巴实力大卖家，二次借……</td>
        <td class="o">12% </td>
        <td>90天</td>
        <td>16,000.00元</td>
        <td class="tl"><span class="process"><span class="process-bar" style="width:75%"></span></span>75%</td>
        <td><a href="${PATH }/invest-show.htm" class="button ico Bid">投标</a></td>
      </tr>
      <tr>
        <td><span class="ico lebel_A indent">A</span></td>
        <td class="tl">阿里巴巴实力大卖家，二次借……</td>
        <td class="o">12% </td>
        <td>90天</td>
        <td>16,000.00元</td>
        <td class="tl"><span class="process"><span class="process-bar" style="width:75%"></span></span>75%</td>
        <td><a href="${PATH }/invest-show.htm" class="button ico Bid">投标</a></td>
      </tr>
      <tr>
        <td><span class="ico lebel_A indent">A</span></td>
        <td class="tl">阿里巴巴实力大卖家，二次借……</td>
        <td class="o">12% </td>
        <td>90天</td>
        <td>16,000.00元</td>
        <td class="tl"><span class="process"><span class="process-bar" style="width:75%"></span></span>75%</td>
        <td><a href="${PATH }/invest-show.htm" class="button ico Bid">投标</a></td>
      </tr>
      <tr>
        <td><span class="ico lebel_A indent">A</span></td>
        <td class="tl">阿里巴巴实力大卖家，二次借……</td>
        <td class="o">12% </td>
        <td>90天</td>
        <td>16,000.00元</td>
        <td class="tl"><span class="process"><span class="process-bar" style="width:75%"></span></span>75%</td>
        <td><a href="${PATH }/invest-show.htm" class="button ico Bid">投标</a></td>
      </tr>
      <tr>
        <td><span class="ico lebel_A indent">A</span></td>
        <td class="tl">阿里巴巴实力大卖家，二次借……</td>
        <td class="o">12% </td>
        <td>90天</td>
        <td>16,000.00元</td>
        <td class="tl"><span class="process"><span class="process-bar" style="width:75%"></span></span>75%</td>
        <td><a href="${PATH }/invest-show.htm" class="button ico Bid">投标</a></td>
      </tr>
      <tr>
        <td><span class="ico lebel_A indent">A</span></td>
        <td class="tl">阿里巴巴实力大卖家，二次借……</td>
        <td class="o">12% </td>
        <td>90天</td>
        <td>16,000.00元</td>
        <td class="tl"><span class="process"><span class="process-bar" style="width:75%"></span></span>75%</td>
        <td><a href="${PATH }/invest-show.htm" class="button ico Bid">投标</a></td>
      </tr>
    </table>
    
    <!--Pagination-->
    <div class="Pagination pd20 tr clearfix"><a href="#" class="prev"><em></em>上一页</a><span>1</span><a href="#">2</a><a href="#">3</a><a href="#">4</a>...<a href="#">23</a><a href="#" class="next">下一页<em></em></a></div> 
  </div>
  
  <div class="ad img mt20"><img src="${PATH }/front/common/images/ad.jpg"></div>
   
</div>

<script src="${PATH }/front/common/js/jquery.js"></script>
<script src="${PATH }/front/common/js/Action.js"></script>
<script src="${PATH }/front/common/js/waste.js"></script>
<script src="${PATH }/front/common/js/banner.js"></script>
<script src="${PATH }/front/common/js/jQuery-jcMarquee.js"></script>
<script src="${PATH }/front/common/js/index.js"></script>

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