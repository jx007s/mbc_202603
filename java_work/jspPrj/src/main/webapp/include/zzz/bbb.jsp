<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<p>bbb</p>

<img src="../fff/CDCL8013.JPG" alt="" />
<p>
<%=request.getParameter("pid") %>,
<%=request.getParameter("age") %>,
<%=request.getParameter("job") %>
</p>
<%
	request.setAttribute("pname", "김종국");
	request.setAttribute("menu", "국밥?");
	request.removeAttribute("marriage");
%>
<p>
	<%=request.getAttribute("pname") %>,
	<%=Arrays.toString((int [])request.getAttribute("arr"))%>,
	<%=request.getAttribute("marriage") %>,
	<%=request.getAttribute("st1") %>,
	<%=request.getAttribute("menu") %>
</p>