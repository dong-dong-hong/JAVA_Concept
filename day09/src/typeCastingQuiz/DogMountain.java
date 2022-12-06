package typeCastingQuiz;

public class DogMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog duchi = new Duchi();
		duchi.run();
		((Duchi) duchi).bark();
	}

}
