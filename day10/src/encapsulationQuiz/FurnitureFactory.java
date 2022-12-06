package encapsulationQuiz;

public class FurnitureFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Table table = new Table();
		
		System.out.println("다리 " + table.getLegCnt(4)+ "개에 원판 " + table.getCircleBoardCnt(1) +"개짜리 가구가 조립되었습니다.");
		System.out.println("다리 " + table.getLegCnt(6)+ "개에 원판 " + table.getCircleBoardCnt(1) +"개짜리 가구가 재조립되었습니다.");
	}

}
