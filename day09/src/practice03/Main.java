package practice03;

public class Main {
	
	public static void printUser(User user) {
		System.out.println();
		System.out.println("user 번호 : " + user.userNo);
		System.out.println("user 이름 : " + user.name);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user = new User();
		user.userNo = 1L;
		user.name = "평범이";
		
		printUser(user);
		
		User user2 = new User();
		user2.userNo = 2L;
		user2.name = "평범이2";
		
		printUser(user2);
	}

}
