package listStartExample2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> testArray = new ArrayList();
		
		testArray.add("1호");
		testArray.add("2호");
		testArray.add("3호");
		
		System.out.println(testArray);
		System.out.println();
		System.out.println(testArray.get(0));
		System.out.println(testArray.get(1));
		System.out.println(testArray.get(2));
	}

}
