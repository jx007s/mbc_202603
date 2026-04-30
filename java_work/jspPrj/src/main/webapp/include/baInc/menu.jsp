<%@page import="basic_p.MenuDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String cate = (String)request.getAttribute("cate");
	List<MenuDTO> menuData = (List<MenuDTO>)request.getAttribute("menuData");
%>
<aside>    
<h3><%=cate %>메뉴</h3>
<a href="?cate=<%=cate %>&service=hello">인사말</a>
<a href="?cate=<%=cate %>&service=history">연혁</a>
<a href="?cate=<%=cate %>&service=location">오시는길</a>
</aside>