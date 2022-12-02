package somisJourney3;

public class WildCat {

	
	// default variable
	public String NAME = "냥아치";
	
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
	
	// 냥아치 고유의 스킬들
	public void powerFingerNail() {
		printLogWithName("초강력 손톱!");
	}

	public void powerFootNail() {
		printLogWithName("초강력 발톱!");
	}

	public void yarn() {
		printLogWithName("하악~!");
	}
}
