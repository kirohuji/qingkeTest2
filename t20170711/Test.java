package t20170711;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectOutputStream;
import java.io.ObjectOutputStream.PutField;
import java.io.Serializable;

public class Test implements Serializable {
//	private static final long serialVersionUID=1L;
//	public static int staticVar=5;
//	public static void main(String[] args){
//		try{
//			ObjectOutputStream out=new ObjectOutputStream(
//					new FileOutputStream("result.obj"));
//			out.writeObject(new Test());
//			
//			out.close();
//			Test.staticVar=10;
//			ObjectInputStream oin=new ObjectInputStream(
//					new FileInputStream("result.obj"));
//			Test t=(Test)oin.readObject();
//			oin.close();
//			System.out.println(t.staticVar);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//	}
	private static final long serialVersionUID = 1L;
	 
	   private String password = "pass";
	 
	   public String getPassword() {
	       return password;
	   }
	 
	   public void setPassword(String password) {
	       this.password = password;
	   }
	 
	   private void writeObject(ObjectOutputStream out) {
	       try {
	           PutField putFields = out.putFields();
	           System.out.println("ԭ����:" + password);
	           password = "encryption";//ģ�����
	           putFields.put("password", password);
	           System.out.println("���ܺ������" + password);
	           out.writeFields();
	       } catch (IOException e) {
	           e.printStackTrace();
	       }
	   }
	 
	   private void readObject(ObjectInputStream in) {
	       try {
	           GetField readFields = in.readFields();
	           Object object = readFields.get("password", "");
	           System.out.println("Ҫ���ܵ��ַ���:" + object.toString());
	           password = "pass";//ģ�����,��Ҫ��ñ��ص���Կ
	       } catch (IOException e) {
	           e.printStackTrace();
	       } catch (ClassNotFoundException e) {
	           e.printStackTrace();
	       }
	 
	   }
	 
	   public static void main(String[] args) {
	       try {
	           ObjectOutputStream out = new ObjectOutputStream(
	                   new FileOutputStream("result.obj"));
	           out.writeObject(new Test());
	           out.close();
	 
	           ObjectInputStream oin = new ObjectInputStream(new FileInputStream(
	                   "result.obj"));
	           Test t = (Test) oin.readObject();
	           System.out.println("���ܺ���ַ���:" + t.getPassword());
	           oin.close();
	       } catch (FileNotFoundException e) {
	           e.printStackTrace();
	       } catch (IOException e) {
	           e.printStackTrace();
	       } catch (ClassNotFoundException e) {
	           e.printStackTrace();
	       }
	   }
}
