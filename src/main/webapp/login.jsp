<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>党团关系管理系统--登陆</title>
</head>
<body>
	<form action="LoginServlet" method="post">
			用户名：<input type="text" name="username" /><br /> 密码：<input
			type="password" name="userpwd" /><br /> 
			<input type="reset" value="重置" /> <input type="submit" value="登陆" />
	</form>
</body>
</html>