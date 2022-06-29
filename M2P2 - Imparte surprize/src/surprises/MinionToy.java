package surprises;

public class MinionToy implements ISurprise{

	private static final String[] allNames = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};
	private String minionName;
	private static int cnt = 0;
	
//Constructor	
	
	private MinionToy(String minionName) {
		this.minionName = minionName;
	}
	
//Generate
	
	public static ISurprise generate() {
		String minionName;
		
		if (cnt == allNames.length - 1) {
			cnt = 0;
			minionName = allNames[cnt];
		} else {
			minionName = allNames[cnt];
		}
		
		cnt++;
		
		ISurprise newSurprise = new MinionToy(minionName);
		return newSurprise;
	}
	
//Override	
	
	@Override
	public String toString() {
		return this.minionName;
	}
	
	@Override
	public void enjoy() {
		System.out.println("Today you're having fun with minion " + this.toString());
		
	}

	
}
