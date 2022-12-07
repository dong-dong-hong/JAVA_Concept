package characters;

public class Dog extends Characters {
	
	public static Integer HP = 100;
	public static Integer MP = 100;

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
		
		public Integer getHp() {
			return HP;
		}
		
		public void setHp(Integer hp) {
			this.HP = hp;
		}
		
		public Integer getMp() {
			return MP;
		}
		
		public void setMp(Integer mp) {
			this.MP = mp;
		}
}
