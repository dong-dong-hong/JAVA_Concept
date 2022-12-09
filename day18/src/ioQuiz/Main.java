package ioQuiz;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method
		 Somi somi = new Somi();
		 Duchi duchi = new Duchi();                                  
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("부르고 싶은 동물의 이름을 불러주세요.");
		 String a = scanner.next();
		 
		if(a == "소미" ) {
			somi.called();
		}else if(a == "두치") {
			duchi.called();
		}else {
			System.out.println("실패");
		}
		
		// 부르고 싶은 동물의 이름을 불러주세요.
		// 소미
		// 소미: 나 불렀냐옹?
		
		// 부르고 싶은 동물의 이름을 불러주세요.
		// 두치
		// 두치: 날 불렀나?
		
		// 아직 실패..
}
}
