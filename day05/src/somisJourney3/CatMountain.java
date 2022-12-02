package somisJourney3;

public class CatMountain {
	
	public static void attackCatMountain(BigPowerRock bigPowerRock) {
		bigPowerRock.attacked();
		bigPowerRock.printRocHp(bigPowerRock.getRockHp());
	}
	
	public static void main(String args[]) {
		BigPowerRock bigPowerRock = new BigPowerRock();
		
		// 강아지 친구들 인스터화
		Bbuggu bbuggu = new Bbuggu();
		Duchi duchi = new Duchi();
		
		// 고양이 친구들 인스터화
		Somi somi = new Somi();
		SmartCat smartCat = new SmartCat();
		WildCat wildCat = new WildCat();
		GamblingCat gamblingCat = new GamblingCat();
		YoungCat youngCat = new YoungCat();
		HealingCat healingCat = new HealingCat();
		
		// 공격시작
		bbuggu.bodyShot();
		attackCatMountain(bigPowerRock);
		
		bbuggu.bornAttack();
		attackCatMountain(bigPowerRock);
		
		bbuggu.dogSideKick();
		attackCatMountain(bigPowerRock);
		
		bbuggu.dogUpperCut();
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		
		duchi.bodyShot();
		attackCatMountain(bigPowerRock);
		
		duchi.bornAttack();
		attackCatMountain(bigPowerRock);
		
		duchi.dogBackKick();
		attackCatMountain(bigPowerRock);
		
		duchi.dogPunch();
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		
		// 바위의 상태를 한번 체크합니다
		bigPowerRock.printRockState();
		
		somi.punch();
		somi.wrapTail();
		somi.punch();
		somi.wrapTail();
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		
		smartCat.powerConcentrate();
		smartCat.seeDeeply();
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		
		wildCat.powerFingerNail();
		wildCat.powerFootNail();
		wildCat.powerFingerNail();
		wildCat.powerFootNail();
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		
		// 바위의 상태를 한번 더 체크합니다.
		bigPowerRock.printRockState();
		
		for(Integer i = 0; i < 29; i++) {
			attackCatMountain(bigPowerRock);
		}
			
		bigPowerRock.printRockState();
	}
}
