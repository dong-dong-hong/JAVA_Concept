package day04;

public class Main {
	
	public static Integer calculateFactorial(Integer factorialValue) {
		if(factorialValue == 1) {
			return factorialValue; // 1일때 반환
		}else {
			return factorialValue * calculateFactorial(factorialValue - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10의 펙토리얼은? -> " + calculateFactorial(10));
	}

}
