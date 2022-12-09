package enumQuiz;

public class Bakery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DessertType dessert = DessertType.BREAD;
		
		System.out.println("힐냥이: 흐음 메뉴가 너무 많다냥~");
	
		for(int i = 0 ; i < dessert.values().length; i++) {
			System.out.println("힐냥이: " + dessert.values()[i].getDessertNameToKorean());
		}
		
		System.out.println("힐냥이: 역시 못외우겠다냥~");
	
	}

}
