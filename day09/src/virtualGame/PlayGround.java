package virtualGame;

public class PlayGround {
	
	public static void printUser(Virtualmonster virtualMonster) {
		System.out.println("monster 번호 : " + virtualMonster.monsterNo);
		System.out.println("monster 이름 : " + virtualMonster.name);
		System.out.println("monster 설명 : " + virtualMonster.explain);
		System.out.println();
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Virtualmonster virtualMonster = new Virtualmonster();
		Virtualmonster virtualMonster2 = new Virtualmonster();
		Virtualmonster virtualMonster3 = new Virtualmonster();
		
		System.out.println("가상 몬스터 도감을 열어보자(철커덕)");
		virtualMonster.setMonsterNo(0L);
		virtualMonster.setName("파이터 쥐");
		virtualMonster.setExplain("하수구의 고독한 파이터 쥐입니다.");
		
		printUser(virtualMonster);
		
		System.out.println("가상 몬스터 도감을 열어보자(철커덕)");
		virtualMonster2.setMonsterNo(1L);
		virtualMonster2.setName("전사 쥐");
		virtualMonster2.setExplain("전장의 고독한 전사 쥐입니다.");
	
		printUser(virtualMonster2);
		
		System.out.println("가상 몬스터 도감을 열어보자(철커덕)");
		virtualMonster3.setMonsterNo(2L);
		virtualMonster3.setName("마법사 쥐");
		virtualMonster3.setExplain("마법 세계의 고독한 마법사 쥐입니다.");
		
		printUser(virtualMonster3);
	}

}
