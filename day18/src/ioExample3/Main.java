package ioExample3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader bufferReader = new BufferedReader(reader);
		
		
		try {
			String someWord = "";
			someWord = bufferReader.readLine();
			
			System.out.println("어떤값이 입력되었을까요?: "  + someWord);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
