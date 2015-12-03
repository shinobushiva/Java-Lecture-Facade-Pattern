package patterned;

public class CustomerTest {
	public static void main(String[] args) {

		Librarian<String> librarian = new CommentLibrarian();

		// 中村くんに昆虫図鑑の場所を聞く
		String bookName = "どんと来い、超常現象";
		System.out.println(bookName + " は" + librarian.searchBook(bookName));
		bookName = "どんと来い、超常現象２";
		System.out.println(bookName + " は" + librarian.searchBook(bookName));
		bookName = "TRICK";
		System.out.println(bookName + " は" + librarian.searchBook(bookName));
	}
}
