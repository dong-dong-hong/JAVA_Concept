package genericsExample7;

public class CatMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreasureBox<Integer, String> treasureBox = new TreasureBox<>();
		treasureBox.setKey(1);
		treasureBox.setValue("평화");
		
		System.out.println(treasureBox.getKey());
		System.out.println(treasureBox.getValue());
		
		treasureBox.setKey(2);
		treasureBox.setValue("사랑");
		
		System.out.println(treasureBox.getKey());
		System.out.println(treasureBox.getValue());
		
		
		treasureBox.add(3, "꿈");
		
		System.out.println(treasureBox.getKey());
		System.out.println(treasureBox.getValue());
		
	}

}
