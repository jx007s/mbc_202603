<%@page import="bakery_p.MenuListService"%>
<%@page import="basic_p.MenuDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
/*
List<MenuDTO> menuData = List.of(
	new MenuDTO("/jspPrj/forward/info/hello.jsp","인사말"),
	new MenuDTO("/jspPrj/forward/info/history.jsp","연혁"),
	new MenuDTO("/jspPrj/forward/info/location.jsp","오시는길")
	);
*/
	String cate = "회사소개";
	request.setAttribute("cate",cate);
	request.setAttribute("menuData",new MenuListService().menuList(cate));
	request.setAttribute("mainUrl","info/history.jsp");
	request.setAttribute("mainData","회사연혁이지롱");
%>    
<jsp:forward page="../../forView/template2.jsp"/>