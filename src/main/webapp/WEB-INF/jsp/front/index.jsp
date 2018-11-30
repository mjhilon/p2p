<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@ include file="./common/head.jsp" %>
<link href="${PATH }/front/common/images/favicon.ico" rel="SHORTCUT ICON">
<link href="${PATH }/front/common/css/css.css" rel="stylesheet">


<title>金融借贷首页</title>
</head>
<body>
 <!-- banner图轮播 -->
	<div id="myCarousel" class="carousel slide">
		<!-- 轮播（Carousel）指标 -->
		<ol class="carousel-indicators">
		</ol>
		<!-- 轮播（Carousel）项目 -->
		<div class="carousel-inner">
		</div>
		<!-- 轮播（Carousel）导航 -->
		<a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
		<a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
	</div>

	<!--Platform-data-->
	<div class="Platform-data">
	  <div class="hd">
	    <div class="wrap clearfix">
	      <div class="title fl">平台数据<em class="gt indent">三角形</em></div>
	      <div class="data fr">
	        <div class="item"><span class="count">${sizeBm}</span>人实现借款</div>
	        <div class="item"><span class="count">${sizeTm}</span>人成功投资</div>
	        <div class="item">累计收益：<span class="count">${tm*0.3}</span> 元</div>
	        <div class="item">累计投资金额：<span class="count">${tm}</span> 元</div>
	      </div>
	    </div>
	  </div>
	  <div class="wrap bd clearfix">
	    <div class="item">
	      <div class="ico-data data1 indent">高收益灵活投资</div>
	      <b class="f14">高收益灵活投资</b><br>50元起投<br>预期12%-14%年化收益率<br>投资90天后即可债权转让
	    </div>
	    <div class="item">
	      <div class="ico-data data2 indent">一站式借款服务</div>
	      <b class="f14">一站式借款服务</b><br>无抵押信用贷款<br>24小时放款<br>提前还款可减免服务费
	    </div>
	    <div class="item">
	      <div class="ico-data data3 indent">全方位安全保障</div>
	      <b class="f14">全方位安全保障</b><br>5道安全防线<br>100%本金保障计划<br>专业的第三方资金托管
	    </div>
	    <div class="item">
	      <div class="ico-data data4 indent">兄弟连实力</div>
	      <b class="f14">兄弟连实力</b><br>十七家子公司<br>小额贷款公司<br>担保公司
	    </div>
	  </div>
	</div>

<!--main-->
<div class="wrap mt10 clearfix">
  <div class="indexsection fl">
    <!--净值标-->
    <div class="Recommendation bdr">
      <div class="ico Rec indent">推荐</div>
      <div class="hd"><b class="Net-mark">债权转让</b>投资转让项目获得更短的期限、更高的收益率</div>
      
      <div class="bd clearfix">
        <div class="item">
          <div class="txt fl">
            <h2>真我品牌公司商户进货<em class="ico">奖</em></h2>
            <h5>借款担保方-北京品牌管理公司</h5>
            <div class="title mt40 clearfix"><span class="fr">投资期限</span>预期年化</div>
            <div class="con mt10 clearfix"><span class="fr">1个月</span><span class="o">8<span class="f18">%</span></span></div>
          </div>
          <div class="progress fl">
            <div class="ui-progressbar-mid" style="background:url(${PATH }/front/common/images/100.png) no-repeat center;">100%</div>
            <a href="${PATH }/invest-list.htm" class="ico btn-Tender">投标</a>
            剩余金额 70,000元
          </div>
        </div>
        <div class="item">
          <div class="txt fl">
            <h2>秦坤商业公司商户进货<em class="ico">奖</em></h2>
            <h5>借款担保方-北京商贸公司</h5>
            <div class="title mt40 clearfix"><span class="fr">投资期限</span>预期年化</div>
            <div class="con mt10 clearfix"><span class="fr">3个月</span><span class="o">10.8<span class="f18">%</span></span></div>
          </div>
          <div class="progress fl">
            <div class="ui-progressbar-mid" style="background:url(${PATH }/front/common/images/75.png) no-repeat center;">75%</div>
            <a href="${PATH }/invest-list.htm" class="ico btn-Tender">投标</a>
            剩余金额 250,000元
          </div>
        </div>
        <div class="item">
          <div class="txt fl">
            <h2>珍珠商贸公司商户进货<em class="ico">奖</em></h2>
            <h5>借款担保方-北京服饰公司</h5>
            <div class="title mt40 clearfix"><span class="fr">投资期限</span>预期年化</div>
            <div class="con mt10 clearfix"><span class="fr">6个月</span><span class="o">12.8<span class="f18">%</span></span></div>
          </div>
          <div class="progress fl">
            <div class="ui-progressbar-mid" style="background:url(${PATH }/front/common/images/50.png) no-repeat center;">50%</div>
            <a href="${PATH }/invest-list.htm" class="ico btn-Tender">投标</a>
            剩余金额 250,000元
          </div>
        </div>
        <div class="item">
          <div class="txt fl">
            <h2>珍珠商贸公司商户进货<em class="ico">奖</em></h2>
            <h5>借款担保方-北京服饰公司</h5>
            <div class="title mt40 clearfix"><span class="fr">投资期限</span>预期年化</div>
            <div class="con mt10 clearfix"><span class="fr">6个月</span><span class="o">12.8<span class="f18">%</span></span></div>
          </div>
          <div class="progress fl">
            <div class="ui-progressbar-mid" style="background:url(${PATH }/front/common/images/50.png) no-repeat center;">50%</div>
            <a href="${PATH }/invest-list.htm" class="ico btn-Tender">投标</a>
            剩余金额 250,000元
          </div>
        </div>
      </div>
      
    </div>
    
    <!--信用标-->
    <div class="Recommendation mt10 bdr">
      <div class="hd clearfix"><a href="#" class="more">更多&gt;&gt;</a><b class="Net-mark">信用标</b>按月付息 到期还本；1000元起投；工作日<b class="f14 o">10:30、14:30、17:30、20:00</b> 更新，周末与其余时间随机</div>
      <dl>
        <dt class="clearfix"><a href="#" class="button ico Repayment">还款中</a><em class="ico Guarantee">保</em>北京旅游珠宝商户进货<span class="Guarantee-Agency">  担保机构：北京担保股份有限公司</span></dt>
        <dd>
          <span class="APR-loan">借款年利率  <b class="o">10%</b> </span><span class="time">期限  90天</span><span class="Investment-Amount">投资金额  25,000.00元 </span>进度<span class="process"><span class="process-bar" style="width:100%"></span></span>100%
        </dd>
      </dl>
      <dl>
        <dt class="clearfix"><a href="${PATH }/invest-list.htm" class="button ico Bid">投标</a><em class="ico Guarantee">保</em>北京旅游珠宝商户进货<span class="Guarantee-Agency">  担保机构：北京担保股份有限公司</span></dt>
        <dd>
          <span class="APR-loan">借款年利率  <b class="o">10%</b> </span><span class="time">期限  90天</span><span class="Investment-Amount">投资金额  25,000.00元 </span>进度<span class="process"><span class="process-bar" style="width:75%"></span></span>75%
        </dd>
      </dl>
      <dl>
        <dt class="clearfix"><a href="${PATH }/invest-list.htm" class="button ico Bid">投标</a><em class="ico Guarantee">保</em>园博印象旅游珠宝商户进货<span class="Guarantee-Agency">  担保机构：北京担保股份有限公司</span></dt>
        <dd>
          <span class="APR-loan">借款年利率  <b class="o">10%</b> </span><span class="time">期限  90天</span><span class="Investment-Amount">投资金额  25,000.00元 </span>进度<span class="process"><span class="process-bar" style="width:75%"></span></span>75%
        </dd>
      </dl>
    </div>
    
    <!--债权转让-->
    <div class="Recommendation mt10 bdr">
      <div class="hd clearfix"><a href="#" class="more">更多&gt;&gt;</a><b class="Net-mark">净值标</b>灵活投资，每月返还本息；50元起投；工作日<b class="f14 o">10:30、14:30、17:30、20:00</b> 更新，周末与其余时间随机</div>
      <dl>
        <dt class="clearfix"><a href="#" class="button ico Repayment">还款中</a><em class="ico Guarantee">保</em>北京旅游珠宝商户进货<span class="Guarantee-Agency">  担保机构：北京担保股份有限公司</span></dt>
        <dd>
          <span class="APR-loan">借款年利率  <b class="o">10%</b> </span><span class="time">期限  90天</span><span class="Investment-Amount">投资金额  25,000.00元 </span>进度<span class="process"><span class="process-bar" style="width:100%"></span></span>100%
        </dd>
      </dl>
      <dl>
        <dt class="clearfix"><a href="${PATH }/invest-list.htm" class="button ico Bid">投标</a><em class="ico Guarantee">保</em>北京旅游珠宝商户进货<span class="Guarantee-Agency">  担保机构：北京担保股份有限公司</span></dt>
        <dd>
          <span class="APR-loan">借款年利率  <b class="o">10%</b> </span><span class="time">期限  90天</span><span class="Investment-Amount">投资金额  25,000.00元 </span>进度<span class="process"><span class="process-bar" style="width:75%"></span></span>75%
        </dd>
      </dl>
      <dl>
        <dt class="clearfix"><a href="${PATH }/invest-list.htm" class="button ico Bid">投标</a><em class="ico Guarantee">保</em>北京旅游珠宝商户进货<span class="Guarantee-Agency">  担保机构：北京担保股份有限公司</span></dt>
        <dd>
          <span class="APR-loan">借款年利率  <b class="o">10%</b> </span><span class="time">期限  90天</span><span class="Investment-Amount">投资金额  25,000.00元 </span>进度<span class="process"><span class="process-bar" style="width:75%"></span></span>75%
        </dd>
      </dl>
    </div>
    
  </div>
  
  <div class="indexaside fr">
    <!--video-->
    <div class="video"><iframe height=227 width=100% src="http://player.youku.com/embed/XODY1NjI0Mjc2" frameborder=0 allowfullscreen></iframe></div>
    
    <div class="mt10 bd bdr">
      <!--Notice-->
      <div class="hd clearfix"><a href="news.html" class="more">更多&gt;&gt;</a>网站公告</div>
      <ul class="Notice cicle clearfix">
        <li><span class="time">[10-11]</span><a href="newshow.html">电子工程师严定贵的二次创业</a></li>
        <li><span class="time">[10-11]</span><a href="newshow.html">严定贵：互联网大鳄搅局将抬高</a></li>
        <li><span class="time">[10-11]</span><a href="newshow.html">以产品定义为先导 促P2P阳光化</a></li>
        <li><span class="time">[10-11]</span><a href="newshow.html">IT168视频采访副总裁刘瑶</a></li>
        <li><span class="time">[10-11]</span><a href="newshow.html">IT168视频采访副总裁刘瑶</a></li>
        <li><span class="time">[10-11]</span><a href="newshow.html">P2P监管“冲刺” 市场迎洗牌</a></li>
      </ul>
      <!-- reports-->
      <div class="hd mt10 clearfix"><a href="reports.html" class="more">更多&gt;&gt;</a>媒体报道</div>
      <div class="reports mt10 clearfix">
        <dl class="clearfix">
          <dt class="img"><a href="reportshow.html"><img src="${PATH }/front/common/upload/img5.jpg"></a></dt>
          <dd><a href="newshow.html">互联网金融应该充当毛细血管的角色-上海法治声音</a></dd>
        </dl>
        <dl class="clearfix">
          <dt class="img"><a href="reportshow.html"><img src="${PATH }/front/common/upload/img6.jpg"></a></dt>
          <dd><a href="newshow.html">互联网金融应该充当毛细血管的角色-上海法治声音</a></dd>
        </dl>
      </div>
      
    </div>
      
    <!--ad-->
    <div class="ad img mt10"><a href="#" class="btn-reg"><img src="${PATH }/front/common/upload/img7.jpg"></a></div>
    
    <!--about-->
    <div class="mt10 bd bdr">
      <div class="hd clearfix"><a href="about.html" class="more">更多&gt;&gt;</a>关于我们</div>
      <div class="txt clearfix">　　兄弟连教育隶属于易第优（北京）教育咨询股份有限公司，成立于2006年（以下简称兄弟连）。专注于IT技术培训，是国内专业的PHP/LAMP技术专业培训学校。兄弟连现已开设PHP、UI/UE、HTML5、Java/大数据、Java/Android、Linux/云计算、全栈工程师等众多学科，累计培养数万名学员。</div>
    </div>
    
    <!--Billboard-->
    <div class="mt10 bd bdr">
      <div class="hd clearfix">理财风云榜</div>
      <table class="Billboard-tab">
        <tr>
          <th width="40">排名</th>
          <th width="60">用户名</th>
          <th width="105">投资金额</th>
          <th class="tr">排名变化</th>
        </tr>
        <tr>
          <td><span class="ico three">1</span></td>
          <td>L****U</td>
          <td class="o">&yen;12,124,356,565.12</td>
          <td class="tc">-</td>
        </tr>
        <tr>
          <td><span class="ico three">2</span></td>
          <td>L****U</td>
          <td class="o">&yen;12,124,356,565.12</td>
          <td class="tc">-</td>
        </tr>
        <tr>
          <td><span class="ico three">3</span></td>
          <td>L****U</td>
          <td class="o">&yen;12,124,356,565.12</td>
          <td class="tc">-</td>
        </tr>
        <tr>
          <td><span class="behind">4</span></td>
          <td>L****U</td>
          <td class="o">&yen;12,124,356,565.12</td>
          <td class="tc">-</td>
        </tr>
        <tr>
          <td><span class="behind">5</span></td>
          <td>L****U</td>
          <td class="o">&yen;12,124,356,565.12</td>
          <td class="tc">-</td>
        </tr>
      </table>
    </div>
    
  </div>
</div>

<script src="${PATH }/front/common/js/jquery.js"></script>
<script src="${PATH }/front/common/js/Action.js"></script>
<script src="${PATH }/front/common/js/waste.js"></script>
<script src="${PATH }/front/common/js/banner.js"></script>
<script src="${PATH }/front/common/js/jQuery-jcMarquee.js"></script>
<script src="${PATH }/front/common/js/index.js"></script>


<%@ include file="./common/foot.jsp" %>

<%@ include file="./common/loginRegist.jsp" %>

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