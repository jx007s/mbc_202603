<%@ page import="aaa.model_p.PData" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% PData pData = (PData)request.getAttribute("pData");%>
<section>
<h1><%=pData.getCate()%>/list</h1>
mainData : <%=request.getAttribute("mainData")%><br/>

<a href="detail?<%=pData.urlParam()%>">상세</a>
    <br/>
<% for (int i = 1; i < 10; i++) {
if(pData.getNowPage()!=i){%>
<a href="?cate=<%=pData.getCate()%>&nowPage=<%=i%>"><%=i%></a>
<%}else{ %>
    [<%=i%>]
<%}} %>
</section>