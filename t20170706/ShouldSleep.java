package t20170706;

public class ShouldSleep {
	/**
	 * 判断是否应该继续睡觉
	 * @return
	 */
	public boolean shouldSleep(boolean isWeekday,boolean isVacation){
		
		return !isWeekday||isVacation;
		
	}
}
