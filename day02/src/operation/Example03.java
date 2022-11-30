package operation;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 3;
		int y = 4;
		int result = x + y * 3;
		System.out.println(result);
		
		// 대입연산자는 연산자 중에서도 순위가 가장 낮아서
		// x + y * 3이 전부 계산된 후에 result에 값이 대입이 된다.
	}

}
