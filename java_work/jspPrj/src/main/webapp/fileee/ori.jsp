<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ori</title>
</head>
<body>
<h1>ori.jsp</h1>
<%
String path = request.getServletContext().getRealPath("ori");
//3.1.2 가상 서버에서의 파일위치(배포시 주석처리 필수)
path = "D:\\public\\mbc\\2026_03\\public\\java_work\\jspPrj\\src\\main\\webapp\\ori";

for(File ff: new File(path).listFiles()){
	if(ff.isFile()){
%>
	<a href="../DownloadReg2?fileName=<%=ff.getName() %>"><%=ff.getName() %></a><br/>
<%}} %>
</body>
</html>