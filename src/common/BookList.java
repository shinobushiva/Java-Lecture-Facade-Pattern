package common;

import java.util.HashMap;
import java.util.Map;

//所蔵本リスト
public class BookList {

	private Map<String, String> checkMap = new HashMap<String, String>();

	public BookList() {

		// ダミーデータの設定
		checkMap.put("どんと来い、超常現象", "A-3");
		checkMap.put("どんと来い、超常現象２", "A-5");
		checkMap.put("なぜベストを尽くさないのか", "C-2");
		checkMap.put("人生の勝利者たち", "B-4");
	}

	public String searchBook(String bookName) {
		String location = null;
		if (checkMap.containsKey(bookName)) {
			location = checkMap.get(bookName);
		}
		return location;
	}
}
