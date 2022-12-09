package arrayListExample5;

import java.util.ArrayList;

public class CatGoodsStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chur chur = new Chur(TubeType.SQUARE, ColorType.YELLOW);
		Chur chur2 = new Chur(TubeType.SQUARE, ColorType.BLUE);
		Chur chur3 = new Chur(TubeType.RECTANGLE, ColorType.GREEN);
		
		ArrayList<Chur> churList = new ArrayList<>();
		churList.add(chur);
		churList.add(chur2);
		churList.add(chur3);
		
		for(int i = 0; i < churList.size(); i++) {
			System.out.println((i+1) + " 번째 튜브 모양 타입 : " + churList.get(i).getTubeType());
			System.out.println((i+1) + " 번째 튜브 색깔 타입 : " + churList.get(i).getColorType());
			System.out.println();
		}
		
		System.out.println("=======================");
		System.out.println();
		
		for(int i = 0; i < churList.size(); i++) {
			
			if(churList.get(i).getTubeType() == TubeType.RECTANGLE) {
				churList.get(i).setTubeType(TubeType.SQUARE);
			}
			
			if(churList.get(i).getColorType() == ColorType.BLUE) {
				churList.get(i).setColorType(ColorType.GREEN);
			}
			
			System.out.println((i+1) + " 번째 튜브 모양 타입 : " + churList.get(i).getTubeType());
			System.out.println((i+1) + " 번째 튜브 색깔 타입 : " + churList.get(i).getColorType());
			System.out.println();
		}
	}

}
