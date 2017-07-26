package Bullfight;

public class Pokers {
	private Poker[] pokers;
	private int count;
	private int index;
	public Pokers(){
		pokers=new Poker[54];
		count=1;
		index=count;
	}
	public void addPoker(Poker poker){
		pokers[index]=poker;
		count++;
	}
	public int getIndex(){
		return index;
	}
	public int length(){
		return count;
	}
	public void setIndex(int index){
		this.index=index;
	}
	public Poker getPoker(int index){
		//System.out.println(pokers[index].getNumberToInt());
		return pokers[index];
	}
}
