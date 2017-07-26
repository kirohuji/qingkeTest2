package qingke;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import t20170718.MySqlTest;

public class JdbcUtil {
	private Connection conn = null;
	private Properties pt = new Properties();
	private static JdbcUtil jdbcUtil = null;

	public JdbcUtil() throws ClassNotFoundException, IOException {
		openConnection();
	}

	public void openConnection() throws IOException, ClassNotFoundException {
		Properties prop = new Properties();
		InputStream in = MySqlTest.class.getClassLoader().getResourceAsStream("conn.properties");
		prop.load(in);
		Class.forName(prop.getProperty("jdbc.driver"));
		try {
			conn = (Connection) DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"),
					prop.getProperty("password"));
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
	public Connection getConnection(){
		return conn;
	}
	public User getUserStatement(String name) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("select * from user where name=?");
		ps.setString(1, name);
		ResultSet result = ps.executeQuery();
		User user = new User();
		while (result.next()) {
			user.setId(result.getInt(1));
			user.setName(result.getString(4));
			user.setPassword(result.getString(2));
			user.setScore(result.getInt(3));
		}
		System.out.println(user.getId() + user.getName() + user.getPassword() + user.getScore());
		return user;
	}

	public static synchronized JdbcUtil getInstance() throws ClassNotFoundException, IOException {
		if (jdbcUtil == null) {
			jdbcUtil = new JdbcUtil();
		}
		return jdbcUtil;
	}
	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
