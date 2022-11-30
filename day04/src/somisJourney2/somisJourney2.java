package somisJourney2;

public class somisJourney2 {
	
	public static void invokeSkill(String catName, String skillName) {
		System.out.println(catName + " : " + skillName);
	}

	public static void main(String[] args) {
		String catName = "소미";
		String catMajorSkillName = "냥냥펀치";
		String CatAdditionalSkillName = "꼬리감기";
		
		Integer dogGroupCnt;
		
		String middleDogBossName = "두치";
		String middleDogBossMajorSkill = "몸통박치기";
		
		String lastDogBossName = "뿌꾸";
		String lastDogBossMajorSkill = "몸통박치기";
		
		System.out.println("");
		System.out.println(lastDogBossName + " : " + "너 아직도 여기에 있구나... 아직, 정신을 못차렸구만.. 이제는 내가 상대해주지");
		System.out.println("");
		
		System.out.println(lastDogBossName + " : " + lastDogBossMajorSkill);
		
		System.out.println("");
		System.out.println(catName + " : " + "훗.. 겨우 이정도냐?" );
		System.out.println("");
		
		for(Integer i = 0; i <= 15; i++) {
			invokeSkill(catName, catMajorSkillName);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println(lastDogBossName + "가 쓰러졌습니다");
	}
}
