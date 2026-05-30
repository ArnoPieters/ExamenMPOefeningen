import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TimeOfDayTest {
	TimeOfDay tijd;
	@BeforeEach
	void init() {
		tijd = new TimeOfDay(8,50);
	}
	
	@Test
	void getHoursTest() {
		assertEquals(8,tijd.getHours());
	}
	@Test
	void setHoursTest() {
		tijd.setHours(9);
		assertEquals(9,tijd.getHours());
	}
	
	@Test
	void getMinutesTest() {
		assertEquals(50,tijd.getMinutes());
	}
	@Test
	void setMinutesTest() {
		tijd.setMinutes(5);
		assertEquals(5,tijd.getMinutes());
	}

}
