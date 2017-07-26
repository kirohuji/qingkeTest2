package animal;

public  class Animal {
	private String name;
	private String id;
	private int weight;
	private int height;
	protected int age;

	public Animal(String name, String id, int weight, int height, int age) {
		super();
		this.name = name;
		this.id = id;
		this.weight = weight;
		this.height = height;
		this.age = age;
	}

	public Animal(String id, int weight, int height, int age) {
		super();
		this.id = id;
		this.weight = weight;
		this.height = height;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void run() {
		System.out.println(name + "在跑步" + age + "个月");
	}
	public String getKind(){
		return this.getClass().getSimpleName();
	}
	
}
