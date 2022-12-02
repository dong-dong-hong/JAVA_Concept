package publicLibrary;

public class BookShelf {

	public Book[] bookList;
	public String color = "BLUE";// BLUE,RED,WHITE,BLACK
	
	BookShelf(){
		bookList = new Book[10];
		
		System.out.println("책의 개수가 기본 개수인 10개로 지정되었습니다.");
		System.out.println("매개변수로 책의 갯수가 넘어오지 않았습니다.");
	}
	
	BookShelf(Integer bookCnt) {
		bookList = new Book[bookCnt];
		color = "BLUE";
	}
	
	BookShelf(Integer bookCnt , String color) {
		bookList = new Book[bookCnt];
		this.color = color;
	}
	
	public void addBox(Integer bookIndex, Book book) {
		bookList[bookIndex] = book;
	}
	
	public void printBook(Book book) {
		System.out.println("* ");
		System.out.println(book.bookName + " 만화책 정보");
		System.out.println("책 표지 색상 : " + book.bookCover.color);
		System.out.println("종이 타입 : " + book.paper.type);
		System.out.println("작가 이름 : " + book.authorName);
		System.out.println("");	
	}
	
	public void  printAllBook() {
		System.out.println();
		System.out.println("==============책장 조회=================");
		System.out.println();
		for(int i=0; i<bookList.length; i++) {
			System.out.println(i + "번째 책 제목: " + bookList[i].bookName);
		}
		System.out.println();
		System.out.println("=====================================");
		System.out.println();
	}
} 
