package weapons;

public class CasinoChips extends Weapon {

	private String color;
	private String chipType; // BRONZE, SILVER, GOLD
	
	private final String OWNER_NAME = "냥쓸이";
	
	private final String SKILL_NAME = "게임 초기화!";
	
	public CasinoChips() {
		this("RED", "BRONZE");
	}
	
	public CasinoChips(String color) {
		this.color = color;
		this.chipType = "BRONZE";
	}
	
	public CasinoChips(String color, String chipType) {
		this.color = color;
		this.chipType = chipType;
	}

	@Override
	public String getSkillName() {
		// TODO Auto-generated method stub
		return OWNER_NAME + " : " + SKILL_NAME;
	}
}
