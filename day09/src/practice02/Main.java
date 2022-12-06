package practice02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 User[] users = new User[3];

	        // 1.
	        User user1 = new User();
	        user1.setUserNo(0L);
	        user1.setUserType("준회원");
	        user1.setEmail("luffy123@naver.com");

	        // users[0] 자리에 user1 을 넣어줍니다.
	        users[0] = user1;

	        // 2.
	        User user2 = new User();
	        user2.setUserNo(1L);
	        user2.setUserType("정회원");
	        user2.setEmail("somi123@naver.com");

	        // users[1] 자리에 user2 을 넣어줍니다.
	        users[1] = user2;

	        // 3.
	        User user3 = new User();
	        user3.setUserNo(2L);
	        user3.setUserType("정회원");
	        user3.setEmail("semi123@naver.com");

	        // users[2] 자리에 user3 을 넣어줍니다.
	        users[2] = user3;

	        // 전부 출력
	        for(Integer i = 0; i < users.length; i++) {
	            System.out.println();
	            System.out.println("user 번호 : " + users[i].getUserNo());
	            System.out.println("user 타입 : " + users[i].getUserType());
	            System.out.println("user 이메일 : " + users[i].getEmail());
	            System.out.println();
	        }
	}

}
