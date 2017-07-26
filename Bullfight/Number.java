package Bullfight;

public class Number {
	
	public Number(int number) {
		super();
		this.number = number;
	}
	private int number;
	public char pokering(){
		return 0;
//		if(number<=10){
//			return (char) ('0'+number);
//		}else if(number==11){
//			return 'J';
//		}else if(number==12){
//			return 'Q';
//		}else if(number==13){
//			return 'K';
//		}
//		return 0;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
