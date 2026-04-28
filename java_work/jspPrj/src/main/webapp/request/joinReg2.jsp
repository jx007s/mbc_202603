<%@page import="basic_p.JoinDTO"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	JoinDTO dto = new JoinDTO();
	dto.reqInit(request);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinReg2</title>
</head>
<body>
	<h1>joinReg2</h1>
	<table border="">
			<tr>
				<td>id</td>
				<td><%=dto.getPid() %></td>
			</tr>
			<tr>
				<td>pw</td>
				<td><%=dto.getPw() %></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><%=dto.getGender() %></td>
			</tr>
			<tr>
				<td>취미</td>
				<td><%=dto.getHobbys() %></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><%=dto.getEmail() %></td>
			</tr>
			<tr>
				<td>남기실말</td>
				<td><%=dto.getContentBr() %></td>
			</tr>
			<tr>
				<td>파일</td>
				<td><%=dto.getUpfile() %></td>
			</tr>
			<tr>
				<td>생일</td>
				<td><%=dto.getBirth() %></td>
			</tr>
		</table>
</body>
</html>

<!-- examForm.jsp -> examReg.jsp

학생 1명의 

이름, 국어, 영어, 수학 점수를 입력받아

이름, 국어, 영어, 수학 , 총점, 평균 을 출력하세요 -->


