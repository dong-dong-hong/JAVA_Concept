package genericsExample2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat<String> catName = new Cat<>("소미");
		
		System.out.println("고양이의 이름은..." + catName.getSomeInfo() + "이다.");
		
		Cat<Integer> catAge = new Cat<>(1);
		
		System.out.println("고양이의 나이는..." + catAge.getSomeInfo() + "살 이다.");
		
		Cat<Boolean> catOrNot = new Cat<>(true);
		
		System.out.println("정말... 고양이가 맞아?.." + catOrNot.getSomeInfo());
	}

}
