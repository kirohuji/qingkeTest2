package t20170712;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class BeSuperLauncher {
	private final static String EXIT = "exit";
	private final static String HELP = "help";
	private final static String ASK = "ask";
	private final static String ANSWER = "answer";
	private final static String LIST = "list";
	private final static String SCORE = "score";
	private static String command;
	private static BeSuper beSuper;
	private static User player = null;

	public static void main(String[] args) {
		loadBeSuper();
		QingkeConsole.print("Welcome to play this game");
		while (true) {
			String name = QingkeConsole.askUserInput("please enter you name:");
			if ("".equals(name.trim())) {
				QingkeConsole.println("Name is not allowed to be empty!");
				continue;
			}
			for (User user : beSuper.getUsers()) {
				if (name.equals(user.getName())) {
					player = null;
				}
			}
			if (player == null) {
				player = new User();
				player.setName(name);
				beSuper.getUsers().add(player);
				saveBeSuper();
			}
			break;
		}
		QingkeConsole.println("Nice to meet you, " + player.getName() + ".You can type 'help' for usage");
		while (true) {
			command = QingkeConsole.askUserInput("cmd> ");
			if (HELP.equalsIgnoreCase(command)) {
				printUsage();
				continue;
			} else if (EXIT.equalsIgnoreCase(command)) {
				System.out.println("Bye Bye");
				break;
			} else if (LIST.equalsIgnoreCase(command)) {
				for (Question question : beSuper.getQuestions()) {
					QingkeConsole.println(question);
				}
			} else if (SCORE.equalsIgnoreCase(command)) {
				QingkeConsole.println("You score:" + player.getScore());
				continue;
			} else if (ASK.equalsIgnoreCase(command)) {
				String content = QingkeConsole.askUserInput("Please enter you question:");
				Question question = new Question();
				question.setContent(content);
				question.setFrom(player.getName());
				question.setSolved(false);
				question.setId(System.currentTimeMillis() + "");
				beSuper.getQuestions().add(question);
				QingkeConsole.println("Your question has been created");
				saveBeSuper();
				continue;
			} else if (ANSWER.equalsIgnoreCase(command)) {
				String qid = QingkeConsole.askUserInput("Enter the question id:");
				Question q = null;
				Answer a = null;
				for (Question question : beSuper.getQuestions()) {
					if (qid.equals(question.getId())) {
						q = question;
						break;
					}
				}
				if (q == null) {
					QingkeConsole.println("Question for id:" + qid + "is not exist.");
					continue;
				} else if (q.isSolved()) {
					for (Answer answer : beSuper.getAnswers()) {
						if (qid.equalsIgnoreCase(answer.getId())) {
							a = answer;
							break;
						}
					}
					QingkeConsole.println("Question has been solved.See anwser below:");
					QingkeConsole.println(a);
					continue;
				}
				String content = QingkeConsole.askUserInput("Enter you answer for the question:");
				a = new Answer();
				a.setId(qid);
				a.setFrom(player.getName());
				a.setContent(content);
				q.setSolved(true);
				player.setScore(player.getScore() + 10);
				QingkeConsole.println("Thanks for you answer");
				saveBeSuper();
				continue;
			} else {
				QingkeConsole.println("Invalid command.See the user as below:");
				printUsage();
			}
		}
	}

	private static void loadBeSuper() {
		// TODO Auto-generated method stub
		if (!new File("besuper.xml").exists()) {
			beSuper = new BeSuper();
			return;
		}
		JAXBContext ctx;
		try {
			ctx = JAXBContext.newInstance(BeSuper.class);
			beSuper = (BeSuper) ctx.createUnmarshaller().unmarshal(new FileInputStream("besuper.xml"));
			Collections.sort(beSuper.getQuestions(), (q1, q2) -> {
				boolean isSovled1 = q1.isSolved();
				boolean isSovled2 = q2.isSolved();
				if (isSovled1 == isSovled2) {
					String id1 = q1.getId();
					String id2 = q2.getId();
					return id1.compareTo(id2);
				} else if (isSovled1) {
					return 1;
				} else if (isSovled2) {
					return -1;
				}
				return 0;
			});
		} catch (JAXBException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void saveBeSuper() {
		JAXBContext ctx;
		try {
			ctx = JAXBContext.newInstance(BeSuper.class);
			ctx.createMarshaller().marshal(beSuper, new File("besuper.xml"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void printUsage() {
		StringBuilder sb = new StringBuilder("This is the usage for BeSuper");
		sb.append("exit     - Exit").append("\n");
		sb.append("help     - Print usage").append("\n");
		sb.append("list     - List the opening question").append("\n");
		sb.append("score    - Print score").append("\n");
		sb.append("ask      - Create a question").append("\n");
		sb.append("answer   - Answer a question").append("\n");
		sb.append("exit     - Exit").append("\n");
		System.out.println(sb.toString());
	}
}
