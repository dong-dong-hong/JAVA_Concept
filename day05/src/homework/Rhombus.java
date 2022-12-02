package homework;

public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i <=5; i++) {
			
			// 공백 그리기
			for(int j=0; j < 5-i; j++) {
				System.out.print(" ");
			}
			
			//그리기
			for(int k = 0; k < (2*i)-1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=4; i >0; i--) {
			
			// 공백 그리기
			for(int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			
			// 그리기
			for(int k=0; k <(2*i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
 	}

}
