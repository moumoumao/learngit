<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="/JinmengWeb22/js/jquery.min.js"></script>
<link rel="stylesheet" href="/JinmengWeb22/css/main.css" type="text/css"></link>
<link rel="stylesheet" href="/JinmengWeb22/css/login.css" type="text/css"></link>
<title>登录</title>
<script type="text/javascript">
function formSubmit(){
	var name=$('#name').val();
	var pwd=$('#pwd').val();
	if(name!=''&&pwd!=''){
		$.ajax({
			async : false,
			type : "POST",
			dataType : 'JSON',
			url : 'user!doLogin.action',
			data:{"m00101Dto.userName":name,"m00101Dto.userPass":pwd},
			success:function(data){
	    		if(data.success){
	    			window.location.href='index.jsp';
	    		}else{
	    			$('#error').html(data.pageData);
	    		}
			}
		});
	}else{
		$.messager.alert('提示','用户名和密码不能为空！'); 
	}

}
</script>
</head>
<body>
<div id="container">
	<div class="log-title"><div>物流管理系统</div></div>
	<div id="content">
		<div class="show_div">
        <div class="wel-login-title">欢迎登录物流管理系统</div>
        <div class="left">
	        <div id="error"></div>
	        <form id="signupForm">
	         <div class="input_box">
                <em class="user_img"></em>
                <input id="name" type="text" class="input_all" placeholder="请输入用户名" required="true"/>
            </div>
            <div class="input_box">
                <em class="pwd_img"></em><input id="pwd" type="password" class="input_all" placeholder="请输入密码" required="true" />
            </div>
            <div id="bt_sub" onclick="formSubmit();" >登录</div>
	        </form>
            
        </div>
        <div class="right">      
        </div>
       
        </div>
        
	</div>
</div>

</body>
</html>