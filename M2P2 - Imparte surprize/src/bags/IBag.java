package bags;
import surprises.ISurprise;
import java.util.ArrayList;

public interface IBag {
	
	void put (ISurprise newSurprise);		
	void put (IBag bagOfSurprises);		
	
//metoda put(ArrayList) - pentru gather(int n) care returneaza un ArrayList de ISurprise
	
	void put (ArrayList<ISurprise> manySurprises);			
	
	ISurprise takeout();			
	boolean isEmpty();
	int size();						

}
