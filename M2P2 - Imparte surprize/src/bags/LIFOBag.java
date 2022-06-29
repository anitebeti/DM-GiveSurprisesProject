package bags;

import surprises.ISurprise;

public class LIFOBag extends Bag{

	@Override
	public String toString() {
		if (super.size() != 0) {
			System.out.println("Tolba LIFO contine: ");
			return super.toString();
		} 
		return "Tolba LIFO este goala.";
	}
	
	@Override
	public ISurprise takeout() {
		ISurprise chosenSurprise = super.getSurprise(super.size() - 1);
		
		chosenSurprise.enjoy();
		super.removeSurprise(super.size() - 1);
		
		return chosenSurprise;
	}

}
