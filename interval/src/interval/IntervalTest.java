package interval;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {
	
	@Test
	void testInterval() {
		Interval interval = new Interval(0, 2);
		assertEquals(0, interval.getOndergrens());
		assertEquals(2, interval.getBovengrens());
		assertEquals(2, interval.getLength());
		
		interval.setOndergrens(-5);
		assertEquals(-5, interval.getOndergrens());
		assertEquals(2, interval.getBovengrens());
		assertEquals(7, interval.getLength());
		
		interval.setBovengrens(9);
		assertEquals(-5, interval.getOndergrens());
		assertEquals(9, interval.getBovengrens());
		assertEquals(14, interval.getLength());
	}

}
