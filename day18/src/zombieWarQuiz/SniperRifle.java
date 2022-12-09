package zombieWarQuiz;

import java.util.ArrayList;

public class SniperRifle {

	private ArrayList<BulletType> bulletType;
	
//	ArrayList<BulletType> bulletType2 = new ArrayList<>();
	
	public void setBulletType(ArrayList<BulletType> bulletType) {
		this.bulletType = bulletType;
	}
	
	public ArrayList<BulletType> getBulletTpye() {
		return bulletType; 
	}
	
	public void shoot() {
		System.out.println("탕!");
	}
}
