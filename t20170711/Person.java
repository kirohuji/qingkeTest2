package t20170711;

public class Person {
	private int attr1;
	private int attr2;
	private int attr3;
	
	public Person() {
		super();
	}
	public Person(int attr1, int attr2, int attr3) {
		super();
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
	}
	public int getAttr1() {
		return attr1;
	}
	public void setAttr1(int attr1) {
		this.attr1 = attr1;
	}
	public int getAttr2() {
		return attr2;
	}
	public void setAttr2(int attr2) {
		this.attr2 = attr2;
	}
	public int getAttr3() {
		return attr3;
	}
	public void setAttr3(int attr3) {
		this.attr3 = attr3;
	}
}
