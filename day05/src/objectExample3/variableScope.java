package objectExample3;

public class variableScope {
	
	//클래스 영역 시작
	public Integer hiThere; // tag1
	public static Integer hiThere2; // tag2

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 메소드 영역 시작
		Integer hiThere = 0; // Tag3
		// 메소드 영역 끝
	}
	// 클래스 영역 끝
}
