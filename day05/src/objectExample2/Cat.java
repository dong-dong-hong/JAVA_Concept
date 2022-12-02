package objectExample2;

public class Cat {

	// default variable
	public Integer IegCnt;
	public Integer tailCnt;
	public Integer eyeCnt;
	public Integer noseCnt;
	public Integer mouseCnt;
	
	// static variable
	public Boolean pullPowerOrNot;
	
	public void runAway() {
		if(pullPowerOrNot) {
			System.out.println("우다다다다다");
			pullPowerOrNot = false;
		}else {
			System.out.println("우다...다...");
		}
	}
	
	public void eat() {
		System.out.println("냠냠냠냠냠냠냠냠");
	}
	
	public void gromming() {
		System.out.println("스윽스윽스윽");
	}
}
