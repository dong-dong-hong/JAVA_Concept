package methodExample;

public class MethodExample2 {
	
	public static void calculateValue(Integer sumValue, Integer multiplyValue) {
		System.out.println("계산 결과 -> " + (sumValue * multiplyValue));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer x = 4;
		Integer y = 3;
		Integer z = x + y;
		
		calculateValue(z , 14);
		calculateValue(z, 15);
		calculateValue(z, 16);
		calculateValue(z, 17);
		calculateValue(z, 18);
	}

}
