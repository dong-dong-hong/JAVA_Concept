package objectExample4;

public class Methodparameter {

	// 함수 옆에 선언하는 변수가 '매개변수' 혹은 '파라미터' 입니다.
	public static void hiThere(String name) {
		System.out.println(name + "입니다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 호출 시 넘기는 값을 '인자'라고 합니다.
		hiThere("소미");
	}

}
