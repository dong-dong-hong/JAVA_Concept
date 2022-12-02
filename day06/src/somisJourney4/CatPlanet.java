package somisJourney4;

public class CatPlanet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 강아지들 인스터화
		Bbuggu bbuggu = new Bbuggu();
		Duchi duchi = new Duchi();
		
		// 고양이들 인스터화
		Somi somi = new Somi();
		SmartCat smartCat = new SmartCat();
		WildCat wildCat = new WildCat();
		GamblingCat gamblingCat = new GamblingCat();
		YoungCat youngCat = new YoungCat();
		HealingCat healingCat = new HealingCat();
		
		// 강아지들 스킬
		bbuggu.bodyShot();
		bbuggu.bornAttack();
		bbuggu.dogSideKick();
		bbuggu.dogUpperCut();
		
		duchi.bodyShot();
		duchi.bornAttack();
		duchi.dogBackKick();
		duchi.dogPunch();
		
		// 고양이들 스킬
		somi.punch();
		somi.wrapTail();
		
		smartCat.powerConcentrace();
		smartCat.seeDeeply();
		
		wildCat.powerFingerNail();
		wildCat.powerFootNail();
		
		gamblingCat.fakeHand();
		gamblingCat.allIn();
		
		youngCat.cry();
		
		healingCat.heal();
		healingCat.healAllPartner();
	}

}
