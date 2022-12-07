package exceptionExample4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] errorArray = new Integer[] {808, 909, 555, 111, 444};
		
		try {
			for(int i= 0; i < errorArray.length; i++) {
				
				if(i == 2) {
					throw new Exception();
				}
				
				System.out.println("계속 정상적으로 출력이 되어야 할텐데..." + errorArray[i]);
			}
			
		}catch(Exception exception) {
			
			System.out.println("저를 억지로 일으켜주세요!!");
		}
	}

}
