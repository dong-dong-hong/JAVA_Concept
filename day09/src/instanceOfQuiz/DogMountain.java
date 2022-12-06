package instanceOfQuiz;

public class DogMountain {
	
	public static void printInstanceNameCorrectly(Dog dog) {
		if(dog instanceof Duchi) {
			System.out.println("두치: yo 나는 두치. 내 옆차기 한방이면 너네 모두 날라가지");
		}else if(dog instanceof Bbuggu) {
			System.out.println("뿌꾸: yo 나는 뿌꾸. 내 이름을 까먹으면 나는 너의 강아지껌을 까서 먹지");
		}else {
			System.out.println("아기강아지: yo 나는 아기강아지. 사료만 먹는 평범한 아기 강아지들 이제 모두 필요없지");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		Dog duchi = new Duchi();
		Dog bbuggu = new Bbuggu();
		
		System.out.println("- show me the 밥그릇 예선-");
		System.out.println();
		
		printInstanceNameCorrectly(dog);
		printInstanceNameCorrectly(duchi);
		printInstanceNameCorrectly(bbuggu);
		
	}

}
