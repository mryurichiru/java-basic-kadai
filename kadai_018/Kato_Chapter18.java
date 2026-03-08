package kadai_018;

public abstract class Kato_Chapter18 {
	
	//フィールド
	public String familyName = "加藤";	//姓

	public String givenName;	//名
	
	public String address = "東京都中野区〇×";	//住所

	//共通の紹介を出力
	public void	commonIntroduce() {
	System.out.println("名前は" + this.familyName + this.givenName + "です");
	System.out.println("住所は" + this.address + "です");
	}
	
	//個別の紹介を出力(抽象メソッド)
	public abstract void eachIntroduce();
	
	//紹介を実行
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
