<%@page import="model.PersonDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% PersonDTO dto =(PersonDTO)request.getAttribute("mainData"); %>
<h2>회원수정입니다</h2>
<form action="PModifyReg" method="post">
<table border="">
	<tr>
		<td>아이디</td><td><input type="text" name="pid" value="<%=dto.getPid() %>" readonly /></td>
	</tr><tr>
		<td>이름</td><td><input type="text" name="pame" value="<%=dto.getPame() %>"  /></td>
	</tr><tr>
		<td>키</td><td><input type="text" name="height" value="<%=dto.getHeight() %>"  /></td>
	</tr><tr>
		<td>친구</td><td><input type="text" name="friend" value="<%=dto.getFriend() %>"  /></td>
	</tr><tr>
		<td>교수</td><td><input type="text" name="pfid"  value="<%=dto.getPfid() %>" /></td>
	</tr><tr>
		<td colspan="2" align="right">
		<a href="PDetail?pid=<%=dto.getPid() %>">뒤로</a>
		<input type="submit" value="수정" />
		<input type="reset" value="초기화" />
		</td>
	</tr>
</table>

</form>
