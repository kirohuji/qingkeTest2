package t20170705;

public class Student {
	private String name;
	private Integer grade1;
	private Integer grade2;
	private Integer grade3;
	private Integer total;
	public String getName() {
		return name;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGrade1() {
		return grade1;
	}
	public void setGrade1(Integer grade1) {
		this.grade1 = grade1;
	}
	public Integer getGrade2() {
		return grade2;
	}
	public void setGrade2(Integer grade2) {
		this.grade2 = grade2;
	}
	public Integer getGrade3() {
		return grade3;
	}
	public void setGrade3(Integer grade3) {
		this.grade3 = grade3;
	}
	public Student(String name, Integer grade1, Integer grade2, Integer grade3) {
		super();
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.total=this.grade1+this.grade2+this.grade3;
	}
	public void compute(){
		total=grade1+grade2+grade3;
	}
	public String toString(){
		return "ĞÕÃû:"+this.name+":"+this.grade1+":"+this.grade2+":"+this.grade3+";×Ü³É¼¨:"+this.total;
	}
}
