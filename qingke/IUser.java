package qingke;

import java.sql.SQLException;
import java.util.List;

public interface IUser {
	public User getUserByName(String name) throws SQLException;
	public boolean setUser(User name) throws SQLException;
	public <User> List<User> getUserAll();
	public boolean getUser(User user) throws SQLException;
}
