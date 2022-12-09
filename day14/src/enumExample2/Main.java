package enumExample2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FoodType foodType = FoodType.KR;
		
		if(foodType == FoodType.KR) {
			System.out.println("소미: 한국음식 맛있다냥~");
		}else if(foodType == FoodType.JP) {
			System.out.println("소미: 일본음식 맛있다냥~");
		}else if(foodType == FoodType.US) {
			System.out.println("소미: 미국음식 맛있다냥~");
		}
	}

}
