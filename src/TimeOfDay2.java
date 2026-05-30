/**
 * @invar | 0<= getHours() && getHours() <24
 * @invar | 0<= getMinutes() && getMinutes()< 60
 */
public class TimeOfDay2 {
	/**
	 * @invar | 0<= minutesSinceMidnight && minutesSinceMidnight < 1440
	 */
	private int minutesSinceMidnight;
	/**
	 * @pre | 0<= hours && hours <24
	 * @pre | 0<= minutes && minutes <60
	 * @post | getHours() == hours
	 * @post | getMinutes() == minutes
	 */
	public TimeOfDay2(int hours,int minutes) {
		minutesSinceMidnight = hours*60 + minutes;
	}
	/**
	 * @pre | 0<= hour && hour <24
	 * @post | getHours() == hour
	 */
	public void setHours(int hour) {
		minutesSinceMidnight = minutesSinceMidnight %60+hour*60;
	}
	 /**
	 *
	 * @pre | 0<= minute && minute <60
	 * 
	 * @post | getMinutes() == minute
	  */
	public void setMinutes(int minute) {
		minutesSinceMidnight = (minutesSinceMidnight/60)*60+minute;
	}
	/**
	 * @post | 0<=result && result <24
	 *
	 */
	public int getHours() {
		return minutesSinceMidnight/60;
	}
	/**
	 * @post | 0<= result && result <60
	 * 
	 */
	public int getMinutes() {return minutesSinceMidnight%60;}
}

