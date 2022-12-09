package genericsExample4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Somi somi = new Somi();
		somi.setAge(1);
		somi.setName("소미");
		
		Cat catInformation = new Cat(somi);
		
		
		System.out.println("고양이의 나이는..." + (((Somi) catInformation.getSomeInfo()).getAge()));
		System.out.println("고양이의 이름은..." + (((Somi) catInformation.getSomeInfo()).getName()));
		
		// 위 코드는 타입케스팅을 컴파일러가 자동으로 해주는 것을 위반한 내용이다.
		
		
		// 그 외의 문제
		
		Cat catInformation2 = new Cat(1);
		
		System.out.println("고양이의 나이는...2 " + (((Somi) catInformation2.getSomeInfo()).getAge()));
		
		Cat catInformation3 = new Cat("이름");
		
		System.out.println("고양이의 이름은...2 "+ ((Somi) catInformation3.getSomeInfo()).getName());
		
		//모든 것을 포괄하고 있는 Object class로 감싸져 있기때문에 컴파일러 입장에서는 진짜로 무엇이 들어있는지 알지 못하고 에러를 잡지 못하는 것이다.
		// 컴파일 단계에서 에러를 잡을 수 있는 것을 위배하는 내용이다.
	}

}
