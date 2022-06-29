package surprises;
import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {					//final - mostenire
	
	private static Random random = new Random();
	private GatherSurprises() {}						//constructor private - nu poate fi instantiat
	
	public static ISurprise gather() {				
		int n = random.nextInt(4 - 1) + 1;
		switch(n) {
			case 1:
				return FortuneCookie.generate();
			case 2:
				return Candies.generate();
			case 3:
				return MinionToy.generate();
		}
		return null;
	}

	public static ArrayList<ISurprise> gather(int n) {
		ArrayList<ISurprise> manySurprises = new ArrayList<ISurprise>();
		for (int i = 0; i < n; i++) {
			manySurprises.add(gather());
		}
		return manySurprises;	
	}
	
	

}
