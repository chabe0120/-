package karikyuramu_osabe;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
		 Scanner scanner = new Scanner(System.in);
		String[] Shouhin = scanner.nextLine().split("，");
		Random rand = new Random();
		
		for(String str: Shouhin) {
			int number = rand.nextInt(12);
			 switch (str) {
			 case "パソコン":
				 System.out.println("パソコンの残り台数は"+ number +"台です");
				 break;
				 
			 case "冷蔵庫":
				 System.out.println("冷蔵庫の残り台数は"+ number +"台です");
				 break;
				 
			 case "扇風機":
				 System.out.println("扇風機の残り台数は"+ number +"台です");
				 break;
				 
			 case "洗濯機":
				 System.out.println("洗濯機の残り台数は"+ number +"台です");
				 break;
				 
			 case "加湿器":
				 System.out.println("加湿器の残り台数は"+ number +"台です");
				 break;
				 
			 case "テレビ": 
			 case "ディスプレイ":
				 //.equalsはDtring型の比較
				 String result = str.equals("テレビ") ? "テレビの残り台数は"+ number +"台です" : "ディスプレイの残り台数は"+ (11 - number) +"台です";
				 System.out.println(result);
				 continue;
				 //break;
				 
			 default:
				 System.out.println("『"+ str + "』は指定の商品ではありません");
				 break;
			 }
		}
		System.out.println();
	}

}
