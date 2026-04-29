<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>examForm</title>
</head>
<body>
	<h1>examForm</h1>
	<form action="examReg.jsp">
		<table border="">
			<tr>
				<td>이름</td>
				<td><input type="text" name="pname" /></td>
			</tr>
			<tr>
				<td>국어</td>
				<td><input type="number" name="jum" /></td>
			</tr>
			<tr>
				<td>영어</td>
				<td><input type="number" name="jum" /></td>
			</tr>
			<tr>
				<td>수학</td>
				<td><input type="number" name="jum" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="등록" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
