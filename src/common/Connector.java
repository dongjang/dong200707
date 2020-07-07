package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

	public static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	public static final String ID = "c##test";
	public static final String PWD = "test";
	
	private static Connection conn;

	private static void init() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}

	}

	public static Connection getConnection() {

		if (conn == null) {

			init();
			try {
				conn = DriverManager.getConnection(URL, ID, PWD);
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}
		return conn;

	}
	public static void close() {
		if (conn != null) {
			try {

				conn.close();

			} catch (SQLException e) {

				e.printStackTrace();

			}

		}
		conn = null;

	}

	public static void main(String[] args) {
		
		getConnection();

	}
}
