package kadai_021;

public class DictionaryExec_Chapter21 {
	
	public static void main(String[] args) {
		
		//インスタンス化
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		//調べる単語をセット
				String[] fruitArray ={"apple","banana", "grape", "orange"};
				
				dictionary.checkWords(fruitArray);
	}
}