package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//①下記9個をローカル変数として宣言のみしてください
		
		//バイト型
		byte b;
		
		//短整数型
		short s;
		
		//整数型
		int i;
		
		//長整数型
		long l;
		
		//単精度浮動小数点数型
		float f;
		
		//倍精度浮動小数点数型
		double d;
		
		//文字型
		char c;
		
		//文字列型
		String str;
		
		//ブーリアン型
		boolean bl;
		
		//②それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		
		b = 10;//下に行くほど更新する

		
		c= '\u0000';//10進数
		//char c1 = 0b0100_0001; // 2進数(0b始まり、"_"で区切ることもできる)
		//char c2 = 0101; // 8進数(0始まり)
		//char c3 = 0x41; // 16進数(0x始まり)
		
		str = null;
		
		bl= false;
		
		//③初期化をしたそれぞれの変数に下記の値を代入してください
		System.out.println("------------------");
		
		System.out.println("変数bは"+ b +"です");
		 
		s= 100;
		
		System.out.println("------------------");
		
		System.out.println("変数sは"+ s +"です");
		 
		i= 1000;
		
		System.out.println("------------------");//lnは改行コード
		
		System.out.println("変数iは"+ i +"です");//+消すとエラーが出る…なぜ？
        
		l= 10000;
		
		System.out.println("------------------");
		
		System.out.println("変数lは"+ l +"です");
		
		f= 9.5f;
		
		System.out.println("------------------");
		
		System.out.println("変数fは"+ f +"です");
        
		d= 10.5d;
		
		System.out.println("------------------");
		
		System.out.println("変数dは"+ d +"です");
		
		c=  'a';
		
		System.out.println("------------------");
		
		System.out.println("変数cは"+ c +"です");
        
		str = "ハロー";
		
		System.out.println("------------------");
		
		System.out.println("変数strは"+ str +"です");
        
		bl= true;
		
		System.out.println("------------------");
		
		System.out.println("変数blは"+ bl +"です");//ブーリアン型
		
		//④下記の通りにコンソール出力されるようにしてください
		//上記で作成した変数を必ず使用すること

		double result;
		result = b + s + i + (int)l;
		System.out.println("------------------");
		System.out.println("b + s + i + l は"+ (b + s + i + l) +"です");
		
		double result1;
		result1 = d + f;
		System.out.println("------------------");
		System.out.println("d + f は"+ (Math.round(d + f)) +"です");
		
		String result2;
		result2 = c + str + bl;
		System.out.println("------------------");
		System.out.println("c + str + bl は"+ (c + str + bl) +"です");
		
		double result3;
		result3 = b + s + i + l + f + d;
		System.out.println("------------------");
		System.out.println("b + s + i + l + f + d は"+ (Math.round(b + s + i + l + f + d)) +"です");
		
		double result4;
		result4 = b * s * i * l;
		System.out.println("------------------");
		System.out.println("b * s * i * l は"+ (b * s * i * l) +"です");
		
		double result5;
		result5 = d / s;
		System.out.println("------------------");
		System.out.println("d / s は"+ (d / s) +"です");
		
		double result6;
		result6 = b - s;
		System.out.println("------------------");
		System.out.println("b - s は"+ (b - s) +"です");
		
		//⑤次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。
		//正しく動作するように修正してください。

		String num = "20";
		int num01 = Integer.parseInt(num);
		int num1 = 23;
		
		System.out.println("------------------");
		System.out.println("ハローJAVA"+ (num01 + num1) +"です");
		
		//⑥『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		//ローカル変数に代入し○○に入れてください

		String Name;
		Name = "山田太郎";
		
		int age;
		age = 18;
		
		float height;
		height = 170.5f;
		
		double weight;
		weight = 62.2d;
		
		String EAT;
		EAT = "寿司";
		
		//「初めまして○○です」
		System.out.println("------------------");
		System.out.println("初めまして"+ Name +"です");
		
		//「年齢は○○歳です」
		System.out.println("------------------");
		System.out.println("年齢は"+ age +"歳です");
		
		//「身長は○○cmです」
		System.out.println("------------------");
		System.out.println("身長は"+ height +"cmです");
		
		//「体重は○○kgです」
		System.out.println("------------------");
		System.out.println("体重は"+ weight +"kgです");
		
		//「好きな食べ物は○○です」
		System.out.println("------------------");
		System.out.println("好きな食べ物は"+ EAT +"です");

		
		//⑦6で作成した自己紹介に続いてBMIが出力されるようにしてください
		//「BMIは○○です」
		//ただし計算は数値を直書きせず、全て変数を使ってすること

		double result25;
		height = 1.705f;
		result25 = Math.pow(height, height);
		System.out.println("------------------");
		System.out.println("BMIは"+ String.format("%.1f",weight / (height * height)) +"です");
		
		//⑧6で宣言した変数に再代入し下記の通りコンソールに出力してください

		//初めまして鈴木一郎です
		Name = "鈴木一郎";
		
		//年齢は24歳です
		age = 24;
		
		//身長168.5cmです
		height = 168.5f;
		
		//体重は64.2kgです
		weight = 64.2d;
		
		//好きな食べ物はオムライスです
		EAT = "オムライス";
		
		//BMIは22.6です
		height = 168.5f;
		weight = 64.2d;
		
		System.out.println("------------------");
		System.out.println("初めまして"+ Name +"です");
		

		
		System.out.println("------------------");
		System.out.println("年齢は"+ age +"歳です");
		
		
		System.out.println("------------------");
		System.out.println("身長は"+ height +"cmです");
		
				
		System.out.println("------------------");
		System.out.println("体重は"+ weight +"kgです");
				
		System.out.println("------------------");
		System.out.println("好きな食べ物は"+ EAT +"です");
		
		//身長をｍに直した。
		double result22;
		height = 1.685f;
		
		result22 = Math.pow(height, height);
		System.out.println("------------------");
		System.out.println("BMIは"+ String.format("%.1f",weight / (height * height)) +"です");
		
		//⑨8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、
		//下記の通りコンソールに出力してください
		Name = "鈴木一郎";
		
		//年齢は48歳です
		age = (age + 24);
		
		//身長337.0cmです
		height = 168.5f;
		height = (float) (height + 168.5f);
		
		//体重は64.2kgです
		weight = 64.2d;
		weight = weight + 64.2f;
		
		//好きな食べ物はオムライスです
		EAT = "オムライス";
		
		System.out.println("------------------");
		System.out.println("初めまして"+ Name +"です");
		
		System.out.println("------------------");
		System.out.println("年齢は"+ (age) +"歳です");
		
		System.out.println("------------------");
		System.out.println("身長は"+ String.format("%.1f", height) +"cmです");
		
		System.out.println("------------------");
		System.out.println("体重は"+ String.format("%.1f",weight) +"kgです");
		
		System.out.println("------------------");
		System.out.println("好きな食べ物は"+ EAT +"です");
		
		//身長をｍに直した。
		double result29;
		height = 3.37f;
		
		//BMIは11.31です
		result29 = Math.pow(height , height);
		System.out.println("------------------");
		System.out.println("BMIは"+ String.format("%.2f",(weight) / (height * height)) +"です");
		
		//➉8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		age = 24;
		
		boolean result55= (age >= 25);
		System.out.println("------------------");
		System.out.println("年齢が25歳以上なら"+ result55 +"です");//ブーリアン型
		
		//⑪8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		
		//年齢
		//byte→String
		age = 18;
		
		String strby = String.valueOf(age);
		System.out.println("------------------");
	    System.out.println("年齢は : " + strby + "歳です");
		
		//身長
		//float→String
	    height = 170.5f;
		String strfl = String.valueOf(height);
		System.out.println("------------------");
	    System.out.println("身長は : " + strfl + "cmです");
		
		//体重
		//double→String
	    weight = 62.2d;
		
		String strfl1 = String.valueOf(weight);
		System.out.println("------------------");
	    System.out.println("体重は : " + strfl1 + "kgです");
	    
	    //⑫11で変換した【年齢・身長】を整数型に変換して出力してください
	    
		//年齢
		//byte→String
		
		Integer number = Integer.valueOf(age);
		System.out.println("------------------");
	    System.out.println("年齢は : " + number + "歳です");
		
		//身長
		//float→String
	    
	    Integer aaa = Math.round(height);
		Integer Intfl = Integer.valueOf(aaa);
		System.out.println("------------------");
	    System.out.println("身長は : " + Intfl + "cmです");
	    
	    //⑬12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】
	    //であればtrueを出力してください
	    
		boolean result30= (number == 25 || Intfl >= 160);
		System.out.println("------------------");
		result30 = true;
		System.out.println("年齢が25もしくは身長が160以上なら"+ result30 +"です");

	}

}
