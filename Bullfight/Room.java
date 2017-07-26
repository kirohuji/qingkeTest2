package Bullfight;

public class Room {
	private int roomId=0;
	private Table[] tables;
	private int tableId=-1;
	private User[] users=new User[5];
	private static int count=0;
	public void initalization(){
		tables=new Table[10];
		
	}
	public boolean intoRoom(User[] users){
		for(User user:users){
			user.setRoomid(roomId);
			users[count++]=user;
			
		}
		return true;
	}
	public boolean intoRoom(User user){
		user.setRoomid(roomId);
		users[count++]=user;
		return true;
	}
	public boolean intoTable(User[] users,int tableId){
		    
			tables[tableId].addUsers(users);
		return true;
		
	}
	public boolean intoTable(User user,int tableId){
		    tables[tableId].addUsers(user);
		return true;
		
	}
	public boolean tableSet(Table table){	
		table.userToRole(users);
		return true;
		
	}
	public Table getTableById(int tableId){
		return tables[tableId];
	}
	public boolean addTable(int tableId){
		tables[tableId]=new Table();
		tables[tableId].setTableId(tableId);
		this.tableId=tableId;
		return true;
		
	}

	
}
