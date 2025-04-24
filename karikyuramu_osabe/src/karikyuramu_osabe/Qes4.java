package karikyuramu_osabe;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//for文を使って出力①
		for (int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				int m = i * j;
				if (j == 9) {
					System.out.print(String.format(" %02d * %02d = %02d", i, j, m));
				} else {
					System.out.print(String.format(" %02d * %02d = %02d ||", i, j, m));
				}
			}
			System.out.println();//段が変わるたびに改行する
		}
	}

}
