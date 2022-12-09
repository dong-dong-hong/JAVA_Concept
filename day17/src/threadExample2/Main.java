package threadExample2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread calculateThread = new Calculate();
		calculateThread.start();
	}

}
