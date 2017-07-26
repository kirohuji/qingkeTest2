package qingke;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class QuestionImp implements IQuestion {
	private JdbcUtil jdbc;
	private Connection conn;

	public QuestionImp() throws ClassNotFoundException, IOException {
		jdbc = JdbcUtil.getInstance();
		conn = jdbc.getConnection();
	}

	@Override
	public boolean setQuestion(Question question) {
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("insert into question(user_id,context,solved)value(?,?,?);");
			ps.setInt(1, question.getUserId());
			ps.setString(2, question.getContent());
			ps.setInt(3, 0);
			return ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Question getQuestion(int id) throws SQLException {
		PreparedStatement ps;
		Question question=new Question();
		ps = conn.prepareStatement("select * from Question where id=?");
		ps.setInt(1, Integer.valueOf(id));
		ResultSet result = ps.executeQuery();
		while (result.next()) {
			question.setSolved(result.getInt(2));
		}
		return question;
	}

	@Override
	public <Question> List<Question> getQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

}
