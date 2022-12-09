package genericsExample;

public class Cat<T> {

	private T someInfo;
	
	public T getSomeInfo() {
		return someInfo;
	}
	
	public void setSomeInfo(T someInfo) {
		this.someInfo = someInfo;
	}
}
