package characters;

public class CatPlanet {

	public static void main(String[] args) {
		
		// 강아지들 인스터화
				Bbuggu bbuggu = new Bbuggu();
				Duchi duchi = new Duchi();
				
				// 고양이들 인스턴스화
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
				
				smartCat.powerConcentrate();
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
