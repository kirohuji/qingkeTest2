package t20170712;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "besuper")
@XmlAccessorType(XmlAccessType.FIELD)
public class BeSuper {
	@XmlElementWrapper(name = "users")
	@XmlElement(name = "user")
	private List<User> users;

	@XmlElementWrapper(name = "questions")
	@XmlElement(name = "question")
	private List<Question> questions;

	@XmlElementWrapper(name = "answers")
	@XmlElement(name = "answer")
	private List<Answer> answers;

	public BeSuper() {
		users = new ArrayList<User>();
		questions = new ArrayList<Question>();
		answers = new ArrayList<Answer>();
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

}

@XmlAccessorType(XmlAccessType.FIELD)
class User {
	@XmlElement(name = "name")
	private String name;
	@XmlElement(name = "score")
	private int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}

@XmlAccessorType(XmlAccessType.FIELD)
class Question {
	@XmlAttribute(name = "id")
	private String id;
	@XmlAttribute(name = "from")
	private String from;
	@XmlAttribute(name = "solved")
	private boolean solved;
	@XmlValue
	private String content;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public boolean isSolved() {
		return solved;
	}

	public void setSolved(boolean solved) {
		this.solved = solved;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String toString() {
		String template = "[%s] %s,[%s] from %s";
		String solvedLabel = isSolved() ? "SOLVED" : "UNSOLVED";
		return String.format(template, solvedLabel, id, content, from);
	}
}

@XmlAccessorType(XmlAccessType.FIELD)
class Answer {
	@XmlAttribute(name = "id")
	private String id;
	@XmlAttribute(name = "from")
	private String from;
	@XmlValue
	private String content;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}