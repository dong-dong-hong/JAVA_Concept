package methodExample;

public class MethodExample3 {
	
	static Integer testIntegerValue; // '클래스 변수'라고 한ㄴ다 . static을 빼면 '인스턴스 변수'라고 한다.
	static String testStringValue;
	
	public static Integer getInteger() {
		return testIntegerValue;
	}
	
	public static void setInteger(Integer value) {
		testIntegerValue = value;
	}
	
	public static String getString() {
		return testStringValue;
	}
	
	public static void setString(String value) {
		testStringValue = value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// 1. Integer get, set
		setInteger(3);
		System.out.println("결과 -> : " + getInteger()); // get으로 불러와준다.
		
		// 2. String get, set
		setString("안녕하세요");
		System.out.println("결과 -> : " + getString()); // get으로 불러와준다.
		
	}

}
