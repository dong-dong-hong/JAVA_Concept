package virtualGame;

public class VirtualMF {

	// monster의 이름(문자열)을 담을 list를 생성합니다.
	public String[] monsterList;

	VirtualMF() {
		
	}
	
	VirtualMF(String[] monsterList) {
		this.monsterList = monsterList;
	}
	public void printMonsterInfo(Integer index) {
		System.out.println("*");
		System.out.println(monsterList[index] + "를 획득하였습니다!");
	}
}
