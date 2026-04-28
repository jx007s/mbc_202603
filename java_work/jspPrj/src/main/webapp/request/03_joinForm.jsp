<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>03_joinForm</h1>
	<form action="joinReg.jsp">
		<table border="">
			<tr>
				<td>id</td>
				<td><input type="text" name="pid" /></td>
			</tr>
			<tr>
				<td>pw</td>
				<td><input type="text" name="pw" /></td>
			</tr>
			<tr>
				<td>성별</td>
				<td>
					<input type="radio" name="gender" value="m"/>남
					<input type="radio" name="gender" value="f"/>여
				</td>
			</tr>
			<tr>
				<td>취미</td>
				<td>
				<input type="checkbox" name="hobby" value="draw" />그림
				<input type="checkbox" name="hobby" value="coding" />코딩
				<input type="checkbox" name="hobby" value="debug" />디버깅
				<input type="checkbox" name="hobby" value="develop" />개발
				</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="email1" />@
					<select name="email2" >
						<option>naver</option>
						<option>google</option>
						<option>daum</option>
						<option>nate</option>
					</select>
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="text" name="" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="text" name="" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="가입" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>