package karikyuramu_osabe;

import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner score = new Scanner(System.in);
		boolean validated = false;
		int students = 0 ;
		
		while (!validated) {
			System.out.print("生徒の人数を入力してください（2人以上）:");
			students = score.nextInt();//nextLine
			//students = score.nextInt();
			
			if(students <= 1) {
				System.out.println("生徒の人数を2人以上にしてください");
				System.out.println();
		        continue;
		        }
			validated = true; // ループ終了 breakはあまり使わないで
        }
		String[] subjects = { "英語", "数学", "理科", "社会" };
		int[][] foo = new int[students][subjects.length];//配列宣言
		
		for (int i = 0; i < students; i++) {
			for (int j = 0; j < subjects.length; j++) {
				
				System.out.print((i + 1) +"人目の『"+ subjects[j] +"』の点数を入力してください:");
				foo[i][j] = score.nextInt();
			}
			System.out.println();
		}
		
		for (int i = 0; i < students; i++) {
			double Average = 0;
			
			for (int j = 0; j < subjects.length; j++) {
				Average += (foo[i][j]);
			}
			//生徒ごとの平均点
			System.out.printf((i + 1) +"人目の平均点は%.2f点です。\n", Average / subjects.length);
			
			System.out.println();
		}
		double[] totalAverage = new double[subjects.length];//配列宣言
		
		for (int i = 0; i < subjects.length; i++) {
			totalAverage[i] = 0;
			
			for (int j = 0; j < students; j++) {
				totalAverage[i] += (foo[j][i]);
			}
			//それぞれの科目の平均点
			totalAverage[i] = totalAverage[i]/ students;
			
			System.out.printf(subjects[i] +"の平均点は%.2f点です。\n",  totalAverage[i]);
		}
		System.out.println();
		
		double m = 0;
		
		for (int i = 0; i < subjects.length; i++) {
			m += totalAverage[i];
		}
		System.out.printf("全体の平均点は%.2f点です。\n",  m / subjects.length);
	}

}
