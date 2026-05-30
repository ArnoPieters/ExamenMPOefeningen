
/**
 * @invar | 0<= getHours() && getHours() <24
 * @invar | 0<= getMinutes() && getMinutes()< 60
 */
public class TimeOfDay {
	/**
	 * @invar | 0<= hours && hours <24
	 * @invar | 0<= minutes && minutes <60
	 */
	private int hours;
	private int minutes;
	/**
	 * @pre | 0<= hours && hours <24
	 * @pre | 0<= minutes && minutes <60
	 * @post | getHours() == hours
	 * @post | getMinutes() == minutes
	 */
	public TimeOfDay(int hours,int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}
	/**
	 * @pre | 0<= hour && hour <24
	 * @mutates | this
	 * @post | getHours() == hour
	 * @post | getMinutes() == old(getMinutes())
	 */
	public void setHours(int hour) {
		hours = hour;
	}
	 /**
	 *
	 * @pre | 0<= minute && minute <60
	 * @mutates | this
	 * @post | getMinutes() == minute
	 * @post | getHours() == old(getHours())
	  */
	public void setMinutes(int minute) {
		minutes = minute;
	}
	/**
	 * @post | 0<=result && result <24
	 *
	 */
	public int getHours() {
		return hours;
	}
	/**
	 * @post | 0<= result && result <60
	 * 
	 */
	public int getMinutes() {return minutes;}
}
