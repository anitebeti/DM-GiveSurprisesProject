package shareSurprises;
import bags.IBag;
import surprises.ISurprise;
import bags.BagFactory;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

public abstract class AbstractGiveSurprises {
	
	private IBag theBag; 
	private int waitTime;
	
	//Creaza o fabrica
	private BagFactory theFactory = new BagFactory();
	
	public AbstractGiveSurprises(String typeOfBag, int waitTime) {
		this.theBag = this.theFactory.makeBag(typeOfBag);
		this.waitTime = waitTime;
	}
	
	public void put(ISurprise newSurprise) {
		this.theBag.put(newSurprise);
	}
	
	public void put(IBag surprises) {
		this.theBag.put(surprises);
	}
	
	public void put(ArrayList<ISurprise> manySurprises) {
		this.theBag.put(manySurprises);
	}
	
//Apeleaza takeout, apoi giveWithPassion (ultima versiune)
//takeout -> apeleaza enjoy din ISurprise	
	public void give() {	
		System.out.println("\nSe imparte o singura surpriza!\n*****************************************************");
		
		this.theBag.takeout();
		this.giveWithPassion();
		
		System.out.println();
	}
	
	public void giveAll() {
		int cnt = 1;
		System.out.println("\nSe impart toate surprizele!");
		
		for (int i = 0; i < this.theBag.size();) {
			System.out.println("\n**********************    " + cnt++ + "    **********************");
			
			this.theBag.takeout();
			this.giveWithPassion();
			
			try {
				  TimeUnit.SECONDS.sleep(waitTime); 
			} catch (InterruptedException e) {
			  e.printStackTrace();
			}
		}
	}
	
	public boolean isEmpty() {
		return this.theBag.isEmpty();
	}
	
	public abstract void giveWithPassion();
	
	@Override
	public String toString() {
		return this.theBag.toString();
	}

}
