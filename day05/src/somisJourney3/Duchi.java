package somisJourney3;

public class Duchi {

	//default variable
	public String NAME = "두치";
	
	// state variable
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
	}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("샤샤샤샤샥");
			pullPowerOrNot = false;
		}else {
			printLogWithName("샤샤..샤샥..");
		}
	}
	public void eat() {
		printLogWithName("냠냠냠냠냠냠냠냠");
	}
	
	//두치 고유의 스킬들
	public void bornAttack() {
		printLogWithName("벼다귀 공격");
	}

	public void bodyShot() {
		printLogWithName("몸통 박치기!");
	}
	
	public void dogPunch() {
		printLogWithName("멍멍펀치");
	}
	
	public void dogBackKick() {
		printLogWithName("멍멍 뒤돌려차기");
	}
	
}
