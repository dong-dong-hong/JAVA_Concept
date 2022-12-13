package genericsLimitExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat1 = new Cat();
		cat1.setName("소미");
		
		Cat cat2 = new Cat();
		cat2.setName("세미");
		
		Cat cat3 = new Cat();
		cat3.setName("수미");
		
		Cat[] catList = new Cat[] {cat1,cat2,cat3};
		
		PaperBox<Cat> paperBox = new PaperBox<>();
		
		paperBox.setList(catList);
		
		for(int i=0; i < catList.length; i++) {
			System.out.println(catList[i].getName());
		}
	}

}
