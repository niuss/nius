<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/public/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<link type="text/css" href="${ctx}/style/login/login.css" rel="stylesheet" />	
<title>登录页面</title>
</head>
<body>
       <div class="login_center">
        <form action="${ctx}/do-login" id="loginForm" method="post" class="login_form"style="display:block;" >
       		
       		<div id="input_wrap">
       			<div id="input_bg"></div>
       			<div id="input_content">
       			<div id="login_ipt1" >
       				<label class="lab">用户名</label>
	        		<input type="text" id="username" name="username" class="login_txt"  />
	       		</div>
		       <div id="login_ipt2">
		       		<label class="lab">密&nbsp;码</label>
		       	
		       		<input type="password" id="password"  name="password" class="login_txt" />
		        </div>
		        <div id="login_btn">
		        	<input id="rembPwd" name="_spring_security_remember_me" type="checkbox" class="login_jz" value="记住密码" />
		        	<span>记住密码</span>	
		        	<input type="submit" value="登陆" class="denglu"/>
       			</div>
       			</div>
       		</div>
       	</form>
       </div>
</body>
</html>