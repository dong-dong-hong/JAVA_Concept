package enumExample3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeyingColorType originCatColor = DeyingColorType.YELLOW;
		
		System.out.println("소미: 나는 염색하고 싶다옹");
		System.out.println("소미: 지금 나의 색깔은 " + originCatColor + "이다옹");
		
		DeyingColorType deyingColor = DeyingColorType.BLUE;
		
		if(deyingColor == DeyingColorType.YELLOW) {
			System.out.println("소미: 이건 싫다옹");
		}else if(deyingColor == DeyingColorType.BLUE) {
			System.out.println("소미: 개성있고 좋다옹");
		}else if(deyingColor == DeyingColorType.BLACK) {
			System.out.println("소미: 개성있고 좋다옹");
		}else if(deyingColor == DeyingColorType.SKY_BLUE) {
			System.out.println("소미: 개성있고 좋다옹");
		}else if(deyingColor == DeyingColorType.RED) {
			System.out.println("소미: 개성있고 좋다옹");
		}
	}

}
