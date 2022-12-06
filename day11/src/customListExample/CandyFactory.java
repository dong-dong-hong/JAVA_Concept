package customListExample;

import java.util.ArrayList;

public class CandyFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 사탕 번들을 하나 만들자
		ArrayList<Candy> candyBundleList = new ArrayList();
		
		// 1. 빨간색 진저맛 사탕
		Candy redGingerCandy = new Candy();
		redGingerCandy.setColor("RED");
		redGingerCandy.setFlavor("GINGER");
		redGingerCandy.setShape("CIRCLE");
		
		// 2. 빨간색 과일맛 사탕
		Candy redFruitCandy = new Candy();
		redFruitCandy.setColor("RED");
		redFruitCandy.setFlavor("FRUIT");
		redFruitCandy.setShape("CIRCLE");
		
		// 3. 빨간색 꿀맛 사탕
		 Candy redHoneyCandy = new Candy();
		 redHoneyCandy.setColor("RED");
		 redHoneyCandy.setFlavor("HONEY");
		 redHoneyCandy.setShape("CIRCLE");
		 
		// 4. 파란색 진저맛 사탕
			Candy blueGingerCandy = new Candy();
			blueGingerCandy.setColor("BLUE");
			blueGingerCandy.setFlavor("GINGER");
			blueGingerCandy.setShape("CIRCLE");

			// 5. 파란색 과일맛 사탕
			Candy blueFruitCandy = new Candy();
			blueFruitCandy.setColor("BLUE");
			blueFruitCandy.setFlavor("FRUIT");
			blueFruitCandy.setShape("CIRCLE");

			// 6. 파란색 꿀맛 사탕
			Candy blueHoneyCandy = new Candy();
			blueHoneyCandy.setColor("BLUE");
			blueHoneyCandy.setFlavor("HONEY");
			blueHoneyCandy.setShape("CIRCLE");

			// 7. 노란색 진저맛 사탕
			Candy yellowGingerCandy = new Candy();
			yellowGingerCandy.setColor("YELLOW");
			yellowGingerCandy.setFlavor("GINGER");
			yellowGingerCandy.setShape("CIRCLE");

			// 8. 노란색 과일맛 사탕
			Candy yellowFruitCandy = new Candy();
			yellowFruitCandy.setColor("YELLOW");
			yellowFruitCandy.setFlavor("FRUIT");
			yellowFruitCandy.setShape("CIRCLE");

			// 9. 노란색 꿀맛 사탕
			Candy yellowHoneyCandy = new Candy();
			yellowHoneyCandy.setColor("YELLOW");
			yellowHoneyCandy.setFlavor("HONEY");
			yellowHoneyCandy.setShape("CIRCLE");
			
			// 이제, 캔디 번들에 사탕들을 추가
			candyBundleList.add(redGingerCandy);
			candyBundleList.add(redFruitCandy);
			candyBundleList.add(redHoneyCandy);
			candyBundleList.add(blueGingerCandy);
			candyBundleList.add(blueFruitCandy);
			candyBundleList.add(blueHoneyCandy);
			candyBundleList.add(yellowGingerCandy);
			candyBundleList.add(yellowFruitCandy);
			candyBundleList.add(yellowHoneyCandy);
			
			// 사탕 상자를 열고, 사탕들을 넣자
			CandyBox candyBox = new CandyBox();
			candyBox.initCandyList();
			candyBox.setCandyList(candyBundleList);
			
			// 출력
			candyBox.printCandyList();
			
			System.out.println("");
			System.out.println("똑냥이: 고된 아르바이트가 끝났다옹!");
	}

}
