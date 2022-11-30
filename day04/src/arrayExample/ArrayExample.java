package arrayExample;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		String catName = "소미";
//		System.out.println("고양이 이름: " + catName);
//		
//		catName = "수미";
//		System.out.println("고양이 이름: " + catName);
//		
//		catName = "세미";
//		System.out.println("고양이 이름: " + catName);
		
//		Integer [] Cats = new Integer[5];
//		System.out.println("출력해볼까요...? -> " + Cats);
//		
		// -> [] [] [] []
		
		// -> 0 1 2 3 4
		
		// Cats[0] , Cats[1], Cat[2] , Cat[3] , Cat[4]
		
		
		// -> [] [] [] []
		// -> 하나하나의 저장공간을 배열의 요소라고 합니다.
		
		// -> 0 1 2 3 4
		// -> 이 아이들은 index라고 합니다, 이 애들은 배열의 요소마다 부여된 애들입니다.
		// -> '색인' , '일련번호'라고 보시면 됩니다.
		// -> 이 아이들은 0부터 시작입니다.
		// -> 컴퓨터가 연산하거나 계산하는건 왠만하면 0부터 시작합니다.
		
		
		int [] cats = new int[5];
		
		// [] + 0 -> [0] -> cats
		cats[0] = 1;
		
		cats[1] = 33;
		
		cats[2] = 6;
		
		cats[3] = 7;
		
		cats[4] = 5;
		
		for(int i=0; i<=cats.length - 1; i++) {
			System.out.println(i + "번째는 ..." + cats[i] + "입니다.");
		}
		
	
	}

}
