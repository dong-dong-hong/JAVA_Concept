package exceptionExample3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] errorArray = new Integer[] {808, 909, 555, 111, 444};
		
		for(int i=0; i <= errorArray.length; i++) {
			try {
				System.out.println("과연 출력이 될것인지...." + errorArray[i]);
			}catch(Exception exception) {
				
				System.out.println("잡았다 이놈..!");
				System.out.println("어라..에러가 안일어나네?");
				System.out.println("그렇다면, 원인을 프린트해볼까요...." + exception.getMessage());
				System.out.println("");
			}finally {
				
				System.out.println("나는 무조건 실행된다");
			}
		}
	}

}
