<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
</head>
<body>
<h1>form</h1>
<form action="/jspPrj/UploadReg" method="get" enctype="application/x-www-form-urlencoded">
	<table border="">
		<tr>
			<td>pid</td>
			<td><input type="text" name="pid" /></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><input type="number" name="age" /></td>
		</tr>
		<tr>
			<td>파일1</td>
			<td><input type="file" name="up1" /></td>
		</tr>
		<tr>
			<td>파일2</td>
			<td><input type="file" name="up2" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="작성" />
			</td>
		</tr>
		
	</table>
</form>
</body>
</html>