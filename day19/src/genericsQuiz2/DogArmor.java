package genericsQuiz2;

public class DogArmor<T extends Dog> {

	T armor;
	
	public void setArmor(T armor) {
		System.out.println("갑옷 장착 완료");
	}
	
	public T getArmor() {
		return armor;
	}
	
	
}
