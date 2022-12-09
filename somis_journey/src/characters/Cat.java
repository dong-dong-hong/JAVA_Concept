package characters;

public class Cat extends Characters{

	public static Integer HP = 100;
	public static Integer MP = 100;

	// state variable
	public Boolean pullPowerOrNot;
	
	
	public void setPullPowerOrNot(Boolean pullPowerOrNot) {
		this.pullPowerOrNot = pullPowerOrNot;
	}
	

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
