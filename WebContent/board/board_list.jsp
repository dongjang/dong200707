<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="common.Connector"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>




	<%
		String search = request.getParameter("search");
	String searchStr = request.getParameter("searchStr");
	Connection con = Connector.getConnection();
	Statement stmt = con.createStatement();

	String sql = "SELECT num, content, title, credat, creusr FROM board ";
	
	if (search != null && !"".equals(search)) {
		sql += " where ";

		if ("1".equals(search)) {
			sql += " num like concat('%'||'?'||'%')";
//'%'||'?'||'%'
		} else if ("2".equals(search)) {
			sql += " content like concat('%'||'?'||'%')";
		} else if ("3".equals(search)) {
			sql += " title like concat('%'||'?'||'%')";
			sql += " or content like concat('%'||'?'||'%')";
		} else if ("4".equals(search)) {
			sql += " credat like concat('%'||'?'||'%')";
		} else if ("5".equals(search)) {
			sql += " creusr like concat('%',?,'%')";
		}

	}

	PreparedStatement ps = con.prepareStatement(sql);

	if (search != null && !"".equals(search)) {
		ps.setString(1, searchStr);
		if ("3".equals(search)) {
		
			ps.setString(2, searchStr);

		} 

	}

	ResultSet rs = ps.executeQuery();
	
	%>




	<a href="/board/board_insert.jsp"><button>돌아가자</button></a>


	<form>



		<select name="search">
			<option value="1">번호</option>
			<option value="2">제목</option>
			<option value="3">제목+내용</option>
			<option value="4">날짜</option>
			<option value="5">작성자</option>

		</select> <input type="text" name="searchStr">
		<button>검색</button>
	</form>

	<table border="1">

		<tr>

			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>날짜</th>
			<th>사용자</th>
		<tr>
			<%
				while (rs.next()) {
			%>
		
		<tr>
			<th><%=rs.getInt("num")%></th>
			<th><%=rs.getString("content")%></th>
			<th><%=rs.getString("title")%></th>
			<th><%=rs.getString("credat")%></th>
			<th><%=rs.getString("creusr")%></th>

		</tr>


		<%
			}
		%>








	</table>




</body>
</html>