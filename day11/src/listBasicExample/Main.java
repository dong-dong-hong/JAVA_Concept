package listBasicExample;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList catNameList = new ArrayList();
//		ArrayList<String> catNameList = new ArrayList();
		
		ArrayList catNameList = new ArrayList();
		catNameList.add("소미");
		catNameList.add("세미");
		catNameList.add("수미");
		
		System.out.println(catNameList);
		System.out.println("");
		
		for(int i = 0; i < catNameList.size(); i++) {
			System.out.println(catNameList.get(i));
		}
		System.out.println("");
		System.out.println("========");
		System.out.println("");
		
		ArrayList<String> dogNameList = new ArrayList();
		dogNameList.add("두치");
		dogNameList.add("뿌꾸");
		dogNameList.add("땡구");
		dogNameList.add("흰둥이");
		
		System.out.println(dogNameList);
		System.out.println("");
		
		for(int i=0; i < dogNameList.size(); i++) {
			System.out.println(dogNameList.get(i));
		}
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		dogNameList.remove(1); //뿌꾸
		
		System.out.println(dogNameList);
		System.out.println("");
		
		for(int i=0; i < dogNameList.size(); i++) {
			System.out.println(dogNameList.get(i));
		}
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
	}

}
