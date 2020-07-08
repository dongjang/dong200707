package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardService;

public class BoardServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BoardService boardService = new BoardService();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		List<Map<String, Object>> boardList = boardService.getBoardList();

		String html = "<html>\r\n" + "<head>\r\n" + "</head>\r\n" + "<meta charset=\"UTF-8\">\r\n"
				+ "<title>ok?</title>\r\n" + "<body>\r\n";
		html += "<table border=\"1\">";
		html += "<tr>";
		html += "<th>번호</th>";
		html += "<th>제목</th>";
		html += "<th>작성일</th>";
		html += "<th>작성자</th>";
		html += "</tr>";

		for (Map<String, Object> board : boardList) {

			html += "<tr>";

			html += "<td>" + board.get("num") + "</td>";
			html += "<td>" + board.get("title") + "</td>";
			html += "<td>" + board.get("credat") + "</td>";
			html += "<td>" + board.get("creusr") + "</td>";
			html += "</tr>";

		}

		html += "<table>";
		html += "</body>\r\n" + "</html>";
		pw.print(html);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String creusr = request.getParameter("creusr");
		Map<String, Object> board = new HashMap<>();
		board.put("title", title);
		board.put("content", content);
		board.put("creusr", creusr);
		int result = boardService.insertBoard(board);
		PrintWriter pw = response.getWriter();

		if (result == 1) {
			pw.println("저장완료");
		} else {
			pw.println("똑바로 안 해...?");
		}

	
	}

}

 
