package interval;

public class Interval {
	int ondergrens;
	int lengte;

	int getOndergrens() {
		return this.ondergrens;
	}
	
	int getBovengrens() {
		return this.ondergrens + this.lengte;
	}
	
	void setOndergrens(int waarde) {
		this.ondergrens = waarde;
	}
	
	void setBovengrens(int waarde) {
		this.lengte = waarde - this.ondergrens;
	}
	
	int getLength() {
		return this.lengte;
	}

}
