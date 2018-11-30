(function($) {
	 $(function() {
	        $.getJSON("./queryBannerByType.htm",{ imgType: 0 } ,function(data) {

	        	var curWwwPath=window.document.location.href; 
	        	var pathName = window.document.location.pathname;
	        	var pos = curWwwPath.indexOf(pathName);
	        	var localhostPaht=curWwwPath.substring(0,pos); 
	        	 var jsonobj = eval(data);
	        	 for(var i=0;i<jsonobj.length;i++){ 
	        		 console.log(jsonobj.length);
	        		 var imgPath = jsonobj[i].bannerimg;
	        		 var bannertitle = jsonobj[i].bannertitle;
	        		 var bannerurl = jsonobj[i].bannerurl;
	        		 if (i == 0) {
	        			 $("#myCarousel .carousel-indicators").append("<li data-target='#myCarousel' data-slide-to='0' class='active'></li>");
	        			 $("#myCarousel .carousel-inner").append("<div class='item active'><img style='width：100%;' src=./"+imgPath+"></img></div>");
					}else{
						$("#myCarousel .carousel-indicators").append("<li data-target='#myCarousel' data-slide-to='"+i+"'></li>");
						$("#myCarousel .carousel-inner").append("<div class='item'><img src=./"+imgPath+"></img></div>");
					}
	        	 } 
 	        });
	 })
})(jQuery);
