package override;

public class TextSize {
	public static void main(String[] args){
		Size s=Enum.valueOf(Size.class, "SMALL");
		System.out.println(Size.SMALL.toString());
		Size[] values=Size.values();
		for(Size i:values){
			System.out.println(i);
		}
	}
}
