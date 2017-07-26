package qingke;

public class BeSuperLauncherFacotry {
	private static volatile BeSuperLauncher bsl;
	public static synchronized BeSuperLauncher getInstance() {
		if (bsl == null) {
			return bsl = new BeSuperLauncher();
		}
		return null;
	}

}
