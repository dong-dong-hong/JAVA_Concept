package customListQuiz;

import java.util.ArrayList;

public class CatMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salmon salmon = new Salmon();
		ArrayList<Salmon> salmonList = new ArrayList();
		CuttingBoard board = new CuttingBoard();
		
		salmon.setType("BIG");
		
		for(int i=0; i< salmonList.size(); i++) {
			String type = salmonList.get(i).getType();
			
			System.out.println(i);
		}
	}

}
