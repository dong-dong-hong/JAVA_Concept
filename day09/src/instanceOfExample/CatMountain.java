package instanceOfExample;

public class CatMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat();
		Somi somi = new Somi();
		
		System.out.println(cat instanceof Cat);
		System.out.println(somi instanceof Cat);
		System.out.println(cat instanceof Somi);
		System.out.println(somi instanceof Somi);
	}

}
