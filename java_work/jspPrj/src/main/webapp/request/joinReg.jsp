<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinReg</title>
</head>
<body>
	<h1>joinReg</h1>
	<table border="">
			<tr>
				<td>id</td>
				<td><%=request.getParameter("pid") %></td>
			</tr>
			<tr>
				<td>pw</td>
				<td><%=request.getParameter("pw") %></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><%=request.getParameter("gender") %></td>
			</tr>
			<tr>
				<td>취미</td>
				<%
				String [] hobbys = request.getParameterValues("hobby");
				System.out.println(Arrays.toString(hobbys));
				%>
				<td>
					<%-- <%=request.getParameter("hobby") %> --%>
					<%=String.join(",", hobbys) %>
				</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td>
				<%=request.getParameter("email1") %>@<%=request.getParameter("email2") %>
				</td>
			</tr>
		</table>
</body>
</html>