var numLicount = 1;
// 解析显示分页信息
function build_page_info(result) {
	$("#page_info_area").empty();
	$("#page_info_area").append(
			"当前" + result.extend.pageInfo.pageNum + "页,总"
					+ result.extend.pageInfo.pages + "页,总"
					+ result.extend.pageInfo.total + "条记录");
	totalRecord = result.extend.pageInfo.total;
	currentPage = result.extend.pageInfo.pageNum;
}

// 解析显示分页条，点击分页要能去下一页....
function build_page_nav(result) {
	// page_nav_area
	$("#page_nav_area").empty();
	var ul = $("<ul></ul>");

	// 构建元素
	var firstPageLi = $("<li style='float:left;list-style:none'></li>").append(
			$("<a></a>").append("首页&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;").attr(
					"onclick", "to_page(1)"));
	var prePageLi = $("<li style='float:left;list-style:none'></li>").append(
			$("<a></a>").append("&laquo;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"));
	if (result.extend.pageInfo.hasPreviousPage == false) {
		firstPageLi.addClass("disabled");
		prePageLi.addClass("disabled");
	} else {
		// 为元素添加点击翻页的事件
		firstPageLi.click(function() {
			to_page(1);
		});
		prePageLi.click(function() {
			to_page(result.extend.pageInfo.pageNum - 1);
		});
	}

	var nextPageLi = $("<li style='float:left;list-style:none'></li>").append(
			$("<a></a>").append("&raquo;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"));
	var lastPageLi = $("<li style='float:left;list-style:none'></li>").append(
			$("<a></a>").append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;末页").attr(
					"href", "#"));
	if (result.extend.pageInfo.hasNextPage == false) {
		nextPageLi.addClass("disabled");
		lastPageLi.addClass("disabled");
	} else {
		nextPageLi.click(function() {
			to_page(result.extend.pageInfo.pageNum + 1);
		});
		lastPageLi.click(function() {
			to_page(result.extend.pageInfo.pages);
		});
	}

	// 添加首页和前一页 的提示
	ul.append(firstPageLi).append(prePageLi);
	// 1,2，3遍历给ul中添加页码提示
	$.each(result.extend.pageInfo.navigatepageNums, function(index, item) {

		var numLi = $("<li style='float:left;list-style:none'></li>").append(
				$("<a></a>").append(item + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"));
		if (result.extend.pageInfo.pageNum == item) {
			numLi.addClass("active");
		}
		numLi.click(function() {
			to_page(item);
		});
		ul.append(numLi);
		numLicount = item;
	});
	// 添加下一页和末页 的提示
	ul.append(nextPageLi).append(lastPageLi);

	// 把ul加入到nav
	var navEle = $("<div style='margin-left: 50%;'></div>").append(ul);
	navEle.appendTo("#page_nav_area");
}

function add0(m){return m<10?'0'+m:m }
function format(shijianchuo){
	var time = new Date(shijianchuo);
	var y = time.getFullYear();
	var m = time.getMonth()+1;
	var d = time.getDate();
	var h = time.getHours();
	var mm = time.getMinutes();
	var s = time.getSeconds();
	return y+'-'+add0(m)+'-'+add0(d)+' '+add0(h)+':'+add0(mm)+':'+add0(s);
}
