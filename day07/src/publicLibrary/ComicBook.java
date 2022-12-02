package publicLibrary;

public class ComicBook extends Book{

	// 책의 표지가 그려져 있는가?
	Boolean bookCoverDrawOrNot;
	
	//매개변수가 없는 default 생성자
	ComicBook() {
		
		this.bookCover = new BookCover();
		this.paper =  new Paper();
		//
		this.bookCoverDrawOrNot = false;
		this.wholeBookPaperCnt = 300;
		this.bookName = "무제";
		this.authorName = "익명";
	}
	
	// 매개변수가 네개 있는 경우
	ComicBook(BookCover bookCover , Paper paper, String bookName, String authorName){
		this.bookCover = bookCover;
		this.paper = paper;
		
		//
		this.bookCoverDrawOrNot = false;
		this.wholeBookPaperCnt = 300;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	
	//매개변수가 다섯개 있는 경우
	ComicBook(BookCover bookCover, Paper paper, Boolean bookCoverDrawOrNot, String bookName, String authorName){
		
		this(bookCover, paper, bookName,authorName);
//		this.bookCover = bookCover;
//		this.paper = paper;
		//
		this.bookCoverDrawOrNot = bookCoverDrawOrNot;
//		this.wholeBookPaperCnt = 300;
//		this.bookName = bookName;
//		this.authorName = authorName;
	}
}
