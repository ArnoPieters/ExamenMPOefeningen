package intlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntListTest {
	IntList lijst;
	
	@BeforeEach
	void init() {
		lijst = new IntList();
	}
	@Test
	void representationExposureTest() {
		
		int[] client = {1,2,3};
		IntList producer = new IntList(client);
		
		producer.add(5);
		assertEquals(3,client.length);
		
		client[0] = 2;
		assertEquals(1,producer.getAt(0));
		
		client = producer.toArray();
		
		client[0] = 2;
		assertEquals(1,producer.getAt(0));
		
		producer.add(5);
		assertEquals(4,client.length);
	}
	@Test
	void getLengthTest() {
		assertEquals(0,lijst.getLength());
		lijst.add(0);
		assertEquals(1,lijst.getLength());
	}
	@Test
	void getAtTest() {
		lijst.add(5);
		lijst.add(6);
		assertEquals(5,lijst.getAt(0));
		assertEquals(6,lijst.getAt(1));
	}
	@Test
	void toArrayTest() {
		lijst.add(5);
		lijst.add(6);
		assertArrayEquals(new int[] {5,6},lijst.toArray());
	}
	@Test
	void removeTest() {
		lijst.add(5);
		lijst.add(6);
		lijst.remove();
		assertEquals(1,lijst.getLength());
		assertEquals(5,lijst.getAt(0));
	}
	@Test
	void addTest() {
		lijst.add(5);
		assertEquals(1,lijst.getLength());
		assertEquals(5,lijst.getAt(0));
	}

}
