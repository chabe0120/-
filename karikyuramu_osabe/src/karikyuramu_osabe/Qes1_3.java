package karikyuramu_osabe;

import java.util.Random;
import java.util.Scanner;//読み込み（インポート）しないと使えない

public class Qes1_3 {

	

	public static void main(String[] args) {
		//ログイン時の入力チェックシステムを下記条件で作成してください

		//コンソールにユーザー名を入力できるようにしてください
		Scanner scan = new Scanner(System.in);

		boolean validated;
		validated = false;
		String name = "";
		
		while (!validated) {
			name = scan.nextLine();//中に入れないと繰り返し入力ができない

			if (name.length() >= 10) {
				//ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
				System.out.println("「名前を10文字以内にしてください」");
				continue;

			} else if (name.length() == 0) {
				//ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
				System.out.println("「名前を入力してください」");
				continue;
			} else if (!name.matches("^[a-zA-Z0-9]+$")) {

				//ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
				System.out.println("「半角英数字のみで名前を入力してください」");
				continue;
			} else {
				//ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
				System.out.println("ユーザー名「" + name + "」を登録しました");
				validated = true; // ループ終了
			}
			break;
		}

		//じゃんけんのシステムを下記の条件で作成してください
		String[] Hands = { "グー", "チョキ", "パー" };
		int count = 0;
		int NameHands = 0;//中に入れないと繰り返し入力ができない
		Random rand = new Random();

		while (validated) {
			NameHands = scan.nextInt();//中に入れないと繰り返し入力ができない
			count++;
			
			//相手の手
			int EnemyHands = rand.nextInt(3);
			//あいこの時
			if (NameHands == EnemyHands) {
				System.out.println("ユーザー名「"+ name +"」の手は" + Hands[NameHands]);
				System.out.println("相手の手は"+ Hands[EnemyHands]);
				System.out.println("DRAW あいこ もう一回しましょう！");
				continue;
			}
			//nameがじゃんけんでパーに負けた場合
			else if((NameHands == 0 && EnemyHands == 2)){
				System.out.println("ユーザー名「"+ name +"」の手は"+ Hands[NameHands]);
				System.out.println("相手の手は"+ Hands[EnemyHands]);
				System.out.println("やるやん。");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
				continue;
			}
			//nameがじゃんけんでグーに負けた場合
			else if((NameHands== 1 && EnemyHands == 0)){
				System.out.println("ユーザー名「"+ name +"」の手は"+ Hands[NameHands]);
				System.out.println("相手の手は"+ Hands[EnemyHands]);
				System.out.println("やるやん。");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
				continue;
			} 
			//nameがじゃんけんでチョキに負けた場合
			else if((NameHands == 2 && EnemyHands == 1)) {
				System.out.println("ユーザー名「"+ name +"の手は"+ Hands[NameHands]);
				System.out.println("相手の手は"+ Hands[EnemyHands]);
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
				continue;
			}
			//nameが勝ったとき
			else if((NameHands == 0 && EnemyHands == 1) || (NameHands== 1 && EnemyHands == 2) || (NameHands == 2 && EnemyHands == 0)){
			System.out.println("ユーザー名「"+ name +"」の手は"+ Hands[NameHands]);
			System.out.println("相手の手は"+ Hands[EnemyHands]);
			System.out.println("やるやん。");
			System.out.println("次は俺にリベンジさせて");
			}
			//0～2以外の入力の時
			if((NameHands < 0) || (NameHands > 2) ) {
				System.out.println("無効な入力です。0, 1, 2のいずれかを入力してください。");
				continue;
			}
			System.out.println("勝つまでにかかった合計回数は"+ count +"回です");
			break;
		}
		System.out.println();
		
		scan.close();//最後に書くwhile分の中に書入れない
	}
}