package day03;

public class Main {
	
	public static void pleaseCallMe(Integer testNumber) {
		if(testNumber == 0) {
			System.out.println("testNumber 이젠 그만 호출할게요");
		}else {
			System.out.println("testNumber 호출했어요 -> " + testNumber);
			testNumber -= 1;
			pleaseCallMe(testNumber);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pleaseCallMe(10);
		
	}

}
