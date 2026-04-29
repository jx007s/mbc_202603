<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	
	Map<String, String> titles = Map.of(
			"아이언맨", "iron",
			"수퍼맨", "super",
			"마트맨", "mart"
			);
	
	String title = request.getParameter("title");
	int cnt = Integer.parseInt(request.getParameter("cnt"));
	
	int nn = 0;
	switch(title){
	case "아이언맨":
		nn = cnt;
		break;
	case "수퍼맨":
		nn = cnt+1;
		break;
	case "마트맨":
		nn = cnt*2;
		break;
	}

	response.sendRedirect("movie/"+titles.get(title)+".jsp?cnt="+nn);
%>