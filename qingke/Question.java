package qingke;
class Question {
	private int id;
	
	private int userId;
	private String userName;
	private boolean solved;
	
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id = i;
	}

	
	public boolean isSolved() {
		return solved;
	}

	public void setSolved(int i) {
		if(i==1){
			this.solved = true;
		}else{
			this.solved = false;
		}
		
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
		return String.format(template, solvedLabel, id, content, userName);
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setSolved(boolean solved) {
		this.solved = solved;
	}
}