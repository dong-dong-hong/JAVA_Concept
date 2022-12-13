package ioQuiz;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method
		
		                                   
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("부르고 싶은 동물의 이름을 불러주세요.");
		 String a = scanner.next();
		 
		if(a.equlas("소미") ) {
			Somi somi = new Somi();
			somi.called();
		}else if(a.equlas("두치")) {
			Duchi duchi = new Duchi();
			duchi.called();
		}else {
			System.out.println("실패");
		}
		
		
}
}
