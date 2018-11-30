function loginAjax(){
	 var send = {
			 phone: $('#phone').val(),
			 passwordm: $('#passwordm').val()
      }
    $.post( "./login.do",send, function( data ) {
            if(data == "success"){
                window.location.replace("./main.do");            
            } else {
                 shakeModal(data); 
            }
        });
}
