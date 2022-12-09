package genericsExample6;

public class Cat<T> {

	private T someInfo;
	
	public void setSomeInfo(T someInfo) {
		this.someInfo = someInfo;
	}
	
	public T getSomeInfo() {
		return someInfo;
	}
}
