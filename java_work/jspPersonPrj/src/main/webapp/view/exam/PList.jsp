<%@page import="model.PersonDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h2>회원목록입니다</h2>

<table border="">
	<tr>
		<td>아이디</td>
		<td>이름</td>
		<td>나이</td>
	</tr>
	

<% ArrayList<PersonDTO> arr =(ArrayList<PersonDTO>)request.getAttribute("mainData");

	for(PersonDTO dto : arr){
%>

	<tr>
		<td><%=dto.getPid() %></td>
		<td>
		<a href="PDetail?pid=<%=dto.getPid() %>"><%=dto.getPame() %></a>
		</td>
		<td><%=dto.getAge() %></td>
	</tr>



<%} %>
	<tr>
		<td colspan="3" align="right">
			<a href="PInsertForm">회원가입</a>
		</td>
	</tr>



</table>
