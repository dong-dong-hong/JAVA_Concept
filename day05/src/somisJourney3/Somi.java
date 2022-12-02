package somisJourney3;

public class Somi {

	//default variable
	public String NAME = "소미";
	
	//state variable
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
	}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("우다다다다다다");
			pullPowerOrNot = false;
		}else {
			printLogWithName("우다...다...");
		}
	}
	
	
	public void eat() {
		printLogWithName("냠냠냠냠냠냠냠");
	}
	
	public void grooming() {
		printLogWithName("스윽스윽스윽");
	}
	
	// 소미 고유의 스킬들
	public void ask() {
		printLogWithName("부탁한다냥~");
	}

	public void avoid() {
		printLogWithName("36계 줄행량이다냥~!");
	}

	public void punch() {
		printLogWithName("냥냥펀치!");
	}

	public void wrapTail() {
		printLogWithName("꼬리감기!");
	}
}
