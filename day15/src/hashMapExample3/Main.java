package hashMapExample3;

import java.util.HashMap;
import java.util.Map.Entry;

import hashSetExample.Book;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> testHashMap = new HashMap<>();
		testHashMap.put(1, "hello-somi");
		testHashMap.put(2, "hello-semi");
		testHashMap.put(3, "hello-sumi");
		
		System.out.println("=======================");
		
		testHashMap.remove(2);
		
		System.out.println(testHashMap);
		
		System.out.println("=======================");
		
		testHashMap.remove(1);
		
		for(Entry<Integer, String> entry : testHashMap.entrySet()) {
			System.out.println("키값: " + entry.getKey());
			System.out.println("벨류값: " + entry.getValue());
		}
		
		System.out.println("========================");
		
		System.out.println("");
		System.out.println("");
		
		HashMap<String, String> testHashMap2 = new HashMap<>();
		testHashMap2.put("낭만고양이1", "hello-somi");
		testHashMap2.put("낭만고양이2", "hello-semi");
		testHashMap2.put("낭만고양이3", "hello-somi");
		
		System.out.println("=======================");
		
		testHashMap2.remove("낭만고양이2");
		
		System.out.println(testHashMap2);
		System.out.println("=======================");
		
		testHashMap2.remove("낭만고양이1");
		
		
		for(Entry<String, String> entry : testHashMap2.entrySet()) {
			System.out.println("키값: " + entry.getKey());
			System.out.println("벨류값: " + entry.getValue());
		}
		
		
		System.out.println("==================");
		
		System.out.println("");
		System.out.println("");
			
			
		Book book = new Book();
		book.setPaperCnt(808);
		Book book2 = new Book();
		book2.setPaperCnt(809);
		Book book3 = new Book();
		book3.setPaperCnt(810);
		
		HashMap<Integer, Book> testHashMap3 = new HashMap<>();
		testHashMap3.put(1, book);
		testHashMap3.put(2, book2);
		testHashMap3.put(3, book3);
		
		System.out.println("======================");
		
		testHashMap3.remove(3);
		
		System.out.println(testHashMap3);
		System.out.println("======================");
		
		testHashMap3.remove(1);
		
		for(Entry<Integer, Book> entry: testHashMap3.entrySet()) {
			System.out.println("키값: " + entry.getKey());
			System.out.println("밸류값: " + entry.getValue());
		}
		
		System.out.println("=======================");
		
		System.out.println("");
		System.out.println("");
	}

}
