package operation;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int x = 4;
		int y = x * 4 + 3; // 곳넴과 나눗셈이 덧셈과 빨셈보다 우선순위가 높디
		
		System.out.println(x);
		System.out.println(y);
		
		int z = 5 + 3 * 4; // 곳셈과 나눗셈이 덧셈과 뺄셈보다 우선순위가 높다
		System.out.println(z);
	}

}
