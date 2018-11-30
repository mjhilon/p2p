<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
      </div>
      
      <div class="pd10 clearfix">
        <div class="lbox bdr fl">
          <div class="title">阿里巴巴实力大卖家，二次借款</div>
          <div class="pd20"> 
            <div class="line clearfix">
              <div class="item first">
                融资金额
                <p class="mt30"><span><span class="f30">&yen;</span><span class="o">16,000</span></span></p>
              </div>
              <div class="item second">
                借款年利率
                <p class="mt30"><span>12.<span class="f24">50%</span></span></p>
              </div>
              <div class="item third">
                期限
                <p class="mt30"><span>90<span class="f24">天</span></span></p>
              </div>
            </div>
            <div class="txt mt20">
              <p>每月返还本息<em class="ico Prompt"></em>&yen;1,229.99</p>
              <b>借款用途说明</b> 客户在广西省某国营企业工作，收入稳定，本借款用于资金周转。本借款已通过利信快捷及
北京担保审核并被推荐至兄弟连；推荐方提供全额本息担保。兄弟连于……<!--<a href="#" class="o">[详情]</a>--></div>
          </div>
          
          <div class="line2 tc">
            <div class="item tl"><span class="process"><span class="process-bar" style="width:75%"></span></span>75%</div>
            <div class="item">时间剩余 6天23小时50分</div>
            <div class="item bd0 b o"><em class="ico Guarantee"></em>100%本息担保</div>
          </div>
          
        </div>
        <div class="rbox bdr fr">
          <div class="title clearfix"><span>可投 ¥ 13,537.00</span>投资金额</div>
          <div class="pd20">
            <input type="text" value="请输入50~12150的整数" class="Amount" onFocus="if(this.value=='请输入50~12150的整数'){this.value='';this.style.color='#333'}" onBlur="if(this.value==''){this.value='请输入50~12150的整数';this.style.color='#999'}">元
            <div class="mt10">预期收益 ¥ 13,537.55<br>担保机构：北京担保股份有限公司</div>
            <a href="#" class="button ico btn-Investment">我要投资</a>
            <div class="txt">兄弟连金融及其合作机构将始终秉持客观公正的原则，严控风险，最大程度的尽力确保借入者信息的真实性。</div>
          </div>
        </div>
      </div>
      
    </div>
    
	<ul class="tabbtn clearfix" id="normaltab">
      <li class="current">产品详情</li>
      <li>投资记录<em class="count">157</em></li>
	</ul>
	<div class="tabcon" id="normalcon">
      <div class="sublist Product-Details pd30 clearfix">
        <div class="txt fl">
          <p>借款人自有房产，经营一家装饰行，生意红火，收入较好，现想借款10万资金周转，有房屋抵押。借款人承诺在借款期限届满前还清本息客户在广西省某国营企业工作，收入稳定，本借款用于资金周转。本借款已通过利信快捷及融桥担保审核并被推荐至十七金融；推荐方提供全额本息担保。</p><br>

          <p><b>信用审核记录</b><br>十七金融将以客观、公正、严谨、透明的原则，最大程度地核实借入者信息的真实性，但不保证审核信息100%真实。 如果借入者长期逾期，其提供的信息将被“十七金融”平台公布。</p><br>
          <p><b>信用审核记录</b><br>十七金融将以客观、公正、严谨、透明的原则，最大程度地核实借入者信息的真实性，但不保证审核信息100%真实。 如果借入者长期逾期，其提供的信息将被“十七金融”平台公布。</p>
        </div>
        <div class="Credit-Report fr">
          <dl>
            <dt><a href="#" class="img"><img src="${PATH }/front/common/upload/img6.jpg"></a></dt>
            <dd><a href="#">信用报告</a></dd>
          </dl>
          <dl>
            <dt><a href="#" class="img"><img src="${PATH }/front/common/upload/img6.jpg"></a></dt>
            <dd><a href="#">信用报告</a></dd>
          </dl>
          <dl>
            <dt><a href="#" class="img"><img src="${PATH }/front/common/upload/img6.jpg"></a></dt>
            <dd><a href="#">信用报告</a></dd>
          </dl>
          <dl>
            <dt><a href="#" class="img"><img src="${PATH }/front/common/upload/img6.jpg"></a></dt>
            <dd><a href="#">信用报告</a></dd>
          </dl>
        </div>
      </div>
      <div class="sublist Investment-records pd30 clearfix">
        投资记录
      </div>
	</div>
    
    
  </div>
  
   <div class="ad img mt20"><img src="${PATH }/front/common/images/ad.jpg"></div>
   
</div>

<script src="${PATH }/front/common/js/jquery.js"></script>
<script src="${PATH }/front/common/js/Action.js"></script>
<script src="${PATH }/front/common/js/waste.js"></script>
<script src="${PATH }/front/common/js/banner.js"></script>
<script src="${PATH }/front/common/js/jQuery-jcMarquee.js"></script>
<script src="${PATH }/front/common/js/jquery.tabso_yeso.js"></script>


<script type="text/javascript">
$(document).ready(function($){
	$("#normaltab").tabso({
		cntSelect:"#normalcon",
		tabEvent:"click",
		tabStyle:"normal"
	});
	
});
</script>
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