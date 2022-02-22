package interval;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {
	
	@Test
	void testInterval() {
		Interval interval = new Interval();
		Interval.setOndergrens(interval, 0);
		Interval.setBovengrens(interval, 2);
		assertEquals(0, Interval.getOndergrens(interval));
		assertEquals(2, Interval.getBovengrens(interval));
		assertEquals(2, Interval.getLength(interval));
	}

}
