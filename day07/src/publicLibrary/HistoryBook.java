package publicLibrary;

public class HistoryBook extends Book{

	// 어느 나라에 대한 역사책인지?
	String countryName; // KOREA, JAPAN, UNITED_STATE...
	
	// 매개변수가 없는 default 생성자
	HistoryBook(){
		this.bookCover = new BookCover();
		this.paper = new Paper();
		//
		this.countryName = "KOREA";
		this.wholeBookPaperCnt = 300;
		this.bookName = "무제";
		this.authorName = "익명";
	}
	
	// 매개변수가 네개 있는 경우
	HistoryBook(BookCover bookCover, Paper paper, String bookName, String authorName) {
		
		this.bookCover = bookCover;
		this.paper = paper;
		
		//
		this.countryName = "KOREA";
		this.wholeBookPaperCnt = 300;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	
	// 매개변수가 다섯 개 있는 경우
	HistoryBook(BookCover bookCover , Paper paper , String country, String bookName,String authorName ) {
		
		this(bookCover, paper, bookName, authorName);
		
//		this.bookCover = bookCover;
//		this.paper = paper;
		//
		this.countryName = countryName;
//		this.wholeBookPaperCnt = 300;
//		this.bookName = bookName;
//		this.authorName = authorName;
	}
}
