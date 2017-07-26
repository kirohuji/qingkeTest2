package t20170703;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;

public class Sheep implements Cloneable{
	HashMap flock=new HashMap();
	public Object clone(){
		try{
			return (Sheep)super.clone();
		}catch(CloneNotSupportedException e){
			throw new Error("This should never happen because we implements Cloneable");
		}
	}
	public static void main(String[] args){
		Sheep one =new Sheep();
		Sheep onew=one;
		Sheep anotherOne=(Sheep)one.clone();
		System.out.println(one==onew);
		System.out.println(one.flock==anotherOne.flock);
		String myString="Foo";
		Class stringClass=myString.getClass();
		Class stringClass2=String.class;
		System.out.println(stringClass.getName());
		try {
			Method method=Object.class.getDeclaredMethod("clone");
			int perms=method.getModifiers();
			method.setAccessible(true);
			System.out.println(Modifier.isPublic(perms));
		} catch (NoSuchMethodException | SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BankAccount myBankAccount=new BankAccount();
		try {
			Field balanceField=BankAccount.class.getField("balance");
			int mybalance=balanceField.getInt(myBankAccount);
			balanceField.setInt(myBankAccount, 42);
		} catch (NoSuchFieldException | SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try{
			String s2=(String)stringClass.newInstance();	
			System.out.println(s2.toString());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static class BankAccount{
		public int balance;
	}
}
