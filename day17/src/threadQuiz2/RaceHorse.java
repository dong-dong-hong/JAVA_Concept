package threadQuiz2;

public class RaceHorse implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1 ; i < 6 ; i++) {
			for(int j=0; j < 500; j++) {
			System.out.println(i + "번째 경주마: 다그닥다그닥!");
		}
	}
	}
}
