<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board_insert</title>
</head>
<body>


<form action = "/board.do" method="post">

제목 : <input type="text" name="title"><br>
내용 : <input name="content"></textarea><br>
사용자 : <input type="text" name="creusr"><br>
<button>작성</button>





</form>


<a href="/board/board_list.jsp"><button>목록</button></a>

</body>
</html>