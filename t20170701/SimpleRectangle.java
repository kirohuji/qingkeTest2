package t20170701;

public class SimpleRectangle {
	private int length;
	private int width;
	public SimpleRectangle(int len,int wid){
		length=len;
		width=wid;
		
	}
	public int getLength(){
		return length;
	}
	public int getWidth(){
		return width;
	}
	public String toString(){
		return "Rectangle"+getLength()+"by"+getWidth();
	}
	
}
