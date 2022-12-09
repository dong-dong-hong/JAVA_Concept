package listQuiz;

public class Feed {

	public String type; //DRY, WET
	public String size; // BIG, MEDIUM, SMALL
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	
}
