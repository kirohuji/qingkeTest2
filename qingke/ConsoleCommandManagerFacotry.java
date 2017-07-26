package qingke;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsoleCommandManagerFacotry extends AbstractCommandManager{
	private static volatile CommandManager commandManager;
	@Override
	public CommandManager getInstanceConsoleManager() {
		return commandManager=getInstance();
	}

	@Override
	public CommandManager getInstanceSystemManager() {
		return null;

	}
	public static synchronized CommandManager getInstance() {
		if (commandManager == null) {
			return (ConsoleCommandManager)(commandManager = new ConsoleCommandManager());
		}
		return null;
	}
}
