package genericsExample4;

public class Cat {

	private Object someInfo;
	
	Cat(Object someInfo) {
		this.someInfo = someInfo;
	}
	
	public Object getSomeInfo() {
		return someInfo;
	}
}
