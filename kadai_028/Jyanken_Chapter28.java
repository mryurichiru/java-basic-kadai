package kadai_028;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    // 自分のじゃんけんの手を入力する
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");
            
            input = scanner.nextLine();

            if (input.equals("r") || input.equals("s") || input.equals("p")) {
                break;
            } else {
                System.out.println("無効な入力です。もう一度入力してください。");
            }
        }

        return input;
    }

    // 対戦相手の手をランダムで選ぶ
    public String getRandom() {
        String[] choices = {"r", "s", "p"};
        Random random = new Random();

        int index = random.nextInt(3); // 0〜2
        return choices[index];
    }

    // じゃんけんを行う
    public void playGame() {
        String myChoice = getMyChoice();
        String opponentChoice = getRandom();

        // 手の表示用
        HashMap<String, String> map = new HashMap<>();
        map.put("r", "グー");
        map.put("s", "チョキ");
        map.put("p", "パー");

        System.out.println("自分の手は" + map.get(myChoice) + ",対戦相手の手は" + map.get(opponentChoice));

        // 勝敗判定
        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if (
            (myChoice.equals("r") && opponentChoice.equals("s")) ||
            (myChoice.equals("s") && opponentChoice.equals("p")) ||
            (myChoice.equals("p") && opponentChoice.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}