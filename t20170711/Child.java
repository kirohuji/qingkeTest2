package t20170711;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Child extends Person implements Serializable{
	private int attr4;
	private transient int attr5;
	public int getAttr4() {
		return attr4;
	}
	public void setAttr4(int attr4) {
		this.attr4 = attr4;
	}
	public int getAttr5() {
		return attr5;
	}
	public void setAttr5(int attr5) {
		this.attr5 = attr5;
	}
	public Child(int attr4, int attr5) {
		super(1,2,3);
		this.attr4 = attr4;
		this.attr5 = attr5;
	}
	public static void main(String[] args){
		try{
			ObjectOutputStream out=new ObjectOutputStream(
					new FileOutputStream("result.obj"));
			out.writeObject(new Child(1,2));
			
			out.close();
			
			ObjectInputStream oin=new ObjectInputStream(
					new FileInputStream("result.obj"));
			Person t=(Person) oin.readObject();
			oin.close();
			System.out.println(t);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public String toString(){
		return this.attr4+":"+this.attr5;
	}
}
