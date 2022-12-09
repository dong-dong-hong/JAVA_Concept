package arrayListExample6;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> testIntegerList = new ArrayList<>();
		
		testIntegerList.add(1);
		testIntegerList.add(21);
		testIntegerList.add(41);
		testIntegerList.add(111);
		testIntegerList.add(13);
		testIntegerList.add(155);
		
		System.out.println("testIntegerList -> " + testIntegerList);
		
		System.out.println("testIntegerList after submit -> " + testIntegerList.subList(1, 4));
	}

}
