package t20170703;

public class LearnDebug {
	public static void main(String[] args) {
		String str = null;
		for (int i = 0; i < 100; i++) {
			if (i % 15 == 0) {
				str = "��˵��";
				try {
					throw new RuntimeException();
				} catch (RuntimeException e) {
					try {
						throw new InterruptedException();
					} catch (InterruptedException e1) {
					}
				}
			} else if (i % 5 == 0) {
				str = "��˵��";
			} else if (i % 3 == 0) {
				str = "�ٷϻ�";
			} else {
				str = "��˵��";
			}
		}
	}
}
