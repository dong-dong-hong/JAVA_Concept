package overRidingQuiz;

public class YoungCat extends Cat {
	
	
	public Integer chur = 4 ;

	@Override
	public void walk() {
		// TODO Auto-generated method stub
//		super.walk();
		System.out.println("뿅뿅뿅");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		System.out.println("뚜벅뚜벅");
	}

	@Override
	public void getChurCntFromPcoket(int chur) {
		// TODO Auto-generated method stub
//		super.getChurCntFromPcoket(chur);
		System.out.println(this.chur);
	}


}


