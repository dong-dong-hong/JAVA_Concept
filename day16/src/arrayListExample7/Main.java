package arrayListExample7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 리스트 중복 요소'만' 조회하기
		
		ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		
		ArrayList<Integer> integerArrayList2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		integerArrayList2.retainAll(integerArrayList);
		
		System.out.println("integerArrayList2 중복 요소 조회 -> " + integerArrayList2);
		
		ArrayList<Integer> integerArrayList3 = new ArrayList<> (Arrays.asList(1,2,3,4,5,6,7,44,222,1233,44555));
		
		ArrayList<Integer> integerArrayList4 = new ArrayList<> (Arrays.asList(5,6,7,44));
		
		integerArrayList3.retainAll(integerArrayList4);
		
		System.out.println("integerArrayList3 중복 요소 조회 -> " + integerArrayList3);
	}

}
