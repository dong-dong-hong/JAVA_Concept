package genericsQuiz;

public class PresentBox<T> {

	public T presentBoxType;
	
	public void setPresentBoxType(T presentBoxType) {
		this.presentBoxType = presentBoxType;
	}
	
	public T getPresentBoxType() {
		return presentBoxType;
	}
}
