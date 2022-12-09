package ioExample2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		InputStream in = System.in;
		
		InputStreamReader reader = new InputStreamReader(in);
		
		// char로 된 배열을 생성한다.
		char[] someWord = new char[5];
		
		try {
			reader.read(someWord);
			// 반환돼서 어디에 넣는 형식이 아니라, 매개변수로 넘어온 배열에 그대로 저장한다.
			// 반환 방식이 조금 달라서 헷갈릴 수는 있다.
			
			System.out.println(someWord);
			// 그래서 someWord =  <- 이런식으로 대입하지 않는다
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
