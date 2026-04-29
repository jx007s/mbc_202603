<%@page import="basic_p.ExamDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ExamDTO dto = new ExamDTO(request);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>examReg</title>
</head>
<body>
	<h1>examReg</h1>
	
		<table border="">
			<tr>
				<td>이름</td>
				<td><%=dto.getPname()%></td>
			</tr>
			<tr>
				<td>국어</td>
				<td><%=dto.getJum(0)%></td>
			</tr>
			<tr>
				<td>영어</td>
				<td><%=dto.getJum(1)%></td>
			</tr>
			<tr>
				<td>수학</td>
				<td><%=dto.getJum(2)%></td>
			</tr>
			<tr>
				<td>총점</td>
				<td><%=dto.getTot()%></td>
			</tr>
			<tr>
				<td>평균</td>
				<td><%=dto.getAvg()%></td>
			</tr>
		</table>

</body>
</html>