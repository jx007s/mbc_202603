<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>08_config</title>
</head>
<body>
<%
	ServletConfig sc1 = config; //servlet 설정정보
	ServletConfig sc2 = pageContext.getServletConfig();
	ServletContext con1 = config.getServletContext();//config로 application 객체 호출
	ServletContext con2 = application;
	
%>
<h1>08_config</h1>
<%=config %><br/>
<%=sc1 %><br/>
<%=sc2 %><br/>
<%=con1 %><br/>
<%=con2 %><br/>
<%
	//web.xml 에서 servlet의 초기화 정보 가져옴
	Enumeration en = config.getInitParameterNames();
	while(en.hasMoreElements()){
		out.println(en.nextElement()+"</br>");
	}
%>
<%=config.getInitParameter("fork") %><br/>
<%=config.getInitParameter("xpoweredBy") %><br/>
</body>
</html>