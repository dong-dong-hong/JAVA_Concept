package threadExample3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable testRunnable = new AnimalFarm();
		Thread testThread = new Thread(testRunnable);
		testThread.start();
	}

}
