<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	pageContext.setAttribute("PATH", request.getContextPath());
%>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="/favicon.ico" >
<link rel="Shortcut Icon" href="/favicon.ico" />
<link rel="stylesheet" type="text/css" href="${PATH }/manager/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="${PATH }/manager/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="${PATH }/manager/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="${PATH }/manager/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="${PATH }/manager/static/h-ui.admin/css/style.css" />
<title>管理员列表</title>
</head>
<body>
	<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i> 首页
		 <span class="c-gray en">&gt;</span> 管理员管理 
	 	<span class="c-gray en">&gt;</span> 前台用户
	 	<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" >
	 		<i class="Hui-iconfont">&#xe68f;</i>
	 	</a>
	</nav>
	<div class="page-container">
		<div class="text-c"> 
			<input type="text" class="input-text" style="width:250px" placeholder="输入手机号" id="phone" name="phone">
			<button type="submit" class="btn btn-success" id="search" name="search" onclick="search()"><i class="Hui-iconfont">&#xe665;</i> 搜用户</button>
		</div>
		<div class="mt-20">
		<table class="table table-border table-bordered table-bg" id="user_table">
			<thead>
				<tr>
					<th scope="col" colspan="9">用户列表</th>
				</tr>
				<tr class="text-c">
					<th width="25"><input type="checkbox" name="" value=""></th>
					<th width="40">ID</th>
					<th width="150">昵称</th>
					<th width="90">手机</th>
					<th width="130">加入时间</th>
					<th width="100">是否禁用</th>
					<th width="100">操作</th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
		</div>
			<!-- 显示分页信息 -->
		<div class="row">
			<!--分页文字信息  -->
			<div class="col-md-6" id="page_info_area"></div>
			<!-- 分页条信息 -->
			<div class="col-md-6" id="page_nav_area">
				
			</div>
		</div>
	</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="${PATH }/manager/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${PATH }/manager/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${PATH }/manager/static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="${PATH }/manager/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${PATH }/manager/lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="${PATH }/manager/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="${PATH }/manager/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript" src="${PATH }/common/js/pageinfo.js"></script>
<script type="text/javascript">


//1、页面加载完成以后，直接去发送ajax请求,要到分页数据
		$(function(){
			//去首页
			to_page(1);
		});
		function to_page(pageNum){
			$.ajax({
				url:"${PATH }/frontuserList.do",
				data:"pageNum="+pageNum,
				type:"GET",
				success:function(result){
					console.log(result);
					//1、解析并显示员工数据
					build_emps_table(result);
					//2、解析并显示分页信息
					build_page_info(result);
					//3、解析显示分页条数据
					build_page_nav(result);
				}
			});
		}
		
		function search(){
			var phone = $("#phone").val();
			$.ajax({
				url:"${PATH }/frontuserSearchList.do",
				data:"phone="+phone,
				type:"GET",
				success:function(result){
					//1、解析并显示员工数据
					build_emps_table(result);
					//2、解析并显示分页信息
					build_page_info(result);
					//3、解析显示分页条数据
					build_page_nav(result);
				}
			});
		}
		
		 

		function build_emps_table(result){
			//清空table表格
			$("#user_table tbody").empty();
			var users = result.extend.pageInfo.list;
			$.each(users,function(index,item){
				var checkBoxTd = $("<td><input type='checkbox' value='1' name=''></td>");
				var userid = $("<td></td>").append(item.userid);
				var username = $("<td></td>").append(item.username);
				var phone = $("<td></td>").append(item.phone);
				var createTime = $("<td></td>").append(format(item.createtime));
				console.log(createTime);
				var dr = $("<td class='td-status'></td>").append(item.dr=='0'?
					$("<span class='label label-success radius'></span>").append("已启用"):
					$("<span class='label radius'></span>").append("已拉黑"));
				var btn = $("<td class='td-manage'></td>").append("<a style='text-decoration:none' onClick="+(item.dr=='0'?"admin_stop(this,"+item.userid+")":"admin_start(this,"+item.userid+")")+" href='javascript:;' title="+(item.dr=='0'?'拉黑':'启用')+">"
							+"<i class='Hui-iconfont'>"+(item.dr == '0'?"&#xe631;":"&#xe615;")+"</i></a>");
							
				//append方法执行完成以后还是返回原来的元素
				$("<tr></tr>").append(checkBoxTd)
					.append(userid)
					.append(username)
					.append(phone)
					.append(createTime)
					.append(dr)
					.append(btn)
					.appendTo("#user_table tbody");
			});
		}
		
/*
	参数解释：
	title	标题
	url		请求的url
	id		需要操作的数据id
	w		弹出层宽度（缺省调默认值）
	h		弹出层高度（缺省调默认值）
*/

/*管理员-停用*/
function admin_stop(obj,id){
	layer.confirm('确认要停用吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
			$.ajax({
			type: 'POST',
			url: '${PATH }/frontuserStop.do',
			data:"userid="+id,
			dataType: 'json',
			success: function(result){
				if(result.code == 100){
						$(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_start(this,id)" href="javascript:;" title="启用" style="text-decoration:none"><i class="Hui-iconfont">&#xe615;</i></a>');
						$(obj).parents("tr").find(".td-status").html('<span class="label radius">拉黑</span>');
						$(obj).remove();
						layer.msg('已拉黑!',{icon: 5,time:1000});
						to_page(numLicount);
				}else{
					layer.msg('拉黑失败!',{icon:1,time:1000});
				}
			},
			error:function(data) {
				console.log(data.msg);
			},
		});	
	});
}

/*管理员-启用*/
function admin_start(obj,id){
	layer.confirm('确认要启用吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
			$.ajax({
			type: 'POST',
			url: '${PATH }/frontuserStar.do',
			data:"userid="+id,
			dataType: 'json',
			success: function(result){
				if(result.code == 100){
						$(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_stop(this,id)" href="javascript:;" title="拉黑" style="text-decoration:none"><i class="Hui-iconfont">&#xe631;</i></a>');
						$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
						$(obj).remove();
						layer.msg('已启用!', {icon: 6,time:1000});
						to_page(numLicount);
				}else{
					layer.msg('启用失败!',{icon:1,time:1000});
				}
			},
			error:function(data) {
				console.log(data.msg);
			},
		});	
		
	});
}
</script>
</body>
</html>