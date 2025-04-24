package karikyuramu_osabe;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//for文を使って出力②
		for (int i = 1; i <= 20; i++) {
			for(int j = 1; j <= 20; j++) {
				int m = i * j;
				if (j == 20) {
					System.out.print(String.format(" %03d * %03d = %03d", j, i, m));
				} else {
					System.out.print(String.format(" %03d * %03d = %03d ||", j, i, m));
				}
			}
			System.out.println();//段が変わるたびに改行する
		}
		System.out.println();
	}

}
