<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	pageContext.setAttribute("PATH", request.getContextPath());
%>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="${PATH }/manager/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="${PATH }/manager/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="${PATH }/manager/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="${PATH }/manager/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="${PATH }/manager/static/h-ui.admin/css/style.css" />
<title>添加管理员 - 管理员管理</title>
</head>
<body>
<article class="page-container">
	<form class="form form-horizontal" id="form-admin-add">
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>管理员：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="" placeholder="4-16个字符" id="usernamem" name="usernamem">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>手机：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="" placeholder="" id="phone" name="phone">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>邮箱：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" placeholder="@" name="email" id="email">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-4" style="color: red">系统默认密码：&nbsp;&nbsp;123123</label>
	</div>
	<div class="row cl">
		<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
			<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
		</div>
	</div>
	</form>
</article>

<!--_footer 作为公共模版分离出去--> 
<script type="text/javascript" src="${PATH }/manager/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${PATH }/manager/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${PATH }/manager/static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="${PATH }/manager/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${PATH }/manager/lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="${PATH }/manager/lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="${PATH }/manager/lib/jquery.validation/1.14.0/messages_zh.js"></script> 
<script type="text/javascript">

	$(".skin-minimal input").iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	

$(function(){
	$("#form-admin-add").validate({
		rules:{
			usernamem:{
				required:true,//必输字段
				minlength:4,// 输入值不能小于4
				maxlength:16 //输入值不能大于16
			},
			phone:{
				required:true,//必输字段
				isPhone:true,
			},
			email:{
				required:true,//必输字段
				email:true,//必须输入正确格式的电子邮件
			}
		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit({
				type: 'post',
				url: "${PATH }/userAdd.do" ,
				success: function(result){
					if(result.code == 100){
						layer.alert('添加成功', {icon: 6});
						layer.alert('添加成功', {
						    closeBtn: 1    // 是否显示关闭按钮
						    ,btn: ['确定'] //按钮
						    ,icon: 6    // icon
						    ,yes:function(){
						       parent.$('.btn-refresh').click();
								var index = parent.layer.getFrameIndex(window.name);
								window.parent.location.reload(); //刷新父页面
						    }});
					}else{
						layer.alert('添加失败', {icon: 5});
					}
				}
			});
		}
	});
						
});
</script> 
</body>
</html>