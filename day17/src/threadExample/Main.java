package threadExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread somiThread = new Somi();
		somiThread.start();
		
		Thread semiThread = new Semi();
		semiThread.start();
	}

}
