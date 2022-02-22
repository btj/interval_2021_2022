package interval;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {
	
	@Test
	void testInterval() {
		Interval interval = new Interval();
		interval.setOndergrens(0);
		interval.setBovengrens(2);
		assertEquals(0, interval.getOndergrens());
		assertEquals(2, interval.getBovengrens());
		assertEquals(2, interval.getLength());
	}

}
