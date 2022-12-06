package encapsulation;

public class CatMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CatTower catTower = new CatTower();
		
		// 호출된 내용을 출력
		System.out.println(catTower.getSupportCnt());
		
		// 재선언(재할당)
		catTower.setSupportCnt(6);
		
		// 재선언(재할당)된 내용을 출력
		System.out.println(catTower.getSupportCnt());
	}

}
