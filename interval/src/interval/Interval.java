package interval;

/**
 * Each instance of this class represents an interval.
 * 
 * @invar De lengte is gelijk aan de bovengrens min de ondergrens.
 *     | getLength() == getBovengrens() - getOndergrens()
 * @invar De bovengrens is niet kleiner dan de ondergrens
 *     | getOndergrens() <= getBovengrens()
 */
public class Interval {
	/**
	 * @invar De lengte is niet negatief
	 *     | 0 <= lengte
	 */
	private int lengte;
	private int bovengrens;

	public int getOndergrens() {
		return bovengrens - lengte;
	}
	public int getBovengrens() {
		return bovengrens;
	}
	/**
	 * @post | result == getBovengrens() - getOndergrens()
	 */
	public int getLength() {
		return lengte;
	}
	
	/**
	 * @post | getOndergrens() == 0
	 * @post | getBovengrens() == 0
	 */
	public Interval() {
		this.lengte = 0;
		this.bovengrens = 0;
	}
	
	/**
	 * @post | getOndergrens() == ondergrens
	 * @post | getLength() == lengte
	 */
	public Interval(int ondergrens, int lengte) {
		this.lengte = lengte;
		this.bovengrens = ondergrens + lengte;
	}
	
	/**
	 * Stelt de ondergrens in.
	 * Laat de bovengrens ongewijzigd.
	 * 
	 * @throws IllegalArgumentException als de waarde groter is dan de bovengrens
	 *     | getBovengrens() < waarde
	 * 
	 * @post De ondergrens is gelijk aan de gegeven waarde.
	 *     | getOndergrens() == waarde
	 *     
	 * @mutates_properties | this.getOndergrens()
	 */
	public void setOndergrens(int waarde) {
		if (bovengrens < waarde)
			throw new IllegalArgumentException("`waarde` is groter dan de bovengrens");
		
		lengte = bovengrens - waarde;
	}
	
	/**
	 * Stelt de bovengrens in.
	 * Laat de ondergrens ongewijzigd.
	 * 
	 * @throws IllegalArgumentException
	 *     | waarde < getOndergrens()
	 * 
	 * @post De bovengrens is gelijk aan de gegeven waarde.
	 *     | getBovengrens() == waarde
	 * @post De ondergrens blijft ongewijzigd
	 *     | getOndergrens() == old(getOndergrens())
	 *     
	 * @mutates | this
	 */
	public void setBovengrens(int waarde) {
		if (waarde < bovengrens - lengte)
			throw new IllegalArgumentException("`waarde` is kleiner dan de ondergrens");
		
		lengte = waarde - (bovengrens - lengte);
		bovengrens = waarde;
	}

}
