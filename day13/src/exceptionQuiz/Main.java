package exceptionQuiz;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> dogsNameList = new ArrayList();
		dogsNameList.add("두치");
		dogsNameList.add("흰둥이");
		dogsNameList.add("땡칠이");
		dogsNameList.add("땡구");

		try {
			System.out.println("뿌꾸: 강아지들 열 맞추어");
			for (int i = 0; i < dogsNameList.size(); i++) {
				
				if(i == 1) {
					throw new Exception();
				}
				
				System.out.println(dogsNameList.get(0) + " : 하나!");
				System.out.println(dogsNameList.get(1) + " : 둘!");
				System.out.println(dogsNameList.get(2) + " : 셋!");
			}
		} catch (Exception e) {
			System.out.println("뿌꾸: 누구야 너 임마!");
		} 
	}
}
