package qingke;

import java.sql.SQLException;
import java.util.List;

public interface IQuestion {
	public boolean setQuestion(Question question);
	public Question getQuestion(int id) throws SQLException;
	public <Question> List<Question> getQuestions();
}
