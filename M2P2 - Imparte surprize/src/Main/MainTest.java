package Main;
import bags.*;
import shareSurprises.*;
import surprises.GatherSurprises;

public class MainTest {

	public static void main(String[] args) {
		
//Instantiat fabrica		
		BagFactory theFactory = new BagFactory();
		
//Instantiat tolba RANDOM prin fabrica 		
		IBag randomBag = theFactory.makeBag("RANDOM");

//Adaugat 4 surprize random in tolba random		
		randomBag.put(GatherSurprises.gather());
		randomBag.put(GatherSurprises.gather());
		randomBag.put(GatherSurprises.gather());
		randomBag.put(GatherSurprises.gather());
		
		System.out.println(randomBag.toString());
		
		
		
//Instantiat tolba FIFO	+ 5 surprize
		IBag FIFOBag = theFactory.makeBag("FIFO");	
		FIFOBag.put(GatherSurprises.gather(5));
		
		System.out.println(FIFOBag.toString());
		
		
		
//Instantiat tolba LIFO + 7 surprize		
		IBag LIFOBag = theFactory.makeBag("LIFO");
		LIFOBag.put(GatherSurprises.gather(7));
		
		System.out.println(LIFOBag.toString());
		
		System.out.println("-----------------IMPARTIREA SURPRIZELOR----------------\n");
		
//Impartirea cadourilor
		
//	- instantiat tipuri de oferit surprize
//	- adaugat randomBag (apel put din AbstractGiveSurprises si delegare spre IBag)
//	- afisare ambele tolbe (sing si randomBag care acum e gol) 
//	- give sau giveAll
		
//Sing - RANDOM
		System.out.println("\n-----SING - TOLBA RANDOM-----\n");
		
		GiveSurpriseAndSing sing = new GiveSurpriseAndSing("RANDOM", 2);
		sing.put(randomBag);
		
		System.out.println(sing.toString());
		System.out.println(randomBag.toString());
		
		sing.giveAll();
		
//Hug - LIFO	
		System.out.println("\n-----HUG - TOLBA LIFO-----\n");
		
		GiveSurpriseAndHug hug = new GiveSurpriseAndHug("LIFO", 1);
		hug.put(LIFOBag);
		
		System.out.println(hug.toString());
		System.out.println(LIFOBag.toString());
		
		hug.give();
		hug.giveAll();
		
//Applause - FIFO	
		System.out.println("\n-----APPLAUSE - TOLBA FIFO-----\n");
		
		GiveSurpriseAndApplause applause = new GiveSurpriseAndApplause("FIFO", 1);
		
		applause.put(FIFOBag);
		System.out.println(applause.toString());
		System.out.println(FIFOBag.toString());
		
		applause.giveAll();
		
		
		
	
		
		
		
		
		
		

	}

}
