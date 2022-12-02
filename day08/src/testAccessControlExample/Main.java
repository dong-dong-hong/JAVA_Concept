package testAccessControlExample;

import defaultExample.DefaultMain;
import protectedExample.ProtectedMain;
import publicExample.PublicMain;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		DefaultMain defaultMain = new DefaultMain();
//		defaultMain.getName();
//		
//		ProtectedMain protectedMain = new ProtectedMain();
//		protectedMain.getName();
//		
		PublicMain publicMain = new PublicMain();
		publicMain.getName();
		
		// 출력해볼까요?
		System.out.println("퍼블릭, 접근이 가능할 것인가? " + publicMain.getName());
		
		
		
	}

}
