package characters;

public class Cat extends Characters {

	// state variable
	public Boolean pullPowerOrNot;

	public void runAway() {
		if(pullPowerOrNot) {
			System.out.println("우다다다다다");
			pullPowerOrNot = false;
		} else {
			System.out.println("우다...다....");
		}
	}

	public void eat() {
		System.out.println("냠냠냠냠냠냠냠");
	}
	
	public void grooming() {
		System.out.println("스윽스윽스윽");
	}
}
