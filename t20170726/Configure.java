package t20170726;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Configure {
	private Properties prop;
	private Connection conn;
	private SqlSessionFactory sqlSessionFactory;
	public Configure(){
		prop=new Properties();
		
	}
	public void createOrigin() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
		prop.load(new BufferedInputStream(new FileInputStream("conn.properties")));
		Class.forName(prop.getProperty("jdbc.driver"));
		conn=DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("user"),prop.getProperty("password"));
	
	}
	public SqlSessionFactory createMyBatis() throws FileNotFoundException, IOException{
	//	prop.load(new BufferedInputStream(new FileInputStream("conn.properties")));
		String mybatisConfig = "mybatis.xml";
		InputStream is = Configure.class.getClassLoader().getResourceAsStream(mybatisConfig);
	    return sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
	    
	}
}
