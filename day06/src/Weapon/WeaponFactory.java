package Weapon;

public class WeaponFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 소미 전용 무기
		MagicFoundation magicFoundation = new MagicFoundation("WHITE");
		System.out.println("magicFoundaion 색상 : " +  magicFoundation.color);
		
		// 똑냥이 전용 무기
		SensitiveGlasses sensiveGlasses = new SensitiveGlasses("BLACK");
		System.out.println("sensitiveGlasses 색상: " + sensiveGlasses.color);
		
		// 냥아치 전용 무기
		PowerGlove powerGlove = new PowerGlove("BLUE");
		System.out.println("PowerGlove 색상: " + powerGlove.color);
		
		// 냥쓸이 전용 무기
		CasinoChips casinoChips = new CasinoChips();
		System.out.println("casinochips 색상: " + casinoChips.color);
		
		//켓초딩 전용 무기
		LightSchoolBag lightSchoolBag = new LightSchoolBag("YELLOW");
		System.out.println("lightSchoolBag 색상: " + lightSchoolBag.color);
	}

}
