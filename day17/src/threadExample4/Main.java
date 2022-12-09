package threadExample4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable catRunnable = new Cat();
		Thread catThread = new Thread(catRunnable);
		catThread.setName("Somi");
//		try {
//			catThread.sleep(1000L);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		catThread.start();
		
		try {
			catThread.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		Runnable dogRunnable = new Dog();
		Thread dogThread = new Thread(dogRunnable);
		dogThread.setName("Duchi");
//		try {
//			dogThread.sleep(3000L);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		dogThread.start();
		
		
		try {
			dogThread.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Runnable chickenRunnable = new Chicken();
		Thread chickenThread = new Thread(chickenRunnable);
		chickenThread.setName("KkokkoDek");
//		try {
//			chickenThread.sleep(5000L);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		chickenThread.start();
		
		try {
			chickenThread.join();
		}catch(Exception e) {
			e.printStackTrace();
		}

		Runnable duckRunnable = new Duck();
		Thread duckThread = new Thread(duckRunnable);
		duckThread.setName("duckRun");
//		try {
//			duckThread.sleep(7000L);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		duckThread.start();
		
	}

}
