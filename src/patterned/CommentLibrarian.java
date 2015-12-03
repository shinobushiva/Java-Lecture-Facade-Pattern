package patterned;

import common.BookList;
import common.LendingList;

public class CommentLibrarian implements Librarian<String> {

	private BookList bookList;
	private LendingList lendingList;

	public CommentLibrarian() {

		bookList = new BookList();
		lendingList = new LendingList();

	}

	@Override
	public String searchBook(String bookName) {
		// 本を探す
		String bookId = bookList.searchBook(bookName);
		// 本の場所がnullではない(所蔵してる)とき
		if (bookId != null) {
			// 貸出中かチェックする
			if (lendingList.check(bookId)) {
				// 貸出中のとき
				return "貸出中です";
			} else {
				// 貸出中ではないとき
				return "借りることができます";
			}
			// 所蔵してないとき
		} else {
			return "所蔵されていません";
		}
	}
}
