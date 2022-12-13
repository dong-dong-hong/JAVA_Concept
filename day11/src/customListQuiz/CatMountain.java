package customListQuiz;

import java.util.ArrayList;

public class CatMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salmon bigSalmon = new Salmon();
		bigSalmon.setType("BIG");
		
		Salmon bigSalmon2 = new Salmon();
		bigSalmon2.setType("BIG");
		
		Salmon mediumSalmon = new Salmon();
		mediumSalmon.setType("MEDIUM");
		
		Salmon mediumSalmon2 = new Salmon();
		mediumSalmon2.setType("MEDIUM");
		
		Salmon mediumSalmon3 = new Salmon();
		mediumSalmon3.setType("MEDIUM");
		
		Salmon smallSalmon = new Salmon();
		smallSalmon.setType("SMALL");
		
		Salmon smallSalmon2 = new Salmon();
		smallSalmon2.setType("SMALL");
		
		ArrayList<Salmon> salmonList = new ArrayList<>();
		salmonList.add(bigSalmon);
		salmonList.add(bigSalmon2);
		salmonList.add(mediumSalmon);
		salmonList.add(mediumSalmon2);
		salmonList.add(mediumSalmon3);
		salmonList.add(smallSalmon);
		salmonList.add(smallSalmon2);
		
		CuttingBoard cuttingBoard = new CuttingBoard();
		
		System.out.println("===== 남아있는 연어들 =====");
		
		for(int i=0; i < salmonList.size()-1; i++ ) {
			String salmonList = salmonList.get(i).getType();
			
			System.out.println(cutingBoard.translateType(salmonType) + "연어");
		}
		
		System.out.println("=========================");
		
		System.out.println();
		System.out.println("세미: 내가 맏언니니까! 큰 연어는 내가 먹을테다!");
		System.out.println();
		
		salmonList.remove(0);
		salmonList.remove(0);
		
		System.out.println("==== 남아있는 연어들 ====");
		
		for(int i=0; i <= salmonList.size()-1; i++) {
			String salmonType = salmonList.get(i).getType();
			
			System.out.println(cuttingBoard.translateSalmonType(salmonType) + "연어");
		}
		
		System.out.println("===========================");
		
		System.out.println();
		System.out.println("수미: 나는 다이어트증이라서 작은 연어를 먹을래");
		System.out.println();
		
		salmonList.remove(3);
		salmonList.remove(3);
		
		System.out.println("==== 남아 있는 연어들 ====");
		
		for(int i=0; i <= salmonList.size()-1; i++) {
			String salmonType = salmonList.get(i).getType();
			
			System.out.println(cuttingBoard.translateSalmonType(salmonType));
			
		}
		System.out.println("===========================");
		System.out.println();
		System.out.println("소미:우와~ 그럼 미디어 사이즈는 내꺼당");
		System.out.println();
		System.out.println("모든 연어가 소멸되었다!");
	}
}
