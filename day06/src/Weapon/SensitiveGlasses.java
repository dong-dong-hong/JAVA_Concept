package Weapon;

public class SensitiveGlasses {

	public String color;
	public String glassType; // CIRCLE , TRIANGLE, SQUARE
	
	SensitiveGlasses() {
		
	}
	SensitiveGlasses(String color) {
		this.color = color;
		this.glassType = "CIRCLE";
	}
	
	SensitiveGlasses(String color, String glassType) {
		this.color = color;
		this.glassType = glassType;
	}
	
	
}
