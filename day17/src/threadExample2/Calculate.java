package threadExample2;

public class Calculate extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100; i++) {
			Double randomValue = Math.random();
			System.out.println(randomValue);
		}
	}

	
}
