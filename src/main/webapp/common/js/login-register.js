function loginAjax(){
	 var send = {
			 phone: $('#phone').val(),
			 password: $('#password').val()
      }
    $.post( "./login.htm",send, function( data ) {
            if(data == "success"){
                window.location.replace("./index.htm");            
            } else {
                 alert(data); 
            }
        });
}

function loginRegist(){
	 var send = {
			 username: $('#username').val(),
			 phone: $('#phone1').val(),
			 password: $('#password1').val()
     }
   $.post( "./loginRegist.htm",send, function( data ) {
           if(data == "success"){
        	   alert("注册成功");
               window.location.replace("./index.htm");            
           } else if(data == "0") {
                alert("用户已经存在"); 
           }else if(data == "1"){
        	   alert("输入信息为空");
           }else{
        	   alert("注册失败");
           }
       });
}
