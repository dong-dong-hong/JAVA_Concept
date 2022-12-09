package genericsExample5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Somi somi = new Somi();
		somi.setAge(1);
		somi.setName("소미");
		
		Cat<Somi> catInformation = new Cat<>(somi);
		
		System.out.println("고양이의 나이는 " + catInformation.getSomeInfo().getAge());
		System.out.println("고양이의 이름은 " + catInformation.getSomeInfo().getName());
	}

}
