package t20170704;

public class XiaomingWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread cThread=new Thread(()->{
			int i=0;
			while(i<100){
				i++;
				try {
					Thread.sleep(10);
					System.out.println("zyd");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		cThread.setName("zyd");
		cThread.start();
		try{
			cThread.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("zydjoin");
	}

}
