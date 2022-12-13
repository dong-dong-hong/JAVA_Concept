package genericsQuiz2;

public class Dog<T> {
	private T someInfo;
	
	private String name;
	
	public void setSomeInfo(T someInfo) {
		this.someInfo = someInfo;
	}
	
	public T getSomeInfo() {
		return someInfo;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
