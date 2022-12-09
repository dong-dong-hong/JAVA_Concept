package arrayListExample4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> integerArrayList = new ArrayList<>();
		integerArrayList.add(1);
		integerArrayList.add(2);
		integerArrayList.add(3);
		
		System.out.println(integerArrayList);
		
		integerArrayList.set(2, 808);
		
		System.out.println("수정결과: " + integerArrayList);
		
		integerArrayList.remove(1);
		
		System.out.println("삭제결과: " + integerArrayList);
		
		ArrayList<String> stringArrayList = new ArrayList<>();
		stringArrayList.add("소미");
		stringArrayList.add("세미");
		stringArrayList.add("수미");
		
		System.out.println(stringArrayList);
		
		stringArrayList.set(1, "귀염세미");
		
		System.out.println("수정결과: " + stringArrayList);
		
		stringArrayList.remove("수미");
		
		System.out.println("삭제결과: " + stringArrayList);
		
		System.out.println();
		System.out.println();
		
		Book book = new Book();
		book.setPaperCnt(808);
		Book book2 = new Book();
		book2.setPaperCnt(809);
		Book book3 = new Book();
		book3.setPaperCnt(810);

		ArrayList<Book> bookArrayList = new ArrayList<Book>();
		bookArrayList.add(book);
		bookArrayList.add(book2);
		bookArrayList.add(book3);

		System.out.println(bookArrayList);
	
		
		Chur chur = new Chur();
		chur.setTubeType(TubeType.RECTANGLE);
		chur.setColorType(ColorType.BLUE);
		
		Chur chur2 = new Chur();
		chur2.setTubeType(TubeType.RECTANGLE);
		chur2.setColorType(ColorType.RED);
		
		Chur chur3 = new Chur();
		chur3.setTubeType(TubeType.SQUARE);
		chur3.setColorType(ColorType.YELLOW);
		
		ArrayList<Chur> churList = new ArrayList<Chur>();
		churList.add(chur);
		churList.add(chur2);
		churList.add(chur3);
		
		System.out.println(churList);
	}

}
