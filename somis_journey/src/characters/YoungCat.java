package characters;

import config.AttackBehavior;
import config.WeaponBehavior;
import weapons.LightSchoolBag;

public class YoungCat extends KoreanShort implements WeaponBehavior, AttackBehavior {

	private final String name = "켓초딩";
	
	LightSchoolBag lightSchoolBag;
	
	// 켓초딩 고유의 스킬들
	public void cry() {
		System.out.println(name + " : "+"으아아아앙~");
	}

	@Override
	public void invokeMainSkill() {
		// TODO Auto-generated method stub
		this.cry();
	}

	@Override
	public void invokePartSkill() {
		// TODO Auto-generated method stub
		System.out.println("보조 스킬이 없습니다.");
	}

	@Override
	public <T> void setWeapon(T weapon) {
		// TODO Auto-generated method stub
		lightSchoolBag = (LightSchoolBag) weapon;
	}

	@Override
	public void invokeWeaponSKill() {
		// TODO Auto-generated method stub
		if(lightSchoolBag == null) {
			System.out.println("무기 장착 없이 무기를 사용할 수 없습니다.");
		}else {
			System.out.println(lightSchoolBag.getSkillName());
		}
	}
}
