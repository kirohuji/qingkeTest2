package goFusanGame;

import java.util.Random;

public abstract class AbstractVechicele {
	public static Vehicle getVehicle() {
		Vehicle vehicle;
		int count=new Random().nextInt(10) + 1;
		switch (count){
		case 10:
		case 9:
			vehicle = () -> {
				int add=(new Random().nextInt(4) + 12);
				
				return add;// �ɻ�
			};
			break;
		case 8:
		case 7:
		case 6:
		case 5:
			vehicle = () -> {// ��
				int add=(new Random().nextInt(5) + 8);
				return add;// 
			};
			break;
		default:
			vehicle = () -> {
				int add=(new Random().nextInt(6) + 3);
				return add;// ������
			};
			break;
		}
		return vehicle;
	}

}
