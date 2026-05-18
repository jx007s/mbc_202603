<%@page import="model.PersonDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h2>회원가입입니다</h2>
<form action="PInsertReg" method="post">
<table border="">
	<tr>
		<td>아이디</td><td><input type="text" name="pid" /></td>
	</tr><tr>
		<td>이름</td><td><input type="text" name="pame" /></td>
	</tr><tr>
		<td>나이</td><td><input type="text" name="age" /></td>
	</tr><tr>
		<td>생일</td><td><input type="date" name="birth" /></td>
	</tr><tr>
		<td>키</td><td><input type="text" name="height" /></td>
	</tr><tr>
		<td>친구</td><td><input type="text" name="friend" /></td>
	</tr><tr>
		<td>교수</td><td><input type="text" name="pfid" /></td>
	</tr><tr>
		<td colspan="2" align="right">
		<a href="PList">목록으로</a>
		<input type="submit" value="가입" />
		</td>
	</tr>
</table>

</form>
