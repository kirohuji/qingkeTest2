package animal;

public class Zoo {
	private String zoopper;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo zoo=new Zoo();
		Animal panda=new Panda("–‹√®",50);
		System.out.println(panda.getAge());
		panda.run();
		System.out.println(panda.toString());
		
	}

}
