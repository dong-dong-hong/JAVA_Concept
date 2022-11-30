package variable;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x = 10;
		Integer y = 20;
		Integer tmp = 0;
		
		System.out.println("x:" + x + "y:" + y);
		
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x:" + x + "y:" + y);
	}

}
