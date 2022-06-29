package bags;
import surprises.ISurprise;
import java.util.Random;

public class RandomBag extends Bag{
	
	private static Random random = new Random();
	
	@Override
	public String toString() {
		if (!super.isEmpty()) {
			System.out.println("Tolba random contine: ");
			return super.toString();
		} 
		return "Tolba random este goala.";
	}
	
//Alege random un nr, alege surpriza random din tolba, apeleaza enjoy, apoi sterge surpriza din tolba	
	
	@Override
	public ISurprise takeout() {
		int n = random.nextInt(super.size());
		ISurprise chosenSurprise = super.getSurprise(n);
		
		chosenSurprise.enjoy();
		super.removeSurprise(n);
		
		return chosenSurprise;
	}

}
