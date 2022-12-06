package practice04;

public class Office {

	
	User [] users;
	
	Office(Integer useCnt) {
		// userCnt개의 공간을 만들어줍니다.
		users = new User[useCnt];
	}
	
	public void addUser(Integer userIndex, User user) {
		users[userIndex] = user;
	}
	
	public void printUsers(User user) {
		System.out.println();
		System.out.println("*");
		System.out.println("userNo : " + user.userNo);
		System.out.println("userType : " + user.userType);
		System.out.println("userEmail : " + user.email);
		System.out.println();
	}
	
	public void printAllUsers() {
		if(users.length != 0) {
			for(int i =0; i <users.length; i++) {
				System.out.println("*");
				System.out.println("userNo : " + users[i].userNo);
				System.out.println("userType : " + users[i].userType);
				System.out.println("userEmail : " + users[i].email);
				System.out.println();
			}
		}else {
			System.out.println("아무런 데이터가 없습니다.");
		}
	}
}
