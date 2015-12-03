package nopattern;

import common.BookList;
import common.LendingList;

//山田くん
public class CustomerTest {
	public static void main(String[] args) {
		// 本の名前とIDの対応リスト
		BookList bookList = new BookList();
		// 本のIDと貸し出し状況の対応リスト
		LendingList lendingList = new LendingList();

		String bookName = "どんと来い、超常現象";
		String bookId = bookList.searchBook(bookName);
		if (bookId == null) {
			System.out.println(bookName + " は所蔵されていません");
		} else {
			boolean check = lendingList.check(bookId);
			if (check) {
				System.out.println(bookName + " は貸出中です");
			} else {
				System.out.println(bookName + " は借りることができます");
			}
		}

		bookName = "どんと来い、超常現象２";
		bookId = bookList.searchBook(bookName);
		if (bookId == null) {
			System.out.println(bookName + " は所蔵されていません");
		} else {
			boolean check = lendingList.check(bookId);
			if (check) {
				System.out.println(bookName + " は貸出中です");
			} else {
				System.out.println(bookName + " は借りることができます");
			}
		}

	}
}
