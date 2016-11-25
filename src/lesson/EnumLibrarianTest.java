package lesson;

import patterned.CommentLibrarian;
import patterned.Librarian;

public class EnumLibrarianTest {

	public static void main(String[] args) {

		Librarian<String> librarian = new CommentLibrarian();

		String bookName = "どんと来い、超常現象";
		System.out.println(bookName + " は" + librarian.searchBook(bookName));
		bookName = "どんと来い、超常現象２";
		System.out.println(bookName + " は" + librarian.searchBook(bookName));
		bookName = "TRICK";
		System.out.println(bookName + " は" + librarian.searchBook(bookName));

	}

}
