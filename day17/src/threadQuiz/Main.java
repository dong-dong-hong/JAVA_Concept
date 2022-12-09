package threadQuiz;

public class Main {

	Thread start = new StartFallFromSky();
	private String talkSomething;

	public static void talkSomething() {
		for(int i = 1; i <=10; i++) {
			if(i == 3) {
				System.out.println(i + "번째는 엄마");
			}else if(i == 5) {
				System.out.println(i + "번째는 아빠");
			}else if(i == 8) {
				System.out.println(i+ "번째는 동생");
			}else {
				System.out.println(i + "번째는 관심없어~");
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		talkSomething();
	}

}
