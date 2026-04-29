<%@page import="java.util.List"%>
<%@page import="basic_p.ExamDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<ExamDTO> arr = (List<ExamDTO>)application.getAttribute("arr");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>examView</title>
</head>
<body>
	<h1>examReg</h1>
	
	<%
		if(arr==null){
			out.println("자료업음");
		}else{
	%>			
	
		<table border="">
			<tr>
				<td>이름</td><td>국어</td><td>영어</td>
				<td>수학</td><td>총점</td><td>평균</td>
				<td>등급</td>
			</tr>
		<% for(ExamDTO dto: arr ){ %>
			<tr>
				<td><%=dto.getPname()%></td>
				<td><%=dto.getJum(0)%></td>
				<td><%=dto.getJum(1)%></td>
				<td><%=dto.getJum(2)%></td>
				<td><%=dto.getTot()%></td>
				<td><%=dto.getAvg()%></td>
				<td><%=dto.getGrade()%></td>
			</tr>
			<%} %>
		</table>
		<% } %>

</body>
</html>