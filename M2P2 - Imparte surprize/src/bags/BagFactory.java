package bags;

public class BagFactory implements IBagFactory{

	@Override
	public IBag makeBag (String type) {
		switch (type) {
			case "RANDOM":
				return new RandomBag();
			case "FIFO":
				return new FIFOBag();
			case "LIFO":
				return new LIFOBag();
		}
		
		return null;
	}
}
