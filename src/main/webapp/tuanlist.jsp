<%@page import="com.laolang.party.domain.Tuan"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>党团管理系统——团员列表</title>
</head>
<body>
<%
	List<Tuan> tuanlist =(List<Tuan>) request.getAttribute("tuanlist");
%>
	<table border="1">
		<tr>
			<th>学号</th>
			<th>团组织编号</th>
			<th>批准时间</th>
			<th>管理</th>
		<tr>
		<%
		for( Tuan tuan : tuanlist ){
		%>
			<tr>
				<td>
					<%out.print(tuan.getStudent_id()); %>
				</td>
				<td>
					<%out.print(tuan.getGroup_id()); %>
				</td>
				<td>
					<%out.print(tuan.getApprival_time()); %>
				</td>
				<td>
				<%
					if( null == tuan.getApprival_time() ){
				%>
					<a href = "#">同意</a>
				<%
					}else{
				%>
				已批准
				<%
					}
				%>
				</td>
			</tr>
		<%
		}
		%>
	</table>

</body>
</html>