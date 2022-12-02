package procedureExample;

public class Procedure {
	
	public static void printLog(String message) {
		System.out.println(message);
	}
	
	public static void walkingOnTheRoad(String catName) {
		printLog(catName + "이(가) 길 위를 걷고 있씁니다.");
	}
	
	public static void detectCanOnTheRoad(String catName, String canName) {
		printLog(catName + "이(가) " + canName + "을(를) 발견하였습니다.");
	}

	public static void eatingTunaInTheCan(String canName) {
		printLog(canName + "을(를) 먹는 중입니다... 옴뇸뇸~");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		walkingOnTheRoad("소미");
		detectCanOnTheRoad("소미", "전어맛캔");
		eatingTunaInTheCan("전어맛캔");
		walkingOnTheRoad("소미");
	}

}
