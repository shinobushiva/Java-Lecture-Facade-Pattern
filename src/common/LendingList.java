package common;

import java.util.HashMap;
import java.util.Map;

//貸出帳
public class LendingList {

	private Map<String, Boolean> checkMap = new HashMap<String, Boolean>();

	public LendingList() {
		// ダミーデータの設定
		checkMap.put("A-3", false);
		checkMap.put("A-5", true);
		checkMap.put("C-2", true);
		checkMap.put("B-4", false);
	}

	public boolean check(String bookId) {

		// 所蔵されてない場合はfalse
		if (!checkMap.containsKey(bookId)) {
			return false;
		}
		// 貸出帳をチェックする
		// 貸出中ならtrue、そうでなければfalseを返す
		return checkMap.get(bookId);
	}

}