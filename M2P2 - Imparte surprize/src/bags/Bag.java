package bags;
import surprises.ISurprise;
import java.util.ArrayList;

public abstract class Bag implements IBag{
	
	private ArrayList<ISurprise> bagContent = new ArrayList<ISurprise>(0);
	
	protected ISurprise getSurprise(int index) {
		return this.bagContent.get(index);
	}															

	
	protected void clearBag() {
		this.bagContent.clear();
	}
	

	protected void removeSurprise(int index) {
		this.bagContent.remove(index);
	}

	@Override
	public void put(ISurprise newSurprise) {
		this.bagContent.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprises) {
		Bag sameBag = (Bag) bagOfSurprises;
		for (int i = 0; i < bagOfSurprises.size(); i++) {
			this.bagContent.add(sameBag.getSurprise(i));
		}
		sameBag.clearBag();
	}
	
	@Override
	public void put(ArrayList<ISurprise> manySurprises) {
		for (int i = 0; i < manySurprises.size(); i++) {
			this.bagContent.add(manySurprises.get(i));
		}
	}

	@Override
	public boolean isEmpty() {
		if (this.bagContent.size() == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return this.bagContent.size();
	}
	
	@Override
	public String toString() {
		String theString = "";
		for (int i = 0; i < this.bagContent.size(); i++) {
			theString += i+1 + ". " + this.bagContent.get(i) + "\n";
		}
		return theString;
	}
	

}
