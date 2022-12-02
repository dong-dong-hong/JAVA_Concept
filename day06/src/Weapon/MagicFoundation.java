package Weapon;

public class MagicFoundation {

	public String color;
	public String foundationType; // DARK, LIGHT
	
	MagicFoundation() {
		
	}
	MagicFoundation(String color) {
		this.color = color;
		this.foundationType = "DARK";
	}
	
	MagicFoundation(String color, String foundationType) {
		this.color = color;
		this.foundationType = foundationType;
	}
}
