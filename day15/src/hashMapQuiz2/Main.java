package hashMapQuiz2;

import java.util.HashMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> cat = new HashMap<>();
		cat.put(1, "소미");
		cat.put(2, "똑냥이");
		cat.put(3, "세미");
		cat.put(4, "냥아치");
		cat.put(5, "냥쓸이");
		cat.put(6, "힐냥이");
		cat.put(7, "켓초딩");
		
		for(Entry<Integer,String>entry : cat.entrySet() ) {
			System.out.println(entry.getKey() + "번째 고양이는 " + entry.getValue()+ "입니다.");
		}
		
		
	}

}
