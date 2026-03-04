package kadai_015;

public class Car_Chapter15 {
		
		// フィールド
		private int gear = 1 ;
		private int speed = 10 ;
		private int beforeGear = 1;
			
		//ギアの値により速度を変えるメソッド
		public void changeGear( int afterGear) {
			beforeGear = gear;
			gear = afterGear;

		//ギアに応じた速度設定
		switch (gear) {
			case 1:
				speed = 10;
				break;
			case 2:
				speed = 20;
				break;
			case 3:
				speed = 30;
				break;
			case 4:
				speed = 40;
				break;
			case 5:
				speed = 50;
				break;
			default:
				speed = 10;
		}
	}
		//ギアチェンジ後の速度を表示するメソッド
		public void run() {
			System.out.println("ギアは" + beforeGear + "から" + gear + "に切り替えました");
			System.out.println("速度は時速"+ speed +"kmです");
		}
		
}
