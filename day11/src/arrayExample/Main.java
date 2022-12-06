package arrayExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 배열 값을 할당하는 법
		
		// 1-1. 공간만 할당하는 경우
		Integer [] testArray = new Integer[5];
		
		for(int i = 0; i < testArray.length; i++) {
			System.out.println("testArray의 안에는? -> " + testArray[i]);
		}
		
		System.out.println("==========");
		
		// 1-2. 공간 +값까지 같이 할당하는 경우(초기화)
		Integer [] testArray2 = new Integer[] {1,2,3,4,5};
		
		for(int j=0; j < testArray2.length; j++) {
			System.out.println("testArray2의 안에는? -> " + testArray2[j]);
		}
		
		System.out.println("============");
	}

}
