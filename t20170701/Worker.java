package t20170701;

public class Worker implements Comparable<Worker>{
	public String name;
	public  int age;
	public  double salary;
	
	public Worker(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		
		return name+":"+age+":"+salary+";";
	}
	public void work(){
		System.out.printf("#%s#开始工作...\n",name);
		System.out.printf("#%s#结束工作...\n",name);
	}
	/* 
	 * 
	 */
	@Override
	public int compareTo(Worker other) {
		if(this.salary==other.salary){
			return 0;
		}
		if(this.salary>other.salary){
			return 1;
		}else{
			return -1;
		}
	}
	@Override
	public boolean equals(Object o){
		if(o instanceof Worker){
			if(((Worker) o).name==this.name&&
					((Worker) o).age==this.age&&
					((Worker) o).salary==this.salary){
				return true;
			}
		}
		return false;		
	}
	
}
