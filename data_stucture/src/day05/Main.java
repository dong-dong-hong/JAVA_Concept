package day05;

public class Main {
	
	public static Integer calculateFibonacci(Integer fibonacciCnt) {
		if(fibonacciCnt <= 1) {
			return 1;
		}else {
			return calculateFibonacci(fibonacciCnt - 2) + calculateFibonacci(fibonacciCnt - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("파보나치수열 알고리즘을 10번 적용한 갓은 어떻게 될까? -> " + calculateFibonacci(10)  );
	}

}
