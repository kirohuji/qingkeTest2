package Bullfight;

import java.util.Random;

public class Table {
	private int tableId;
	private User[] users=new User[5];
	private int userCount=0;
	private Pokers pokers=new Pokers();
	private Role[] roles=new Role[5];
	private Machine machine=new Machine();
	private boolean status;
	public static int PokerNumber=5;
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	public User[] getUsers() {
		return users;
	}
	public void addUsers(User[] users) {
		if(userCount>4){
			System.out.println("��������");
		}else{
			for(User user:users){
				if(userCount>4){
					System.out.println("��������");{
						user.setTablesId(tableId);
				       users[userCount++]=user;
					}				
				}
			}
		}
	}
	public void addUsers(User user) {
		if(userCount>4){
			System.out.println("��������");
		}else{
			user.setTablesId(tableId);
			users[userCount++]=user;
		}
	}
	public boolean isStatus() {
		return status;
	}
	public void initalization(){
		machine.inti(pokers);
//		for(int i=1;i<pokers.length();i++){
//			System.out.print(pokers.getPoker(i).getNumber());
//			System.out.print(":"+pokers.getPoker(i).getStylor());
//			System.out.println();
//		}
		System.out.println(pokers.length());
	}
	public void startGame(){
		initalization();
		//1����ׯ��,2�����м�
		userToRole(users);
		int zj=new Random().nextInt(4);
		for(Role role:roles){
			role.setIdtity(2);
		}
		roles[zj].setIdtity(1);
		status=true;
		machine.deal(roles,pokers);
		
		int max=0;
		int count=0;
		boolean flag=true;
		for(Role role:roles){
			role.tran();
			if(role.getIdtity()==1){
				count=role.getMax()%10;
			}
		}
		for(Role role:roles){

			System.out.println(role.getName()+"����"+role.getIdtity()+"�ҵ����ֵ��"+role.tran()+"ţ��"+role.getMax()%10);
			if(role.getIdtity()==1){
				
			}else{
				if((role.getMax()%10)>count){
					flag=false;
				}
			}
			
		}
		System.out.println("ׯ�ҵĵ�����"+count);
		if(flag){
			System.out.println("ׯ��Ӯ��");
		}else{
			System.out.println("ׯ������");
		}
	}
	public void userToRole(User[] users){
		    for(int i=0;i<PokerNumber;i++){
		    	Role role=new Role(users[i].getId(),users[i].getName(),users[i].getMoney());
		    	roles[i]=role;
		    }
	}

}
