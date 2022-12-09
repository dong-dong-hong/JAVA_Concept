package zombieWarQuiz;

import java.util.ArrayList;

public class WildCat implements Runnable{

	SniperRifle sniper = new SniperRifle();
	
	BulletType bulletType3 = BulletType.SILVER;
	
	ArrayList<BulletType> bulletHouse = new ArrayList<>();
	
	private ArrayList<BulletType> buelltHouse;
	
	public void setBulletHouse(ArrayList<BulletType> bulletType) {
		this.buelltHouse = bulletType;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i < 20; i++) {
			sniper.shoot();
		}
	}

}
