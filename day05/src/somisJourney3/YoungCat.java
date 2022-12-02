package somisJourney3;

public class YoungCat {
	
	
	// default variable
	public String NAME = "켓초딩";

	// state variable
	public Boolean pullPowerOrNot;

	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
	}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("우다다다다다");
			pullPowerOrNot = false;
		} else {
			printLogWithName("우다...다....");
		}
	}

	public void eat() {
		printLogWithName("냠냠냠냠냠냠냠");
	}
	
	public void grooming() {
		printLogWithName("스윽스윽스윽");
	}
	
	// 켓초딩 고유의 스킬
	public void cry() {
		printLogWithName("으아아아앙~");
	}
}
