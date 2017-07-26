package Bullfight;

import java.util.Scanner;

public class Execute {
	public static void main(String[] args){
		Room room=new Room();
		room.initalization();
		User a=new User(1,"wbx",1000.0);
		User b=new User(2,"whd",1000.0);
		User c=new User(3,"wzy",1000.0);
		User d=new User(4,"lw",1000.0);
		User e=new User(5,"zyd",1000.0);		
		room.intoRoom(a);
		room.intoRoom(b);
		room.intoRoom(c);
		room.intoRoom(d);
		room.intoRoom(e);
		room.addTable(1);
		room.intoTable(a, 1);
		room.intoTable(b, 1);
		room.intoTable(c, 1);
		room.intoTable(d, 1);
		room.intoTable(e, 1);
		room.tableSet(room.getTableById(1));
		room.getTableById(1).startGame();
//		while(true){
//			System.out.println("还玩吗？输入yes还玩，no不玩");
//			Scanner in=new Scanner(System.in);
//			String str=in.nextLine();
//			if(str.equalsIgnoreCase("no")){
//				break;
//			}else{
//				System.out.println(str);
//				room.getTableById(1).startGame();
//			}
//			
//		}
	
	}
}
