package Bullfight;

public class Role extends Model{
	private Poker[] pokers=new Poker[5];
	private int idtity=2;
	private int times=1;;
	private int count=0;
	private int max=0;
	private int index=0;
	public int indexCount;
	public int getIndexCount() {
		return indexCount;
	}
	public void setIndexCount(int indexCount) {
		this.indexCount = indexCount;
	}
	public void showPokers(){
		if(idtity==1){
			System.out.println("老子是庄家"+name);
			
		}else{
			System.out.println("妈卖批,我是闲家"+name);
		}
		for(Poker poker:pokers){
			System.out.print(poker.getNumberToInt());
			System.out.print(":"+poker.getStylor());
			System.out.println();
		}
	}
	public void addPokers(Poker poker) {
		this.pokers[index++] = poker;
	}
	private int[] aNum=new int[Table.PokerNumber];
	
	public int getIdtity() {
		return idtity;
	}
	public void setIdtity(int idtity) {
		this.idtity = idtity;
	}
	//pokers里的数据
	public int tran(){
		int[] aNum=new int[Table.PokerNumber];
		for(int i=0;i<Table.PokerNumber;i++){
			aNum[i]=pokers[i].getNumberToInt();
		}
		compute(aNum,0,aNum.length);
		
		return max;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	//交换数组中的数据
	public void swap(int[] aNum,int i,int j){
		int temp=aNum[i];
		aNum[i]=aNum[j];
		aNum[j]=temp;
	}
	//全排序算法
	public void compute(int[] aNum,int start,int length){
		if(start==length-1){
			if((aNum[0]+aNum[1]+aNum[2])%10==0){
//				indexCount=aNum[0]+aNum[1]+aNum[2];
				count=aNum[3]+aNum[4];
				if(count>max){
					max=count;
				}
			}
		}else{
			for(int i=start;i<length;i++){
				swap(aNum,start,i);
				compute(aNum,start+1,length);
				swap(aNum,start,i);
			}
		}
	}
	public Role(int id, String name, double money) {
		super(id, name, money);
		

	}
}