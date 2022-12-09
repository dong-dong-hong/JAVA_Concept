package ioExample;

import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream in = System.in;
		
		// InputStream의 read() 메소드는 1byte의 사용자 입력을 받는다.
		// 위에서 byte로 불러온다고해서 byte자료형으로 저장될 것 같지만 그렇지 않고 Integer형으로 저장
		// 왜냐하면 0~255 사이 값인 '아스키 코드'로 저장되기 때문이다.
		
		try {
			Integer someword = 0;
			someword = in.read();
			System.out.println(someword);
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
