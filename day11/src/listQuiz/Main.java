package listQuiz;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList catList = new ArrayList();
		
		catList.add("소미");
		catList.add(" 세미");
		catList.add(" 수미");
		catList.add(" 똑냥이");
		catList.add(" 두치");
		catList.add(" 냥아치");
		catList.add(" 켓초딩");
		
		System.out.println("사진사 : 사진촬영 전 한줄로 서주세요.");
		System.out.println("");
		
		for(int i = 0; i <catList.size(); i++) {
			System.out.print(catList.get(i));
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("찰칵! 찰칵!");
		System.out.println("");
		System.out.println("사진사: 강아지이신 분은 빠져주세요...!");
		System.out.println("");
		
		catList.remove(4);
		
		for(int i = 0; i < catList.size(); i++) {
			System.out.print(catList.get(i));
		}
		System.out.println("");
		System.out.println("");
		System.out.println("찰칵! 찰칵!");
		System.out.println("");
		System.out.println("사진사: 같은 가족이신 분들끼리 서주세요!");
		System.out.println("");
		
		catList.remove(3);
		catList.remove(3);
		catList.remove(3);
		
		for(int i=0; i< catList.size(); i++) {
			System.out.print(catList.get(i));
		}
		System.out.println("");
		System.out.println("");
		System.out.println("찰칵! 찰칵!");
		System.out.println("");
		System.out.println("사진사: 수고하셨습니다~!");
	}

}
