package qingke;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserImp implements IUser {
	private JdbcUtil jdbc;
	private Connection conn;

	public UserImp() throws ClassNotFoundException, IOException {
		jdbc = JdbcUtil.getInstance();
		conn = jdbc.getConnection();
	}

	@Override
	public User getUserByName(String name) throws SQLException {
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
		return user;
	}

	@Override
	public boolean setUser(User name) throws SQLException {
		User user = getUserByName(name.getName());
		if (user.getName().equals(name.getName())) {
			return false;
		} else {
			PreparedStatement ps = conn.prepareStatement("insert into user(password,score,name)value(?,?,?);");
			ps.setString(3, name.getName());
			ps.setString(1, name.getPassword());
			ps.setInt(2, name.getScore());
			int success = ps.executeUpdate();
			System.out.println(success);
			return true;
		}

	}

	@Override
	public <User> List<User> getUserAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getUser(User temp) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("select * from user where name=? and password=?");
		ps.setString(1, temp.getName());
		ps.setString(2, temp.getPassword());
		ResultSet result = ps.executeQuery();
		while (result.next()) {
			if (temp.getName().equals(result.getString(4)) && temp.getPassword().equals(result.getString(2))) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
