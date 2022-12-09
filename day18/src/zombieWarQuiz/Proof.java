package zombieWarQuiz;

public class Proof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable dynamicWildCat = new WildCat();
		Thread 	dynamicWildCat2 = new Thread(dynamicWildCat);
		dynamicWildCat2.start();
		
		try {
			dynamicWildCat2.sleep(5000L);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		Runnable dynamicZombie = new DogZombie();
		Thread dynamicZombie2 = new Thread(dynamicZombie);
		dynamicZombie2.start();
		
		Runnable dynamicZombie3 = new DogZombie();
		Thread dynamicZombie4 = new Thread(dynamicZombie);
		dynamicZombie4.start();
		
		Runnable dynamicZombie5 = new DogZombie();
		Thread dynamicZombie6 = new Thread(dynamicZombie);
		dynamicZombie6.start();
		
		Runnable dynamicZombie7 = new DogZombie();
		Thread dynamicZombie8 = new Thread(dynamicZombie);
		dynamicZombie8.start();
		
		Runnable dynamicZombie9 = new DogZombie();
		Thread dynamicZombie10 = new Thread(dynamicZombie);
		dynamicZombie10.start();
		
	}

}
