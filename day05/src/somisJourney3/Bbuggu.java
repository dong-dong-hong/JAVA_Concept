package somisJourney3;

public class Bbuggu {

	//default variable
	public String NAME  = "뿌꾸";
	
	// state variable
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
	}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("샤샤샤샤샥");
			pullPowerOrNot = false;
		} else {
			printLogWithName("샤샤..샤샥...");
		}
	}

	public void eat() {
		printLogWithName("냠냠냠냠냠냠냠");
	}
	
	// 뿌꾸 고유의 스킬들
	public void bornAttack() {
		printLogWithName("뼈다귀 공격!");
	}

	public void bodyShot() {
		printLogWithName("몸통 박치기!");
	}

	public void dogUpperCut() {
		printLogWithName("멍멍어퍼컷!");
	}

	public void dogSideKick() {
		printLogWithName("멍멍 옆차기!");
	}
}
