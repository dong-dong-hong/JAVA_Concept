package practice04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Office office = new Office(3);
		
		// 1.
		User user1 = new User();
		user1.setUserNo(0L);
		user1.setUserType("준회원");
		user1.setEmail("sdh5518@naver.com");
		
		// users[0] 자리에 user1을 넣어줍니다.
		office.addUser(0, user1);
		
		// 2.
		User user2 = new User();
		user2.setUserNo(1L);
		user2.setUserType("정회원");
		user2.setEmail("somi123@naver.com");
		
		// user[1] 자리에 user2을 넣어줍니다.
		office.addUser(1, user2);
		
		// 3.
		User user3 = new User();
		user3.setUserNo(2L);
		user3.setUserType("정회원");
		user3.setEmail("semi123@naver.com");
		
		// user[2] 자리에 user3을 넣어줍니다.
		office.addUser(2, user3);
		
		// 전부 출력
		office.printAllUsers();
	}

}
