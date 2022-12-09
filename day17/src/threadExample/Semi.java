package threadExample;

public class Semi extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i< 100; i++) {
			System.out.println("세미: 뚜벅, 뚜벅, 뚜벅" + i);
		}
	}

	
}
