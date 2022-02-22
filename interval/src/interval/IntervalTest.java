package interval;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {
	
	class Interval {
		int ondergrens;
		int bovengrens;
	}
	 
	int getOndergrens(Interval interval) {
		return interval.ondergrens;
	}
	
	int getBovengrens(Interval interval) {
		return interval.bovengrens;
	}
	
	void setOndergrens(Interval interval, int waarde) {
		interval.ondergrens = waarde;
	}
	
	void setBovengrens(Interval interval, int waarde) {
		interval.bovengrens = waarde;
	}
	
	int getLength(Interval interval) {
		return interval.bovengrens - interval.ondergrens;
	}
	
	@Test
	void testInterval() {
		Interval interval = new Interval();
		setOndergrens(interval, 0);
		setBovengrens(interval, 2);
		assertEquals(0, getOndergrens(interval));
		assertEquals(2, getBovengrens(interval));
		assertEquals(2, getLength(interval));
	}

}
