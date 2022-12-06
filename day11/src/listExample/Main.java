package listExample;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 데이터 추가
		ArrayList testList = new ArrayList();
		
		testList.add(11);
		testList.add(22);
		testList.add(33);
		testList.add(44);
		testList.add(55);
		
		System.out.println("데이터 조회");
		
		// 데이터 조회
		for(int i = 0 ; i < testList.size(); i++) {
			System.out.println("데이터 최초 조회 testList는? -> " + testList.get(i));
		}
		
		System.out.println("===========");
		System.out.println("");
		
		// 2. 중간에 데이터 추가
		
		System.out.println("데이터 추가");
		
		testList.add(2,808); // 두번째 자리에 , 808 추가
		
		// 데이터 조회
		for(int i =0 ; i < testList.size(); i++) {
			System.out.println("중간에 데이터를 추가한 testList는? -> " + testList.get(i));
		}
		
		System.out.println("==============");
		System.out.println("");
		
		// 3. 중간에 중복된 데이터 추가
		
		System.out.println("중복된 데이터 추가");
		
		testList.add(3,808);
		
		// 데이터 조회
		for(int i= 0 ; i < testList.size(); i++) {
			System.out.println("중간에 중복된 데이터를 추가한 testList는? -> " + testList.get(i));
		}
		
		System.out.println("===========");
		System.out.println("");
		
		// 4. 리스트의 전체 길이
		System.out.println("데이터의 전체 길이");

		System.out.println("testList의 전체 길이는? -> " + testList.size());

		System.out.println("============");
		System.out.println("");

		// 5. 데이터 삭제 방식
		System.out.println("데이터 삭제");
		testList.remove(2);
		testList.remove(2); // 한번 더 삭제

		// 0 1 2 3 이니까 4번째겠죠?
		System.out.println("testList의 전체 길이는 변했을까요? -> " + testList.size());

		System.out.println("============");
		System.out.println("");

		for(Integer i = 0; i < testList.size(); i++) {
			System.out.println("값을 삭제한 후에 testList은 -> " + testList.get(i));
		}

		System.out.println("============");
		System.out.println("");

		// 6. 특정값이 포함되어 있는지 아닌지 판단
		System.out.println("");
		System.out.println("808이라는 값이 리스트에 포함되어 들어있을까요? -> " + testList.contains(808));

		System.out.println("============");
		System.out.println("");
	}

}
