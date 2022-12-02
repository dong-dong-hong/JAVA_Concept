package virtualGame;

public class PlayGround {
	
	public static String CAT_NAME = "켓초딩";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] ownMonsterList = {"낭만고양이", "들쥐", "똥강아지"};
		
		VirtualMF virtualMF = new VirtualMF(ownMonsterList);
		
		for(int i=0; i < ownMonsterList.length; i++) {
			
			virtualMF.printMonsterInfo(i);
			
			if(i == 0) {
				System.out.println(CAT_NAME + " : " + "아싸~ 낭만고양이를 얻었다~!");
			}
		}
	}

}
