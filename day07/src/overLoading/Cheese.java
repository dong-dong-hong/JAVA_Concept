package overLoading;

public class Cheese {

	public String type = "MOZARELLA"; // MOZARELLA , PARMESAN, CHEDDAR
	
	public void setcheeseType(String type) {
		this.type = type;
	}
	
	public String getCheeseType() {
		return type;
	}
}
