package surprises;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FortuneCookie implements ISurprise{
	
	private static final ArrayList <String> sayings = new ArrayList <String> (Arrays.asList(
			"The fortune you seek is in another cookie.",
			"You will live long enough to open many fortune cookies.", 
			"We don't know the future, but here's a cookie.", 
			"Look how far you've come.",
			"You can always find happiness at work on Friday.", 
			"Actions speak louder than fortune cookies.",
			"It is a good day to have a good day.", 
			"All fortunes are wrong except this one.",
			"You are worth a fortune.",
			"No snowflake in an avalanche ever feels responsible",
			"The art of life is not controlling what happens to us, but using what happens to us.",
			"Little by little one travels far.",
			"What good are wings without the courage to fly.",
			"If you want the rainbow, you gotta put up with the rain.",
			"Turn your wounds into wisdom.",
			"The road to success s always under construction.",
			"The most effective way to do it, is to do it.",
			"Not all those who wander are lost.",
			"The worst enemy of creativity is self-doubt.",
			"You are your best thing."));
	
	private String theFortuneTell;
	private static Random random = new Random();
	
//Constructor	
	
	private FortuneCookie(String theFortuneTell) {
		this.theFortuneTell = theFortuneTell;
	}
	
//Generate - random, apeleaza constructorul + upcasting la perspectiva ISurprise, returneaza

	public static ISurprise generate() {
		int n = random.nextInt(sayings.size());
		
		ISurprise newSurprise = new FortuneCookie(sayings.get(n));				
		return newSurprise;
	}

//Override - toString, enjoy	
	
	@Override
	public String toString() {
		return this.theFortuneTell;
	}
	
	@Override
	public void enjoy() {
		System.out.println("What your fortune tells you today: " + this.toString());
	}
	

}
