package somisJourney3;

public class GamblingCat {

	// default variable
	public String NAME = "냥쓸이";

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
	
	// 냥쓸이 고유의 스킬들
	public void toGamble() {
		printLogWithName("베팅하기!");
	}

	public void allIn() {
		printLogWithName("올인!");
	}

	public void fakeHand() {
		printLogWithName("밑장빼기!");
	}
}
