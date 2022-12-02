package somisJourney3;

public class HealingCat {
	
	
	// default variable
	public String NAME = "힐냥이";

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
	
	// 힐냥이 고유의 스킬들
	public void heal() {
		printLogWithName("치료하기!");
	}

	public void healAllPartner() {
		printLogWithName("모든 동료들 치료하기!");
	}
}
