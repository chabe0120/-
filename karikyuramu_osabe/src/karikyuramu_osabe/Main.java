package karikyuramu_osabe;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean validated;
		validated = false;
		String name = "";
		
		Character character = new Character();
		
		while (!validated) {
			name = scan.nextLine();//中に入れないと繰り返し入力ができない

			if (name.length() >= 10) {
				System.out.println("「名前を10文字以内にしてください」");
				continue;

			} else if (name.length() == 0) {
				System.out.println("「名前を入力してください」");
				continue;
				
			} else if (!name.matches("^[a-zA-Z0-9]+$")) {
				System.out.println("「半角英数字のみで名前を入力してください」");
				continue;
				
			} else {
				System.out.println("こんにちは「"+ name + "」さん");
				validated = true; // ループ終了
			}
			break;
		}
		
		character.randomStatus();
		
		sub rpg = new sub();
	
		character.showStatus();
	
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");
	
	}
}
