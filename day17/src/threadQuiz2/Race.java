package threadQuiz2;

public class Race {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable raceHorse = new RaceHorse();
		Thread raceHorse2 = new Thread(raceHorse);
		raceHorse2.start();
		
		try {
			raceHorse2.sleep(1000L);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
