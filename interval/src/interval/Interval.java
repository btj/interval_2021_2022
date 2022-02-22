package interval;

public class Interval {
	int ondergrens;
	int lengte;

	static int getOndergrens(Interval interval) {
		return interval.ondergrens;
	}
	
	static int getBovengrens(Interval interval) {
		return interval.ondergrens + interval.lengte;
	}
	
	static void setOndergrens(Interval interval, int waarde) {
		interval.ondergrens = waarde;
	}
	
	static void setBovengrens(Interval interval, int waarde) {
		interval.lengte = waarde - interval.ondergrens;
	}
	
	static int getLength(Interval interval) {
		return interval.lengte;
	}

}
