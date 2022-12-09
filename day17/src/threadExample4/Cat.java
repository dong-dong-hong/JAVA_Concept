package threadExample4;

public class Cat implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
//		System.out.println("Thread name: " + Thread.currentThread().getName());
		
		for(int i= 0; i < 1000; i++) {
			System.out.println("고양이 : 야옹~~");
		}
	}
	
}
