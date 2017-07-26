package qingke;

import java.sql.SQLException;

public class BeSuperApplication {
	private static boolean flag=false;
	private static BeSuperLauncherFacotry bslf;
	public static void main(String[] args) throws InterruptedException {
		bslf=new BeSuperLauncherFacotry();
		Thread main=new Thread(() -> {
			BeSuperLauncher bsl = BeSuperLauncherFacotry.getInstance();
			try {
				flag = bsl.execute();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		main.start();
		main.join();
		
		if (flag) {
			System.out.println("success");
		} else {
			System.out.println("进程运行失败");
		}
	}

}
