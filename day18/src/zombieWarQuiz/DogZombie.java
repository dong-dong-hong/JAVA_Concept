package zombieWarQuiz;

public class DogZombie implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100; i++) {
			System.out.println("저벅저벅");
		}
	}

}
