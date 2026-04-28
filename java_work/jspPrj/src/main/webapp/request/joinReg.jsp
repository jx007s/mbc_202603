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
			<tr>
				<td>남기실말</td>
				<%
	String content = request.getParameter("content").replaceAll("\n", "<br/>");
				
				%>
				<td><%-- <%=request.getParameter("content") %> --%>
				<%=content %></td>
			</tr>
			<tr>
				<td>파일</td>
				<td>
				<!-- 파일객체가 아닌 파일이름만 업로드됨 -->
				<%=request.getParameter("upfile") %></td>
			</tr>
			<tr>
				<td>생일</td>
				<td><%=request.getParameter("birth") %></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%=request.getParameter("pname") %></td>
			</tr>
		</table>
</body>
</html>

<!-- examForm.jsp -> examReg.jsp

학생 1명의 

이름, 국어, 영어, 수학 점수를 입력받아

이름, 국어, 영어, 수학 , 총점, 평균 을 출력하세요 -->


