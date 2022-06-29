package surprises;
import java.util.Random;

public class Candies implements ISurprise{
	
	private static final String[] types = {"chocolate", "jelly", "fruit", "vanilla"};
	private static Random random = new Random();
	
	private int numberOfCandies;
	private String typeOfCandies;
	
//Constructor	
	
	private Candies(int numberOfCandies, String typeOfCandies) {
		this.numberOfCandies = numberOfCandies;
		this.typeOfCandies = typeOfCandies;
	}
	
//Generate	
	
	public static ISurprise generate() {
		int n = random.nextInt(19) + 1;
		int m = random.nextInt(types.length);
		String typeOfCandy = types[m];
		
		ISurprise newSurprise = new Candies(n, typeOfCandy);
		return newSurprise;
	}
	
//Override	
	
	@Override
	public String toString() {
		String areMany = this.numberOfCandies != 1 ? "candies" : "candy";
		return this.numberOfCandies + " " +  this.typeOfCandies + " " + areMany;
	}

	@Override
	public void enjoy() {
		System.out.println("Willie Wonka just gave you: " + this.toString());
	}
}
