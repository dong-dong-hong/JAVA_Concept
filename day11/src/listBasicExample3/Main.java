package listBasicExample3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat streetCat = new Cat();
		streetCat.setType("RED");
		Cat streetCat2 = new Cat();
		streetCat2.setType("YELLOW");
		Cat streetCat3 = new Cat();
		streetCat3.setType("BLUE");
		
		ArrayList<Cat> catList = new ArrayList();
		catList.add(streetCat);
		catList.add(streetCat2);
		catList.add(streetCat3);
		
		System.out.println("");
		System.out.println(catList);
		System.out.println("");
		
		for(int i = 0; i <catList.size(); i++) {
			System.out.println(catList.get(i));
		}
		
		System.out.println("");
		System.out.println("=========");
		System.out.println("");
		
		for(int i = 0; i <catList.size(); i++) {
			System.out.println(catList.get(i).getType());
		}
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		catList.remove(0); // 빨간색 고양이를 리스트상에서 지워봅니다.
		
		System.out.println(catList);
		System.out.println("");
		
		System.out.println("");
		System.out.println("========");
		System.out.println("");
		
		for(int i = 0; i < catList.size(); i++) {
			System.out.println(catList.get(i).getType());
		}
	}

}
