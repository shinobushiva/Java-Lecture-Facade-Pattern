package lesson;

import patterned.Librarian;
import common.BookList;
import common.LendingList;

@SuppressWarnings("unused")
public class EnumLibrarian implements Librarian<BookStatus> {

	private BookList bookList;
	private LendingList lendingList;

	public EnumLibrarian() {

		bookList = new BookList();
		lendingList = new LendingList();

	}

	/**
	 * [課題] 本の状況に応じて適切なEnum値(BookStatusをみること）を返すように実装せよ
	 * 
	 * @param bookName
	 * @return
	 */
	public BookStatus searchBook(String bookName) {
		return BookStatus.NOT_STORED; // 仮にすべて所蔵しないとしている
	}
}
