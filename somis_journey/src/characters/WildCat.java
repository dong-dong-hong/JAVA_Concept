package characters;

import config.AttackBehavior;
import config.WeaponBehavior;
import weapons.PowerGlove;

public class WildCat extends KoreanShort implements WeaponBehavior, AttackBehavior {

	private final String name = "냥아치";
	
	PowerGlove powerGlove;
	
	// 냥아치 고유의 스킬들
	public void powerFingerNail() {
		System.out.println(name + " : "+"초강력 손톱!");
	}

	public void powerFootNail() {
		System.out.println(name + " : " +"초강력 발톱!");
	}

	public void yarn() {
		System.out.println(name + " : " +"하악~!");
	}

	@Override
	public void invokeMainSkill() {
		// TODO Auto-generated method stub
		this.powerFingerNail();
	}

	@Override
	public void invokePartSkill() {
		// TODO Auto-generated method stub
		this.yarn();
	}

	@Override
	public <T> void setWeapon(T weapon) {
		// TODO Auto-generated method stub
		powerGlove = (PowerGlove) weapon;
	}

	@Override
	public void invokeWeaponSKill() {
		// TODO Auto-generated method stub
		if(powerGlove == null) {
			System.out.println("무기 장착 없이 무기를 사용할 수 없습니다.");
		}else {
			System.out.println(powerGlove.getSkillName());
		}
	}
}
