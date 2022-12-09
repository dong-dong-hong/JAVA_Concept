package weapons;

public class MagicFoundation extends Weapon {

	private String color;
	private String foundationType; // DARK, LIGHT

	private final String OWNER_NAME = "소미";
	
	private final String SKILL_NAME = "삐리카 삐리랄라 메이크업 공격~!";
	
	public MagicFoundation() {
		this("PINK", "DARK");
	}
	
	public MagicFoundation(String color) {
		this.color = color;
		this.foundationType = "DARK";
	}
	
	public MagicFoundation(String color, String foundationType) {
		this.color = color;
		this.foundationType = foundationType;
	}

	@Override
	public String getSkillName() {
		// TODO Auto-generated method stub
		return OWNER_NAME + " : " + SKILL_NAME;
	}
}
