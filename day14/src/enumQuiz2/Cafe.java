package enumQuiz2;

public class Cafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoffeeType coffeeType = CoffeeType.AMERICANO;
		
		System.out.println("소미: 이 원두의 영문이름은 뭐냐옹?");
		System.out.println("알바냥: " + coffeeType.name());
		//System.out.println("알바냥: " + coffeeType.valueOf("AMERICANO"));
		System.out.println("소미: 한글로 해줄순 없겠냥?");
		System.out.println("알바냥: " + coffeeType.getCoffeeTypeKorean());
		System.out.println("소미: 몇번째에 열거해둔거냥?");
		System.out.println("알바냥: " + coffeeType.ordinal());
	}

}
