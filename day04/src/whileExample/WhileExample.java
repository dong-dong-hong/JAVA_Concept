package whileExample;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean invokeOrNot = true;
		
		while(invokeOrNot) {
			System.out.println("안녕하세요, 저는 while문에 들어왔습니다.");
			System.out.println("저는..언제까지 실행되는 것일까요?");
			invokeOrNot = false;
			if(!invokeOrNot) {
				break;
			}
			System.out.println("저는 아마도 출력되지 않을 것입니다.");
		}
	}

}
