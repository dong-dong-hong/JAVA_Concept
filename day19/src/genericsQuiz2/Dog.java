package genericsQuiz2;

public class Dog<T> {

	T someInfo;
	
	public void setSomeInfo(T someInfo) {
		this.someInfo = someInfo;
	}
	
	public T getSomeInfo() {
		return someInfo;
	}
}
