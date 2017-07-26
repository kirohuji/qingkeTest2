package t20170708;

public class EnumTest {
	public enum Size{
		SMALL("S"),
		MEDIUM("M"),
		LARGE("L"),
		EXTRA_LARGE("XL");
		private String abbreviation;
		private Size(String abbreviation){
			this.abbreviation=abbreviation;
		}
		public String getAbbreviation(){
			return abbreviation;
		}
	}
	public static void main(String[] args){
		Size s=Enum.valueOf(Size.class, "SMALL");
		Size[] values=Size.values();
		System.out.println(Size.SMALL.toString());
		
	}
}
