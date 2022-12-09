package enumExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String shapeType = "CIRCLE"; // TRIANGLE, SQUARE
		
		if(shapeType == "CIRCLE") {
			System.out.println("나는 동그라미");
		}else if(shapeType == "TRIANGLE") {
			System.out.println("나는 세모");
		}else if(shapeType == "SQUARE") {
			System.out.println("나는 네모");
		}else {
			System.out.println("나는 아무것도 아니란 말이야");
		}
	}

}
