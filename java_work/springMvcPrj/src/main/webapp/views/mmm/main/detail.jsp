<%@ page import="aaa.model_p.PData" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% PData pData = (PData)request.getAttribute("pData");%>
<section>
<h1><%=pData.getCate()%>/상세</h1>
mainData : <%=request.getAttribute("mainData")%><br/>

<a href="list?<%=pData.urlParam()%>">목록</a>
<a href="modify?<%=pData.urlParam()%>">수정</a>
<a href="delete?<%=pData.urlParam()%>">삭제</a>
</section>