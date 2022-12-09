package config;

public class SystemAnnouncer {

	public void printStartRound(Integer round) {
		System.out.println("");
		System.out.println(round + "회전 시작합니다!");
		System.out.println("");
	}
	
	public void printCharacterStatus(String charName, Integer charHp, Integer charMp) {
		System.out.println("");
		System.out.println(charName + " HP: " + charHp );
		System.out.println(charName + " MP: " + charMp);
	}
	
	public void refreshRound(Integer round) {
		System.out.println("");
		System.out.println(round + "회전이 종료되었습니다!");
		System.out.println("");
	}
}
