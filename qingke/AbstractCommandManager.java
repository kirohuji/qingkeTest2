package qingke;

public abstract class AbstractCommandManager {
	//创建用户命令管理器
	public abstract CommandManager getInstanceConsoleManager();
	//创建系统命令管理器
	public abstract CommandManager getInstanceSystemManager();
}
