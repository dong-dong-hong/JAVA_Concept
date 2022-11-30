package whileExample;

public class WhileExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int invokeCnt = 1;
		
		while(invokeCnt <= 15) {
			System.out.println("안녕하세요, 저는 몇번 실행이 될까요? -> " + invokeCnt);
			invokeCnt = invokeCnt + 1;
		}
	}

}
