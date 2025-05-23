package zikkou;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import karikyuramu_osabe.syori;

public class zikkou {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		syori country = new syori();
		String str = country.hallo;
		System.out.println("こんにちは！ここは" + str +"です！");
		
		//インスタンスメソッド
		country.syori1();// メソッドを呼び出して値をセット
		String susi = country.eat;
		
		System.out.println("この" + susi +"はうまい");
		
		country.syori2();
		String JapaneseFood = country.eat1;
		
		System.out.println(susi +"は" + JapaneseFood +"です");
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:s");
		String formattedDateTime = now.format(formatter);
		
		System.out.println("今の現在日時は" + formattedDateTime +"です");
		
		
	}
}
