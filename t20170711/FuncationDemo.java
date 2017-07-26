package t20170711;

import java.util.function.Function;

import org.junit.Assert;
import org.junit.Test;

public class FuncationDemo {
	
	@Test
	public void test(){
		Assert.assertEquals(2,answerF(1, val -> val + 1));
		Assert.assertEquals(2,answerS(1,()->2));
		answerC(2,System.out::println);
		answerP(3,val->val==2);
		answerA("success",System.out::println);
		
	}

	static int answerF(int value, Function<Integer, Integer> function) {
		return function.apply(value);
	}
	static int answerS(int value,Supplier<Integer> supplier){
		return supplier.get();
		
	}
	static void answerC(int value,Consumer<Integer> consumer){
		 consumer.accept(value);
	}
	static void answerP(int value,Predicate<Integer> predicate){
		if(predicate.test(value)){
			System.out.println(value);
		}else{
			System.out.println("fault");
		}
	}
	static void answerA(String msg,A a){
		a.show(msg);
	}
	static interface Funcation<T,R>{
		R apply(T t);
	}
	static interface Supplier<T>{
		T get();
	}
	static interface Consumer<T>{
		void accept(T t);
	}
	static interface Predicate<T>{
		boolean test(T t);
	}
	static interface A{
		void show(String s);
	}
}
