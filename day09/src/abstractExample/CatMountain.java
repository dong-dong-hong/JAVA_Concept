package abstractExample;

public class CatMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat wideSomi = new Somi();
		wideSomi.run();
		wideSomi.slash();
		
		System.out.println("=============");
		
		Somi narrowSomi = new Somi();
		narrowSomi.run();
		narrowSomi.slash();
	}

}
