package overRidingQuiz;

public class CatMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat = new Cat();
		YoungCat youngCat = new YoungCat();
		
		System.out.println("=====================================");
		cat.walk();
		cat.run();
		cat.getChurCntFromPcoket(2);
		System.out.println("=====================================");
		youngCat.walk();
		youngCat.run();
		youngCat.getChurCntFromPcoket(4);
	}

}
