package t20170719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import t20170718.MySqlTest;

public class JdbcBatch {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Properties prop = new Properties();
			InputStream in = MySqlTest.class.getClassLoader().getResourceAsStream("conn.properties");
			prop.load(in);
			Class.forName(prop.getProperty("jdbc.driver"));
			conn = (Connection) DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("user"),prop.getProperty("password"));
			Statement stmt=conn.createStatement();
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			String str=bf.readLine();
			while(true){
				if(str.equalsIgnoreCase("run")||str.equals("Run")){
					stmt.executeBatch();
					stmt.clearBatch();
					str=bf.readLine();
				}else if(str.equalsIgnoreCase("exit") || str.equals("Exit")){
					break;
				}else{
					stmt.addBatch(str);
					str=bf.readLine();
				}
				System.out.println("success");
			}
			stmt.close();
			bf.close();
			conn.close();
			in.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
