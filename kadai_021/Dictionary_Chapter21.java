package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
		//単語リスト
		private HashMap<String, String> dictionary; // = new HashMap<>();
		
		public Dictionary_Chapter21() {
			dictionary = new HashMap<>();
			addWords();
		}
		
		//辞書に単語を追加する
		public void addWords() {
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウイ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
	}
		
	//単語リストを調べる
		public void checkWords(String[] words) {
			for (String word : words) {
				//単語がある場合
				if (dictionary.containsKey(word)) {
					System.out.println(word +"の意味は" + dictionary.get(word));
				//単語がない場合
				} else {
					System.out.println(word + "は辞書に存在しません");
				}
			}	
	}
}
