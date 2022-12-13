package genericsLimitExample;

public class PaperBox<T> {

	private T[] list;
	
	public void setList(T[]list) {
		this.list = list;
	}
	
	public T[] getList() {
		return list;
	}
	
//	public void caculateList() {
//		list = new T[];
//	}
	
//	빨간줄 나온다 -> new 키워드를 사용하려면 클래스 및 객체를 구체화해야 되는데 제네릭 클래스 안에서는 그러지 못하므로 에러가 나는것이다.
}
