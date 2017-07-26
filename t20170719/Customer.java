package t20170719;

public class Customer {
	private int id;
	private String name;

	public Customer(int i, String n) {
		this.id = i;
		this.name = n;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
