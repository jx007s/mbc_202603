<%@page import="java.io.InputStream"%>
<%@page import="java.net.URL"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>info</title>
</head>
<body>
<h1>application</h1>
<%
	ServletContext context1 = pageContext.getServletContext();
	ServletContext context2 = application; 
	ServletContext context3 = request.getServletContext(); 
%>
<%=application %><br/>
<%=context1 %><br/>
<%=context2 %><br/>
<%=context3 %><br/>
<%=application.getServerInfo() %><br/>
<%=application.getMajorVersion() %><br/>
<%=application.getMinorVersion() %><br/>
<%=application.getRealPath("fff/back.png") %><br/>
<%=request.getServletContext().getRealPath("fff/back.png") %><br/>
---------------------------<br/>
<%
	URL url = application.getResource("fff/exam.txt");
	InputStream iis = url.openStream();
	byte [] buf = new byte[iis.available()];
	iis.read(buf);
	iis.close();

%>
<%=new String(buf) %><br/>


</body>
</html>
