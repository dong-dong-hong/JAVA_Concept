package arrayExample;

public class ArrayExample3 {

	// 총합구하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int [] score = {100, 90,99,80,88};
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		System.out.println("총점은" + sum + " 점 입니다.");
	}

}
