package somisJourney4;

public class Dog extends Character {

	public Boolean pullPowerOrNot;
	
	public void runAway() {
		if(pullPowerOrNot) {
			System.out.println("샤샤샤샤샥");
			pullPowerOrNot = false;
		}else {
			System.out.println("샤샤..샤샤....");
		}
	}
	
	public void eat() {
		System.out.println("냠냠냠냠냠냠냠");
	}
}
