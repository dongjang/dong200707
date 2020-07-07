<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="common.Connector"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
	String title = request.getParameter("title");
String content = request.getParameter("content");
String creusr = request.getParameter("creusr");

String sql = "insert into board(num, title, content, credat, cretim, creusr)\r\n" + 
		"values(\r\n" + 
		"(select nvl(max(num),0)+1 from board),\r\n" + 
		"?,?,to_char(sysdate,'YYYYMMDD'),to_char(sysdate,'HH24MISS'),?)";

Connection con = null;

try {

	con = Connector.getConnection();
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, title);
	ps.setString(2, content);
	ps.setString(3, creusr);

	int result = ps.executeUpdate();

	if (result == 1) {
		out.println("잘 들어 갔당께!");

	}

}

catch (SQLException e) {

	out.println("에러 났당께!!" + e.getMessage());

}finally{
	  
	   Connector.close();
	
}
	
%>



<script>
	//location.href = "/board/board_list.jsp"
</script>



