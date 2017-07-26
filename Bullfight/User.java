package Bullfight;

public class User extends Model {
	private int tablesId=-1;
	private int roomid=-1;
	public int getTablesId() {
		return tablesId;
	}
	public void setTablesId(int tablesId) {
		this.tablesId = tablesId;
	}
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public User(int id,String name,double money) {
		super(id, name, money);
	}
	
}
