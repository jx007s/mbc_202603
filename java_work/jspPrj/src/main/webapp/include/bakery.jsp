<%@page import="java.util.Map"%>
<%@page import="basic_p.MenuDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String cate = "info";
	if(request.getParameter("cate")!=null){
		cate = request.getParameter("cate");
	}
	String cateUrl = "baMenu/"+cate+".jsp";
	
	String service = "hello";
	if(request.getParameter("service")!=null){
		service = request.getParameter("service");
	}
	String serviceUrl = "baService/"+cate+"/"+service+".jsp";
	
	request.setAttribute("cate", cate);
	
	/*
	List<MenuDTO> menuData1 = List.of(
			new MenuDTO("hello","인사말"),
			new MenuDTO("history","연혁"),
			new MenuDTO("location","오시는길")
			);
	
	List<MenuDTO> menuData2 = List.of(
			new MenuDTO("bagette","바게뜨"),
			new MenuDTO("redbean","앙꼬"),
			new MenuDTO("soboro","소보르")
			);
	
	List<MenuDTO> menuData3 = List.of(
			new MenuDTO("cheeze","치즈"),
			new MenuDTO("icing","생크림"),
			new MenuDTO("strawberry","딸기"),
			new MenuDTO("sp","고구마")
			);
	*/
	
	Map<String,List<MenuDTO>> menuData = Map.of(
			"info", 
			List.of(
					new MenuDTO("hello","인사말"),
					new MenuDTO("history","연혁"),
					new MenuDTO("location","오시는길")
					),
			"basic",
			List.of(
					new MenuDTO("bagette","바게뜨"),
					new MenuDTO("redbean","앙꼬"),
					new MenuDTO("soboro","소보르")
					),
			"cake",
			List.of(
					new MenuDTO("cheeze","치즈"),
					new MenuDTO("icing","생크림"),
					new MenuDTO("strawberry","딸기"),
					new MenuDTO("sp","고구마")
					)
			);
	
	
	request.setAttribute("menuData", menuData.get(cate));
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bakery</title>
</head>
<body>
<h1>bakery</h1>
<table border="">
	<tr>
		<td colspan="2">
		<jsp:include page="baInc/header.jsp"/>
		</td>
	</tr>
	<tr>
		<td width="200px">
		<%-- <jsp:include page="<%=cateUrl %>"/> --%>
		<jsp:include page="baInc/menu.jsp"/>
		</td>
		<td width="700px">
		<jsp:include page="<%=serviceUrl %>"/>
		</td>
	</tr>
	<tr>
		<td colspan="2">
		<jsp:include page="baInc/footer.jsp"/>
		</td>
	</tr>
</table>
</body>
</html>

company.jsp

----------------------------------------------------
    회사소개       갤러리       마이페이지     공지사항
----------------------------------------------------

                 main

----------------------------------------------------
            bottom
----------------------------------------------------



template : 1
top : 1
main : 4
bottom : 1