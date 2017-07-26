package t20170719;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriporityQueue {

	public static void main(String[] args) {
		Queue<Integer> integerPriorityQueue=new PriorityQueue<>();
		Random rand=new Random();
		for(int i=0;i<7;i++){
			integerPriorityQueue.add(new Integer(rand.nextInt(100)));
		}
		for(int i=0;i<7;i++){
			Integer in=integerPriorityQueue.poll();
			System.out.println("Processing Integer:"+in);
		}
		Queue<Customer> customerPriorityQueue=new PriorityQueue<>(7,(c1,c2)->
			(int)(c1.getId() - c2.getId())
		);
		addDataToQueue(customerPriorityQueue);
		pollDataFromQueue(customerPriorityQueue);
	}
	private static void addDataToQueue(Queue<Customer> customerPriorityQueue){
		Random rand=new Random();
		for(int i=0;i<7;i++){
			int id=rand.nextInt(100);
			customerPriorityQueue.add(new Customer(id,"Pankaj"+id));
		}
	}
	private static void pollDataFromQueue(Queue<Customer> customerPriporityQueue){
		while(true){
			Customer cust=customerPriporityQueue.poll();
			if(cust==null)break;
			System.out.println("Processint Customer with Id="+cust.getId());
		}
	}
}
