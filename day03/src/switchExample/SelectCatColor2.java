package switchExample;

public class SelectCatColor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dyeingColor = "Yellow";
		
		switch(dyeingColor) {
		case "Red" : case "Blue" : case "white" : case "Black":
			System.out.println("이 색은 싫다냥");
			break;
		case "Yellow":
			System.out.println("나는 이 색이 마음에 든당, 이 색으로 하겠다냥");
			break;
			default:
				System.out.println("이 색은 싫다냥");
				break;
	   }
	}
}
