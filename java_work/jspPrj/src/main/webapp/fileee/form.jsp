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
<!--  파일업로드시
method="post"   :: URL기반으로 파일전송이 아닌  post 로 묶어서 전송 
enctype="multipart/form-data"  //데이터가 multipart 형태
필수
 -->
<form action="/jspPrj/UploadReg" method="post" enctype="multipart/form-data">
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
			<td><input type="file" name="up2" multiple /></td>
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