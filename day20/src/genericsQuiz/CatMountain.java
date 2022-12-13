package genericsQuiz;

public class CatMountain {
	
	private final static String CAT_NAME = "고양이";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fire fire = new Fire();
		fire.setExplain("활활활 타오르는 불주먹");
		
		MagicGloves<Fire> fireGlove = new MagicGloves();
		fireGlove.setAttribute(fire);
		fireGlove.invokeSkill(CAT_NAME, fireGlove.getAttribute().getExplain());
		
		System.out.println(CAT_NAME + " : 다른 글러브도 사용해볼까");
		System.out.println();
		
		Water water = new Water();
		water.setExplain("흐르는 물주먹");
		
		MagicGloves<Water> waterGlove = new MagicGloves<>();
		waterGlove.setAttribute(water);
		waterGlove.invokeSkill(CAT_NAME, waterGlove.getAttribute().getExplain());
		
		System.out.println(CAT_NAME + " : 다른 글러브도 사용해볼까");
		System.out.println();
		
		Grass grass = new Grass();
		grass.setExplain("풀의 속성! 풀주먹");
		
		MagicGloves<Grass> grassGlove = new MagicGloves<>();
		grassGlove.setAttribute(grass);
		grassGlove.invokeSkill(CAT_NAME, grassGlove.getAttribute().getExplain());
		
		System.out.println();
		System.out.println(CAT_NAME + " : 나에게는 불주먹 스킬이 가장 잘 맞는군");
		
		
	}

}
