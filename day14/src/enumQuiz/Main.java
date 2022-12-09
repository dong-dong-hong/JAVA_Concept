package enumQuiz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CandyType validateCandyType = CandyType.HONEY;
		
		if(validateCandyType == CandyType.GINGER) {
			System.out.println("진저맛 사탕");
		}else if(validateCandyType == CandyType.FRUITY) {
			System.out.println("과일맛 사탕");
		}else if(validateCandyType == CandyType.HONEY) {
			System.out.println("꿀맛 사탕");
		}else if(validateCandyType == CandyType.BUTTER) {
			System.out.println("버터맛 사탕");
		}
	}

}
