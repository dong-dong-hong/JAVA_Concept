package threadExample;

public class Somi extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i < 100; i++) {
			System.out.println("소미: 뚜벅, 뚜벅, 뚜벅" + i);
		}
	}

	
}
