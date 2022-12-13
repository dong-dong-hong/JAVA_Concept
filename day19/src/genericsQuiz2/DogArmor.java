package genericsQuiz2;

public class DogArmor<T extends Dog> {

	public void setArmor(String name){
		System.out.pritln(name + " : 갑옷 장착 완료");
	}
	
	
}
