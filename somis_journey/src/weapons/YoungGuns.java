package weapons;

public class YoungGuns extends Weapon {

	private String color;
	private String bulletType; // GOLD, SILVER , BRONZE
	
	private final String OWNER_NAME = "두치";
	
	private final String SKILL_NAME = "탕탕탕!";
	
	public YoungGuns() {
		this("BLACK" , "BRONZE");
	}
	
	public YoungGuns(String color) {
		this.color = color;
		this.bulletType = "BRONZE";
	}
	
	public YoungGuns(String color, String bulletType) {
		this.color = color;
		this.bulletType = bulletType;
	}

	@Override
	public String getSkillName() {
		// TODO Auto-generated method stub
		return OWNER_NAME + " : " + SKILL_NAME;
	}
}
