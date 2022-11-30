package forExample;

public class oddValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(Integer i = 0; i < 10; i++) {
			if(i%2 == 0) {// '나머지값'을 계산해 주는 연산자
				System.out.println(i + "는 짝수입니다." );
			}else {
				System.out.println(i + "는 홀수입니다." );
				
			}
		}
	}

}
