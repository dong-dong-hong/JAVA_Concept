package overLoadingQuiz;

public class CatSandWich extends Sandwich {

	CatSandWich() {
		this.bread = new Bread();
		this.cheese = new Cheese();
		this.lettuce = new Lettuce();
		this.onion = new Onion();
		this.patty = new Patty();
		this.tomato = new Tomato();
	}
	
	
	public void setIngredients(String breadType , String cheeseType , String lettuceType, String onionType, String pattyType, String tomatoType) {
		this.bread.type = breadType;
		this.cheese.type = cheeseType;
		this.lettuce.type = lettuceType;
		this.onion.type = onionType;
		this.patty.type = pattyType;
		this.tomato.type = tomatoType;
	}
}
