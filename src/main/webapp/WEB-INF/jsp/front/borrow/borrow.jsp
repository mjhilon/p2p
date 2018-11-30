<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ include file="../common/head.jsp" %>
<meta name="keywords" content="兄弟连|金融|平台|演示">
<meta name="description" content="兄弟连金融">
<meta name="author" content="兄弟连金融">
<link href="${PATH }/front/common/css/css.css" rel="stylesheet">
<link href="favicon.ico" rel="SHORTCUT ICON">
<title>兄弟连金融-我要借款</title>
</head>
<body cur="2">

<!--main-->
<div class="wrap mt10">
  <div class="tc"><img src="${PATH}/front/common/images/step.png"></div>
  <div class="clearfix">
    <!--img-->
    <div class="img loans-img bdr fl">
      <div class="lj indent">ico</div>
      <img src="${PATH}/front/common/images/img6.jpg">
    </div>
    <div class="formbox bdr fr">
      <table class="productForm">
        <tr>
          <th>居住城市</th>
          <td>
            <div class="citySelect">
              <dl id="js_city">
                <dt><i></i><span class="sp">请选择</span></dt>
                <dd style="display:none;"></dd>
              </dl>
            </div>
            <div class="tishi"><span id="cityError" class="prompt_2 hidden"></span></div>
          </td>
        </tr>
        <tr>
          <th>真实姓名</th>
          <td>
          	<label class="touzi01">
              <input type="text" id="realName" name="realName" class="input_all input_1" maxlength="15"/>
              <span>请输入真实姓名</span>
            </label>
            <div class="tishi"><span id="realNameError" class="prompt_2 hidden"></span></div>
          </td>
        </tr>
        <tr>
          <th>移动电话</th>
          <td>
            <label class="touzi01">
              <input type="text" id="mobile" name="mobile" class="input_all input_1" maxlength="11"/>
              <span>请输入11位手机号</span>
            </label>
            <div class="tishi"><span id="mobileError" class="prompt_2 hidden"></span></div>
          </td>
        </tr>
        <tr>
          <th>称谓</th>
          <td class="hight">
            <label><input name="gender" type="radio" value="0" checked>先生</label>
            <label><input name="gender" type="radio" value ="1">女士</label>
          </td>
        </tr>
        <tr>
          <th>出生日期</th>
          <td>
            <label class="touzi01">
              <input type="text" readonly id="birthday" name="birthday" class="input_all i_time input_1" style="z-index:1000;position:relative; width:227px"/>
              <span>yyyy-mm-dd</span>
            </label>
            <div class="tishi"><span id="birthdayError" class="prompt_2 hidden"></span></div>
          </td>
        </tr>
        <tr>
          <th>借款金额</th>
          <td>
            <label class="touzi01">
              <input type="text" id="loanAmount" name="amount" class="input_all i_yuan input_1" maxlength="7"/>
              <span>3万-30万</span>
            </label>
            <div class="tishi"><span id="amountError" class="prompt_2 hidden"></span></div>
          </td>
        </tr>
        <tr>
          <th>借款期限</th>
          <td>
            <select id="js_dueId" name="dueId" class="select1">
              <option value="1272947783684640">12个月</option>
              <option value="1272947783684641">18个月</option>
              <option value="1272947783684642">24个月</option>
            </select>
            <div class="tishi"></div>
          </td>
        </tr>
        <tr>
          <th>月均收入</th>
          <td>
            <label class="touzi01">
              <input type="text" id="income" name="income" class="input_all i_yuan input_1" maxlength="9"/>
              <span>请填写月收入金额</span>
            </label>
            <div class="tishi"><span id="incomeError" class="prompt_2 hidden"></span></div>
          </td>
        </tr>
        <tr>
          <th></th>
          <td><input type="button" id="save" value="立即申请" class="btn btnSize_6 btn_orange" /></td>
        </tr>
      </table>
    </div>
  </div>
  
  <div class="detailsBox mt20 clearfix">
    <div class="item first">
       <div class="title">申请资格</div>
       <ul class=" mt10 cicle">
         <li>年龄23周岁-60周岁的中国大陆公民（港、澳、台除外）</li>
         <li>企业或商户经营时间满1年及以上</li>
         <li>企业或商户月均流水须3万以上</li>
       </ul>
    </div>
    <div class="item">
       <div class="title">额度期限</div>
       <ul class=" mt10 cicle">
         <li>借款额度：3万-30万元</li>
         <li>借款期限：12、18、24个月</li>
         <li>还款方式：等额本息，每月还款</li>
       </ul>
    </div>
    <div class="item bd0">
       <div class="title">所需材料</div>
       <ul class=" mt10 cicle">
         <li>申请人二代身份证</li>
         <li>企业/商户经营场所证明材料</li>
         <li>近6个月对公或对私银行流水或POS交易流水</li>
       </ul>
    </div>
  </div>
</div>

<script src="${PATH }/front/common/js/jquery.js"></script>
<script src="${PATH }/front/common/js/Action.js"></script>
<script src="${PATH }/front/common/js/waste.js"></script>
<script src="${PATH }/front/common/js/banner.js"></script>
<script src="${PATH }/front/common/js/jQuery-jcMarquee.js"></script>



<script type="text/javascript" src="js/VisitorAPI-1.2.1-min.js"></script>
<script type="text/javascript" src="js/AppMeasurement-1.2.1-min.js"></script>

<!--时间  s-->
<script type="text/javascript" src="js/jquery.ui.datepicker.js"></script>
<link href="css/jquery-ui.css" rel="stylesheet"> 
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script src="js/loanApplyValidate.js?v=2015010618.js" type="text/javascript"></script>
<script src="js/detail.js?v=2015010618.js" type="text/javascript"></script>
<script src="js/netCredit.js?v=2015010618.js" type="text/javascript"></script>
<script src="js/loanApplyCitys.js?v=2015010618.js" type="text/javascript"></script>

<script>
$(function(){
	//--输入框内提示-------------
			$(".touzi01 .input_1").each(function(){
				 var thisVal=$(this).val();
				 if(thisVal!=""){
				   $(this).siblings("span").hide();
				  }else{
				   $(this).siblings("span").show();
				  }
				 $(this).focus(function(){
				   $(this).siblings("span").hide();
				  }).blur(function(){
					var val=$(this).val();
					if(val!=""){
					 $(this).siblings("span").hide();
					}else{
					 $(this).siblings("span").show();
					} 
				  });
				});
})
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