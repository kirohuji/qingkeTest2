package qingke;

public abstract class AbstractCommandManager {
	//�����û����������
	public abstract CommandManager getInstanceConsoleManager();
	//����ϵͳ���������
	public abstract CommandManager getInstanceSystemManager();
}
