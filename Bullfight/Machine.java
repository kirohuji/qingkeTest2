package Bullfight;

import java.util.Random;

public class Machine implements Dealer{
	private static Random random=new Random();
	@Override
	public boolean inti(Pokers pokers) {
		int count=1;
		for(int i=1;i<=13;i++){
			String[] stylor={
					"HEARDS",
					"SPADE",
					"CLUB",
					"DIAMOND"
					};
			for(int j=0;j<4;j++){
				Poker poker=new Poker();
				Number number=new Number(i);
				poker.setStylor(Stylor.valueOf(stylor[j]));
				poker.setNumber(number);
				int index=random.nextInt(51)+1;
				while(pokers.getPoker(index) instanceof Poker){
					index++;
					if(index>=53){
						index=1;
					}
					
				}
				pokers.setIndex(index);
				pokers.addPoker(poker);				
			}
		}

		return true;
	}

	@Override
	public boolean deal(Role[] roles,Pokers pokers) {
		int count=1;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				roles[i].addPokers(pokers.getPoker(count));
				count++;
			}
		}
		for(Role role:roles){
			role.showPokers();
		}
		return true;
	}

}
