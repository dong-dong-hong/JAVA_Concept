package hashSetExample3;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> integerHashSet = new HashSet<>();
		integerHashSet.add(1);
		integerHashSet.add(2);
		integerHashSet.add(333);
		
		
		System.out.println(integerHashSet);
		
		integerHashSet.remove(333); // 333에 해당하는 값 제거
		
		System.out.println(integerHashSet);
		
		integerHashSet.clear();// 모든 값 제거
		
		System.out.println(integerHashSet);
		
		Iterator<Integer> iterator = integerHashSet.iterator();
		
		while(iterator.hasNext()) { // 같이 있으면 true, 없으면 false 반환
			System.out.println(iterator.next());
		}
		
		System.out.println("");
		
		HashSet<String> stringHashSet = new HashSet<>();
		stringHashSet.add("소미");
		stringHashSet.add("세미");
		stringHashSet.add("수미");
		
		System.out.println(stringHashSet);
		
		stringHashSet.remove("세미");
		
		System.out.println(stringHashSet);
		
		stringHashSet.clear();
		
		System.out.println(stringHashSet);
		
		Iterator<String> iterator2 = stringHashSet.iterator();
		
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		System.out.println("");
		
		Book book = new Book();
		book.setPaperCnt(808);
		Book book2 = new Book();
		book2.setPaperCnt(809);
		Book book3 = new Book();
		book3.setPaperCnt(810);
		
		HashSet<Book> bookHashSet = new HashSet<>();
		bookHashSet.add(book);
		bookHashSet.add(book2);
		bookHashSet.add(book3);
		
		System.out.println(bookHashSet);
		
		bookHashSet.remove(book2);
		
		System.out.println(bookHashSet);
		
		bookHashSet.clear();
		
		System.out.println(bookHashSet);
		
		Iterator<Book> iterator3 = bookHashSet.iterator();
		
		while(iterator3.hasNext()) {
			System.out.println(iterator3.next().getPaperCnt());
		}
		
		System.out.println("");
	}

}
