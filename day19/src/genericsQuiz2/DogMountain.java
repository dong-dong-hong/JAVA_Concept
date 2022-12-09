package genericsQuiz2;

public class DogMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duchi duchi = new Duchi();
		duchi.setSomeInfo("두치");
		
		DogArmor<Duchi> armor = new DogArmor<> ();
		System.out.print(duchi.getSomeInfo() + ": "  );	
				armor.setArmor(duchi);
		
				
		Bbuggu bbuggu = new Bbuggu();
		bbuggu.setSomeInfo("뿌꾸");
		
		DogArmor<Bbuggu> armor2 = new DogArmor<>();
		System.out.print(bbuggu.getSomeInfo() + ": ");
		armor2.setArmor(bbuggu);
	}

}
