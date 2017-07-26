package override;

public class Student {
	private final int id;
	private String name;
	private int age;
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public boolean equals(Object student) {
		if(student instanceof Student){
			int id=((Student) student).id;
			String name=((Student) student).name;
			if(this.id==id&&this.name==name){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
}
