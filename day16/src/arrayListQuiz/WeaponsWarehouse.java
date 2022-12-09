package arrayListQuiz;

import java.util.ArrayList;

public class WeaponsWarehouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BulletType bulletType2 = BulletType.SILVER;

		ArrayList<BulletType> bulletType = new ArrayList<>();
		
		bulletType.add(bulletType2);
		bulletType.add(bulletType2);
		bulletType.add(bulletType2);
		bulletType.add(bulletType2);
		bulletType.add(bulletType2);
		
		KnifeType knifeType = KnifeType.LONG_SWORD;
		
		GunType gunType = GunType.SNIPER_RIFLE;
		
		
		System.out.println("=====================");
		
		System.out.print("총의 종류 : ");
		for(int i=0; i < gunType.values().length; i++) {
			
			System.out.print(gunType.values()[i] + " / " );
		}
		System.out.println();
		System.out.print("칼의 종류 : ");
		for(int i=0; i < knifeType.values().length; i++) {
			System.out.print(knifeType.values()[i] + " / ");
		}
		System.out.println();
		System.out.print("장전시킬 총알의 종류 : ");
		for(int i=0; i < bulletType.size(); i++) {
			System.out.print(bulletType.get(i) + " / ");
		}
		System.out.println();
		System.out.println("======================");
		
		System.out.println();
		System.out.println("냥아치 : 나는 " + gunType + " 그리고 " + knifeType + "를 고르겠어" );
	}

}
