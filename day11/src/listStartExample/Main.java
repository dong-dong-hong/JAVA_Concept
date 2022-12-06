package listStartExample;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> testArray = new ArrayList();
		
		testArray.add(808);
		testArray.add(888);
		testArray.add(880);
		
		System.out.println(testArray);
		System.out.println("");
		
		// 0번째 인덱스에 접근하는 것이 전혀 위화감이 없죠
		System.out.println(testArray.get(0));
		System.out.println(testArray.get(1));
		System.out.println(testArray.get(2));
	}

}
