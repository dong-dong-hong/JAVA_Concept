package weapons;

public class PowerBazuka extends Weapon {

	private String color;
	private String bombType; // GOLD, SILVER, BRONZE
	
	private final String OWNER_NAME = "뿌꾸";
	
	private final String SKILL_NAME = "펑펑펑!";
	
	public PowerBazuka() {
		this("BLACK" , "BRONZE");
	}
	
	public PowerBazuka(String color) {
		this.color = color;
		this.bombType = "BRONZE";
	}
	
	public PowerBazuka(String color, String bombType) {
		this.color = color;
		this.bombType = bombType;
	}

	
	@Override
	public String getSkillName() {
		// TODO Auto-generated method stub
		return OWNER_NAME + " : " + SKILL_NAME;
	}

	
}
