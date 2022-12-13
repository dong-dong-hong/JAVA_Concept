package genericsQuiz2;

public class DogMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duchi duchi = new Duchi();
		duchi.setName("두치");
		
		DogArmor<Duchi> armorDuchi = new DogArmor<>();
		armorDuchi.setArmor(duchi.getName());
		
		Bbuggu bbuggu = new Bbuggu();
		bbuggu.setName("뿌꾸");
		
		DogArmor<Bbuggu> armorBbuggu = new DogArmor<>();
		armorBbuggu.setArmor(bbuggu.getName());
	}

}
