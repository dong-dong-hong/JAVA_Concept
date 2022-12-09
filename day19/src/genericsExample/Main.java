package genericsExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat<String> catName = new Cat<>();
		catName.setSomeInfo("소미");
		
		System.out.println("고양이의 이름은... " + catName.getSomeInfo() + "이다.");
		
		
		Cat<Integer> catAge = new Cat<>();
		catAge.setSomeInfo(5);
		
		System.out.println("고양이의 나이는..." + catAge.getSomeInfo() + "살 이다.");
		
		Cat<Boolean> catOrNot = new Cat<>();
		catOrNot.setSomeInfo(true);
		
		System.out.println("정말...고양이가 맞나요?..." + catOrNot.getSomeInfo());
	}

}
