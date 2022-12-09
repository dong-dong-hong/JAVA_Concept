package genericsExample6;

public class PaperBox<T extends Cat> {

	T info;
	
	public void setPaperCnt(T info) {
		this.info = info;
	}
	
	public T getPaperBox() {
		return info;
	}
}
