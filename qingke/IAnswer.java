package qingke;

import java.util.List;

public interface IAnswer {
	public boolean setAnswer(Answer answer);
	public Answer getAnswer(int id);
	public <Answer> List<Answer> getAnswerByQuestionId(int questionId);
}
