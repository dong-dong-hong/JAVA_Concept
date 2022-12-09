package listQuiz;

import java.util.ArrayList;

public class AnimalProtectionCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList firstBagList = new ArrayList();
		
		firstBagList.add(1);
		firstBagList.add(2);
		firstBagList.add(3);
		
		ArrayList secondBagList = new ArrayList();
		
		secondBagList.add(1);
		secondBagList.add(2);
		secondBagList.add(3);
		secondBagList.add(4);
		secondBagList.add(5);
		
		
		
		System.out.println("================");
		System.out.println("-유기묘 보호소-");
		System.out.println("");
		
		for(int i =0; i <firstBagList.size(); i++) {
			System.out.println("첫 번째 봉투: " + "BIG/DRY 사료가 " + firstBagList.get(i) + "알째 담겼습니다." );
		}

		System.out.println("");
		System.out.println("================");
		
		for(int i =0 ; i <secondBagList.size(); i++) {
			System.out.println("첫 번째 봉투: " + "SMALL/WET 사료가 " + secondBagList.get(i) + "알째 담겼습니다." );
		}		

		System.out.println("");
		System.out.println("켓초딩: 좋아, 드디어 동료에게 돌아갈 수 있게 되었다냥~");
		System.out.println("");
		
		System.out.println("=================");
	}

}
