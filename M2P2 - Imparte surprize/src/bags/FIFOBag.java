package bags;

import surprises.ISurprise;

public class FIFOBag extends Bag{

	@Override
	public String toString() {
		if (super.size() != 0) {
			System.out.println("Tolba FIFO contine: ");
			return super.toString();
		} 
		return "Tolba FIFO este goala.";
	}
	
	@Override
	public ISurprise takeout() {
		
		ISurprise chosenSurprise = super.getSurprise(0);
		
		chosenSurprise.enjoy();
		super.removeSurprise(0);
		
		return chosenSurprise;
	}

}
