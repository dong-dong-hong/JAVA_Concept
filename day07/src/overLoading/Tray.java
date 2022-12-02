package overLoading;

public class Tray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 생성자에 아무것도 넣어주지 않았으니, default로 지정했던 애들이 지정됩니다.
		SmallMac smallMac = new SmallMac();
		
		// 재료를 바꾸고 싶어서, 바꿔보겠습니다.
		smallMac.setIngredients("RED_LEAF", "GREEN");
		
		smallMac.setIngredients("RED_LEAF", "GREEN", "CHEDDAR");
		
		smallMac.setIngredients("RED_LEAF", "GREEN", "CHEDDAR", "GREEN_ONION");
		
		smallMac.setIngredients("RED_LEAF","GREEN", "CHEDDAR","GREEN_ONION", "COW");
		
		System.out.println("smallMac ingredients: " + smallMac.lettuce.getLettuceType());
		System.out.println("smallMac ingredients: " + smallMac.tomato.getToatoType());
		System.out.println("smallMac ingredients: " + smallMac.cheese.getCheeseType());
		System.out.println("smallMac ingredients: " + smallMac.onion.getOnionType());
		System.out.println("smallMac ingredients: " + smallMac.patty.getPattyType());
	}

}
