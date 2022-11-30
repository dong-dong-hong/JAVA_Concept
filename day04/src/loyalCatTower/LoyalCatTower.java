package loyalCatTower;

public class LoyalCatTower {
	
	static Integer LOYAL_CAT_TOWER_FLOOR = 1;
	
	static Integer WANT_BUDDY_CNT = 4;
	static Integer HOUR = 12;
	
	static String MY_CAT_NAME = "소미"; 
	static String FIRST_BUDDY_NAME = "냥쓸이";
	static String SECOND_BUDDY_NAME = "똑냥이";
	static String THIRD_BUDDY_NAME = "냥아치";
	static String FOURTH_BUDDY_NAME = "켓초딩";
	static String FIFTH_BUDDY_NAME = "힐냥이";
	
	
	public static void printSimpleLog(String log) {
		System.out.println(log);
	}
	
	public static void invokeBuddyInfo(String name, String bio) {
		printSimpleLog("이름 : " + name);
		printSimpleLog("정보 : " + bio);
	}
	
	public static void invokeBuddyAction(String buddyName) {
		printSimpleLog(buddyName + "이(가) 동료가 되었습니다.");
	}
	
	public static String getRecruitmentSentence() {
		return "내 동료가 되지 않겠냥?";
	}
	
	public static void findBuddyOnTheFirstFloor() {
		
		Integer givenTime = HOUR / 4;
		
		for(int i = 0 ; i <=givenTime; i++) {
			
			if(i==2) {
				printSimpleLog("");
				printSimpleLog("도박장을 서성이던 소미, 도박냥 출신의 '냥쓸이'를 만나게 됩니다.");
				printSimpleLog("");
				printSimpleLog(MY_CAT_NAME + " : " + "앗..! 너는...!");
				
				
				printSimpleLog(MY_CAT_NAME + " : " + getRecruitmentSentence());
				invokeBuddyAction(FIRST_BUDDY_NAME);
				invokeBuddyInfo(FIRST_BUDDY_NAME, "자극적인 상황을 매우 좋아하고(즐기고) 맨날 츄르를 걸고 도박을 해요.");
				printSimpleLog("");
				printSimpleLog(i + "시간째에 동료를 찾았으니, 윗층으로 올라갑니다.");
				printSimpleLog("");
				break;
			}else {
				printSimpleLog("");
				printSimpleLog((i+1) + "시간째 찾는중...");
				printSimpleLog("");
			}
		}
	}
	
	public static void findBuddyOnTheSecondFloor() {
		
		Integer givenTime = HOUR / 4;
		
		for(int i=0; i <= givenTime; i++) {
			
			if(i==3) {
				printSimpleLog("");
				printSimpleLog("냥앤멍스 카페를 서성이던 소미, 컴공 출신의 '똑냥이'를 만나게 됩니다.");
				printSimpleLog("");
				printSimpleLog(MY_CAT_NAME + " : " + "앗..! 너는...!");
				
				//
				printSimpleLog(MY_CAT_NAME + " : " + getRecruitmentSentence());
				invokeBuddyAction(SECOND_BUDDY_NAME);
				invokeBuddyInfo(SECOND_BUDDY_NAME, "전자공학+컴퓨터공학 복수 전공 초 엘리트. 맨날 공부만해요.");
				printSimpleLog("");
				printSimpleLog(i+ "시간째에 동료를 찾았으니, 윗층으로 올라갑니다.");
				printSimpleLog("");
				break;
			}else {
				printSimpleLog("");
				printSimpleLog((i+1) + "시간째 찾는 중...");
				printSimpleLog("");
			}
		}
		
	}
	
	public static void findBuddyOnTheThirdFloor() {
		
		Integer givenTime = HOUR / 4;
		
		for(int i = 0; i<= givenTime; i++) {
		
			if(i==2) {
				printSimpleLog("");
				printSimpleLog(" 뒷골목을 서성이던 소미, 뒷골목 출신의 '냥아치'를 만나게 됩니다.");
				printSimpleLog("");
				printSimpleLog(MY_CAT_NAME + " : " + "앗..! 너는...!");
				
				//
				printSimpleLog(MY_CAT_NAME + " : " + getRecruitmentSentence());
				invokeBuddyAction(THIRD_BUDDY_NAME);
				invokeBuddyInfo(THIRD_BUDDY_NAME , "살벌한 분위기에 덩치가 큰 터프한 냥이에요.");
				printSimpleLog("");
				printSimpleLog(i + "시간째에 동료를 찾았으니 , 윗층으로 올라갑니다.");
				printSimpleLog("");
				break;
			}else {
				printSimpleLog("");
				printSimpleLog((i+1) + "시간째 찾는중...");
				printSimpleLog("");
			}
	   }
	}
	public static void findBuddyOnTheFourthFloor() {
		
		Integer givenTime = HOUR / 4;
		
		for(int i = 0 ; i <= givenTime; i++) {
			
			if(i==2) {
				printSimpleLog("");
				printSimpleLog("놀이동산을 서성이던 소미, 집구석 출신의 '켓초딩'을 만나게 됩니다.");
				printSimpleLog("");
				printSimpleLog(MY_CAT_NAME + " : " + "앗..! 너는...!");
				
				//
				printSimpleLog(MY_CAT_NAME + " : " + getRecruitmentSentence());
				invokeBuddyAction(FOURTH_BUDDY_NAME);
				invokeBuddyInfo(FOURTH_BUDDY_NAME, "아기 고양이에요.");
				printSimpleLog("");
				printSimpleLog(i + "시간째에 동료를 찾았으니, 윗층으로 올라갑니다.");
				printSimpleLog("");
				break;
			}else {
				printSimpleLog("");
				printSimpleLog((i+1) + "시간째 찾는 중...");
				printSimpleLog("");
			}
		}
	}
	
	public static void findBuddyOnTheFifthFloor() {
		
		Integer givenTime = HOUR / 4;
		
		for(int i = 0; i <=givenTime; i++) {
			if(i==2) {
				printSimpleLog("");
				printSimpleLog("병원을 서성이던 소미, 병원 출신의 '힐냥이'를 만나게 됩니다.");
				printSimpleLog("");
				printSimpleLog(MY_CAT_NAME + " : " + "앗..! 너는...!");
				
				//
				printSimpleLog(MY_CAT_NAME + " : " + getRecruitmentSentence());
				invokeBuddyAction(FIFTH_BUDDY_NAME);
				invokeBuddyInfo(FIFTH_BUDDY_NAME, "의사출신의 엘리트 냥이 가장 연장냥이고 은퇴 후 로얄켓타워에서 봉사하며 지내고있어요.");
				printSimpleLog("");
				printSimpleLog(i + "시간째에 동료를 찾았습니다.");
				printSimpleLog("");
				break;
			}else {
				printSimpleLog("");
				printSimpleLog((i+1)+ "시간째 찾는 중...");
				printSimpleLog("");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 저번 강아지 패거리들과의 싸움으로 소미는 동료의 필요성을 느끼게 되었습니다.
		// 소미는 고양이별에 있는 loyalCatTower에서 동료를 찾으려 합니다.
		
		switch(LOYAL_CAT_TOWER_FLOOR) {
		case 1:
			findBuddyOnTheFirstFloor();
			break;
		case 2:
			findBuddyOnTheSecondFloor();
			break;
		case 3:
			findBuddyOnTheThirdFloor();
			break;
		case 4:
			findBuddyOnTheFourthFloor();
			break;
		case 5 :
			findBuddyOnTheFifthFloor();
			break;
			default:
				System.out.println("이제 동료는 그만 찾아도 될 것 같다냥");
		}
	}

}
