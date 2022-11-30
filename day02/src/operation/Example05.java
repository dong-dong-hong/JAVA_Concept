package operation;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10 , j =0;
		j = i++;
		System.out.println("후위형 계산된 후 -> i= " + i + ", j=" + j);
		
		i = 10;
		j = 0;
		
		j = ++i;
		System.out.println("전위형 계산된 후 -> i= " + i + ", j=" + j);
	}

}
