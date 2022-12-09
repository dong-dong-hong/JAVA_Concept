package genericsExample5;

public class Cat<T> {

	private T someInfo;
	
	Cat(T someInfo) {
		this.someInfo = someInfo;
	}
	
	public T getSomeInfo() {
		return someInfo;
	}
}
