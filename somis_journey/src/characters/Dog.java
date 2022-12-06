package characters;

public class Dog extends Characters {

	// state variable
		public Boolean pullPowerOrNot;

		public void runAway() {
			if(pullPowerOrNot) {
				System.out.println("샤샤샤샤샥");
				pullPowerOrNot = false;
			} else {
				System.out.println("샤샤..샤샥...");
			}
		}

		public void eat() {
			System.out.println("냠냠냠냠냠냠냠");
		}
}
