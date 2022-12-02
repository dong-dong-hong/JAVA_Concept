package Weapon;

public class LightSchoolBag {

	public String color;
	public String bagType; // NONE_MAKER , MAKER
	
	LightSchoolBag(){
		
	}
	
	LightSchoolBag(String color) {
		this.color  = color;
		this.bagType = "NONE_MAKER";
	}
	
	LightSchoolBag(String color, String bagType) {
		this.color = color;
		this.bagType = bagType;
	}
}
