package characters;

import config.AttackBehavior;
import config.WeaponBehavior;
import weapons.PowerBazuka;

public class Bbuggu extends Jindo implements WeaponBehavior, AttackBehavior{

	private final String name = "뿌꾸";
	
	PowerBazuka powerBazuka;
	
	// 뿌꾸 고유의 스킬들
		public void bornAttack() {
			System.out.println(name + " : " + "뼈다귀 공격!");
		}

		public void bodyShot() {
			System.out.println(name + " : " +"몸통 박치기!");
		}

		public void dogUpperCut() {
			System.out.println(name + " : " +"멍멍 어퍼컷!");
		}

		public void dogSideKick() {
			System.out.println(name + " : " + "멍멍 옆차기!");
		}

		@Override
		public void invokeMainSkill() {
			// TODO Auto-generated method stub
			this.dogUpperCut();
		}

		@Override
		public void invokePartSkill() {
			// TODO Auto-generated method stub
			this.dogSideKick();
		}

		@Override
		public <T> void setWeapon(T weapon) {
			// TODO Auto-generated method stub
			powerBazuka = (PowerBazuka) weapon;
		}

		@Override
		public void invokeWeaponSKill() {
			// TODO Auto-generated method stub
			if(powerBazuka == null) {
				System.out.println("무기 장착 없이 무기를 사용할 수 없습니다.");
			}else {
				System.out.println(powerBazuka.getSkillName());
			}
		}
}
