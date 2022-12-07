package weapons;

public class SensitiveGlasses extends Weapon {

	private String color;
	private String glassesType; // CIRCLE, TRIANGLE, SQUARE
	
	private final String OWNER_NAME = "똑냥이";
	
	private final String SKILL_NAME = "꿰뚫어 보기";
	
	public SensitiveGlasses() {
		this("BLACK", "CIRCLE");
	}
	
	public SensitiveGlasses(String color) {
		this.color = color;
		this.glassesType = "CIRCLE";
	}
	
	public SensitiveGlasses(String color, String glassesType) {
		this.color = color;
		this.glassesType = glassesType;
	}

	@Override
	public String getSkillName() {
		// TODO Auto-generated method stub
		return OWNER_NAME + " : " + SKILL_NAME;
	}
}
