package genericsQuiz;

public class CatMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Christmas christmas = new Christmas();
		christmas.setChristmasType("장난감로봇");
		
		EndOfYear endOfYear = new EndOfYear();
		endOfYear.setEndOfYearType("샤랄라향수");

		PresentBox<Christmas> chr = new PresentBox<>();
		chr.setPresentBoxType(christmas);
		PresentBox<EndOfYear> end = new PresentBox<>();
		end.setPresentBoxType(endOfYear);
		
		System.out.println("소미: 여기 선물이야");
		System.out.println("똑냥이 : 흐음 뜯어볼까?");
		System.out.println("똑냥이 : 아니 이것은?");
		System.out.println("똑냥이(가)" + chr.getPresentBoxType().getChristmasType() +  "을(를) 획득하였습니다.");
		
		System.out.println();
		System.out.println("똑냥이: 나도 여기 선물이야" );
		System.out.println("소미: 흐음 뜯어볼까?");
		System.out.println("소미: 아니 이것은?");
		System.out.println("소미이(가)" + end.getPresentBoxType().getEndOfYearType() + "울(를) 획득하였습니다.");
	}

}
