package th.ac.npru.swe.naruapon.refactor;
// Example of Inline Refactor

public class InlineExample {
	int NumberofLateDeliveries;
	
	public int getRating() {
		if(hasMoreThanFiveLateDeiveries())
			return 2;
		else 
			return 1;
	}

	private boolean hasMoreThanFiveLateDeiveries() {
		
		return NumberofLateDeliveries > 5;
	}
	
}
