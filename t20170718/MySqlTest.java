package t20170718;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class MySqlTest {
	public static void main(String[] args) {
		// String driver = "com.mysql.jdbc.Driver";
		// String url = "jdbc:mysql://localhost:3306/sg";
		// String username = "root";
		// String password = "root";
		Connection conn = null;
		Map<String, String> maps = new HashMap<>();
		maps = read();
		try {
			Properties prop = new Properties();
			InputStream in = MySqlTest.class.getClassLoader().getResourceAsStream("conn.properties");
			prop.load(in);
			Class.forName(prop.getProperty("jdbc.driver"));
			conn = (Connection) DriverManager.getConnection(maps.get("url"), maps.get("user"), maps.get("password"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from city_view;";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("============================");
			while (rs.next()) {
				System.out.println(" " + rs.getString(1) + " : " + rs.getString(2) + " : " + rs.getString(8) + " : "
						+ rs.getString(10) + " : " + rs.getInt(11));
			}
			System.out.println("============================");
			
			CallableStatement cStmt=conn.prepareCall("call city_status_procedure(?,?);");

			cStmt.setString(1,"江夏");
			cStmt.registerOutParameter(2, java.sql.Types.INTEGER);	
			cStmt.executeQuery();
			Integer success=cStmt.getInt(2);
			System.out.println(success);
			PreparedStatement ps = conn.prepareStatement("select 城池,太守,城池类型,最大容量,现存数量  from city_view where 城池=?");
			ps.setString(1, "新野");
			ResultSet rs1 = ps.executeQuery();
			while (rs1.next()) {
				System.out.println(" " + rs1.getString(1) + " : " + rs1.getString(2) + " : " + rs1.getInt(4) + " : "
						+ rs1.getInt(5) + " : " + rs1.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Map<String, String> read() {
		Properties pps = new Properties();
		Map<String, String> maps = new HashMap<>();
		try {
			pps.load(new FileInputStream("conn.properties"));
			Enumeration enums = pps.propertyNames();// �õ������ļ�������
			while (enums.hasMoreElements()) {
				String strKey = (String) enums.nextElement();
				String strValue = pps.getProperty(strKey);
				System.out.println(strKey + "=" + strValue);
				maps.put(strKey, strValue);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return maps;
	}
}
