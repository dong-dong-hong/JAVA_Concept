package arrayExample;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//방법 1
		
//		int [] cats = new int[5];
//		
//		cats[0] = 5;
//		cats[1] = 6;
//		cats[2] = 7;
//		cats[3] = 8;
//		cats[4] = 9;
//		
//		for(int i=0; i<=cats.length-1; i++) {
//			System.out.println(cats[i]);
//		}
		
		// 방법 2
//		
//		int [] cats = new int[] {5,6,7,8,9};
//		
//		for(int i=0;i<=cats.length-1; i++) {
//			System.out.println(cats[i]);
//		}
		
		// 방법 3
		int [] cats = {5,6,7,8,9};
		
		for(int i=0; i<=cats.length-1; i++) {
			System.out.println(cats[i]);
		}
	}
}
