package genericsExample6;

public class CatMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Somi somi = new Somi();
		somi.setName("이소미");
		
		PaperBox<Somi> somisPaperBox = new PaperBox<>();
		somisPaperBox.setPaperCnt(somi);
		System.out.println("종이박스 안의 고양이의 이름은 " + somisPaperBox.getPaperBox().getName());
		
		
		
		Semi semi = new Semi();
		semi.setName("이세미");
		
		PaperBox<Semi> semisPaperBox = new PaperBox<>();
		semisPaperBox.setPaperCnt(semi);
		System.out.println("종이박스 안의 고양이의 이름은 " + semisPaperBox.getPaperBox().getName());
		
		
		
		Sumi sumi = new Sumi();
		sumi.setName("이수미");
		
		PaperBox<Sumi> sumisPaperBox = new PaperBox<>();
		sumisPaperBox.setPaperCnt(sumi);
		System.out.println("종이박스 안의 고양이의 이름은 " + sumisPaperBox.getPaperBox().getName());
		
	}

}
