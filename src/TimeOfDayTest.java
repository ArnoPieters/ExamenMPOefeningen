import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TimeOfDayTest {
	TimeOfDay tijd;
	TimeOfDay2 tijd2;
	@BeforeEach
	void init() {
		tijd = new TimeOfDay(8,50);
		tijd2 = new TimeOfDay2(8,50);
	}
	
	@Test
	void getHoursTest() {
		assertEquals(8,tijd.getHours());
		assertEquals(8,tijd2.getHours());
	}
	@Test
	void setHoursTest() {
		tijd.setHours(9);
		assertEquals(9,tijd.getHours());
		tijd2.setHours(9);
		assertEquals(9,tijd2.getHours());
	}
	
	@Test
	void getMinutesTest() {
		assertEquals(50,tijd.getMinutes());
		assertEquals(50,tijd2.getMinutes());
	}
	@Test
	void setMinutesTest() {
		tijd.setMinutes(5);
		assertEquals(5,tijd.getMinutes());
		tijd2.setMinutes(5);
		assertEquals(5,tijd2.getMinutes());
	}

}
