<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ include file="/for/common.jsp"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<body>
1.jsp<br>
<%=request.getParameter("name") %>


<%


RequestDispatcher rd= request.getRequestDispatcher("/for/2.jsp");
 rd.forward(request, response);

%>

</body>
</html>