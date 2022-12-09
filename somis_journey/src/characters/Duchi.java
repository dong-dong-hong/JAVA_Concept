package characters;

import config.AttackBehavior;
import config.WeaponBehavior;
import weapons.YoungGuns;

public class Duchi extends Sigorjabjong implements WeaponBehavior, AttackBehavior {
	
	private final String name = "두치";
	
	YoungGuns youngGuns;

	// 두치 고유의 스킬들
	public void bornAttack() {
		System.out.println(name + " : " +"뼈다귀 공격!");
	}

	public void bodyShot() {
		System.out.println(name + " : " +"몸통 박치기!");
	}

	public void dogPunch() {
		System.out.println(name + " : " +"멍멍펀치!");
	}

	public void dogBackKick() {
		System.out.println(name + " : " + " 멍멍 뒤돌려차기!");
	}

	@Override
	public void invokeMainSkill() {
		// TODO Auto-generated method stub
		this.bornAttack();
	}

	@Override
	public void invokePartSkill() {
		// TODO Auto-generated method stub
		this.bodyShot();
	}

	@Override
	public <T> void setWeapon(T weapon) {
		// TODO Auto-generated method stub
		youngGuns = (YoungGuns) weapon;
	}

	@Override
	public void invokeWeaponSKill() {
		// TODO Auto-generated method stub
		if(youngGuns == null) {
			System.out.println("무기 장착 없이 무기를 사용할 수 없습니다.");
		}else {
			System.out.println(youngGuns.getSkillName());
		}
	}
}
