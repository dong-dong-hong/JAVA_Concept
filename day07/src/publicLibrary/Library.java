package publicLibrary;

public class Library {
	
	public static BookShelf comicBookShelf;
	
	public static BookShelf historyBookShelf;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 만화책 관련 로직 시작
		BookCover comicBookCover = new BookCover();
		comicBookCover.color = "BLACK";
		comicBookCover.type = "PLASTIC";
		
		Paper comicPaper = new Paper();
		comicPaper.type = "THIN";
		
		// 2. 드래곤볼 만화책 만들기
		ComicBook dragunBall = new ComicBook(comicBookCover, comicPaper,"드래군볼","개발자1");
		
		// 3. 책장 만들기, 크기는 넉넉하게(...) 두개....
		comicBookShelf = new BookShelf(2, "BLACK");
		
		// 4. 책장에 드래군볼 만화책 꽃아넣기
		comicBookShelf.addBox(0, dragunBall);
		
		// 5.특정 만화책(드래군볼) 책정보 출력하기
		comicBookShelf.printBook(dragunBall);
		
		// 6. 투피스 만화책 만들기
		comicBookCover.color = "BLUE";
		
		ComicBook twopiece = new ComicBook(comicBookCover, comicPaper, true, "투피스", "개발자2");
		
		// 7.책장에 투피스 만화책 꽃아넣기
		comicBookShelf.addBox(1, twopiece);
		
		//8.특정 만화책(투피스)책정보 출력하기
		comicBookShelf.printBook(twopiece);
		
		//9. 모든 책 정보 출력하기
		comicBookShelf.printAllBook();
		
		//////////////////////////////////////////////////
		
		// 1. 역새책 관련 로직 시작
		BookCover historyBookCover = new BookCover();
		historyBookCover.color = "WHITE";
		historyBookCover.type = "LEATHER";
		
		Paper historyPaper = new Paper();
		historyPaper.type = "THICK";
		
		// 2. 한국의 역사책 만들기
		HistoryBook koreaHistoryBook = new HistoryBook(historyBookCover , historyPaper,"KOREA" , "한국의 역사", "개발자1");
		
		
		// 3. 책장 제작
		historyBookShelf = new BookShelf(2);
		
		// 4. 책장에 한국의 역사책 꽃아넣기
		historyBookShelf.addBox(0, koreaHistoryBook);
		
		// 5. 특정 역사책(한국의 역사책) 책정보 출력하기
		historyBookShelf.printBook(koreaHistoryBook);
		
		//////////////////////////////////////
		
		
		// 6. 일본의 역사책 만들기
		
		historyBookCover.color = "BLACK";
		
		HistoryBook japanHistoryBook = new HistoryBook(historyBookCover, historyPaper,"JAPAN" , "일본의 역사", "개발자2");
		
		
		// 7. 책장에 일본의 역사책 꽃아넣기
		historyBookShelf.addBox(1, japanHistoryBook);
		
		// 8. 일본의 역사 책정보 출력하기
		historyBookShelf.printBook(japanHistoryBook);
		
		// 9. 모든 책 정보 출력하기
		historyBookShelf.printAllBook();
	}

}
