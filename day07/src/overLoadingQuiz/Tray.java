package overLoadingQuiz;

public class Tray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CatSandWich catSandWich = new CatSandWich();
		
		System.out.println("catSandwich ingredients : " + catSandWich.bread.getBreadType());
		System.out.println("catSandwich ingredients : " + catSandWich.cheese.getCheeseType());
		System.out.println("catSandwich ingredients : " + catSandWich.tomato.getTomatoType());
		System.out.println("catSandwich ingredients : " + catSandWich.lettuce.getLettuceType());
		System.out.println("catSandwich ingredients : " + catSandWich.onion.getOnionType());
		System.out.println("catSandwich ingredients : " + catSandWich.patty.getPattyType());
	}
}
