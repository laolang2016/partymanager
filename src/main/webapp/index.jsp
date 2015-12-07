<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>党团关系管理系统--首页</title>
</head>
<body>


                    <c:choose>
                        <c:when test="${empty sessionScope.user }">
                            未登陆请<a href="login.jsp">登陆</a>
                        </c:when>
                        <c:otherwise>
                        	欢迎：${user.name }
                        </c:otherwise>
                    </c:choose>

</body>
</html>