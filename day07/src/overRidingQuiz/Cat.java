package overRidingQuiz;

public class Cat {
	
	public int chur = 2;

	public void walk(){
		System.out.println("뾱뾱뾱");
	}
	
	public void run() {
		System.out.println("또박또박");
	}

	public void getChurCntFromPcoket(int chur) {
		System.out.println(this.chur);
	}
}
