<%@page import="model.PersonDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h2>회원상세입니다</h2>
<% PersonDTO dto =(PersonDTO)request.getAttribute("mainData"); %>
<table border="">
	<tr>
		<td>아이디</td><td><%=dto.getPid() %></td>
	</tr><tr>
		<td>이름</td><td><%=dto.getPame() %></td>
	</tr><tr>
		<td>나이</td><td><%=dto.getAge() %></td>
	</tr><tr>
		<td>생일</td><td><%=dto.getBirth() %></td>
	</tr><tr>
		<td>가입일</td><td><%=dto.getReg_date() %></td>
	</tr><tr>
		<td>키</td><td><%=dto.getHeight() %></td>
	</tr><tr>
		<td>친구</td><td><%=dto.getFriend() %></td>
	</tr><tr>
		<td>교수</td><td><%=dto.getPfid() %></td>
	</tr><tr>
		<td colspan="2" align="right">
		<a href="PList">목록으로</a>
		<a href="PModifyForm?pid=<%=dto.getPid() %>">수정</a>
		<a href="PDelete?pid=<%=dto.getPid() %>">삭제</a>
		</td>
	</tr>
</table>
