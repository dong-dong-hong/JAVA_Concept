package Weapon;

public class PowerGlove {

	
	public String color;
	public String gloveType; // NONE, FIRE, WATER
	
	PowerGlove() {
		
	}
	
	PowerGlove(String color) {
		this.color = color;
		this.gloveType = "NONE";
	}
	
	PowerGlove(String color, String gloveType) {
		this.color = color;
		this.gloveType = gloveType;
	}
	
}
