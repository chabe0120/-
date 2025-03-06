package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//下記9個をローカル変数として宣言のみしてください
		
		//バイト型
		byte b; 
		b = 0;//初期値になる
		b = 10;//下に行くほど更新する
		
		System.out.println("------------------");
		
		System.out.println("変数bは"+ b +"です");
		 
		//短整数型
		short s;
		s= 0;
		s= 100;
		
		System.out.println("------------------");
		
		System.out.println("変数sは"+ s +"です");
		 
		//整数型
		int i;
		i= 0;
		i= 1000;
		
		System.out.println("------------------");//lnは改行コード
		
		System.out.println("変数iは"+ i +"です");//+消すとエラーが出る…なぜ？
        
		//長整数型
		long l;
		l= 0;
		l= 10000;
		
		System.out.println("------------------");
		
		System.out.println("変数lは"+ l +"です");
		
		//単精度浮動小数点数型
		float f;
		f= 0.0f;
		f= 9.5f;
		
		System.out.println("------------------");
		
		System.out.println("変数fは"+ f +"です");
        
		//倍精度浮動小数点数型
		double d;
		d= 0.0d;
		d= 10.5d;
		
		System.out.println("------------------");
		
		System.out.println("変数dは"+ d +"です");
		
		//文字型
		char c;
		c= '\u0000';//10進数
		c=  'a';
		
		//char c1 = 0b0100_0001; // 2進数(0b始まり、"_"で区切ることもできる)
		//char c2 = 0101; // 8進数(0始まり)
		//char c3 = 0x41; // 16進数(0x始まり)
		
		System.out.println("------------------");
		
		System.out.println("変数cは"+ c +"です");
        
		//文字列型
		String str;
		str = null;
		str = "ハロー";
		
		System.out.println("------------------");
		
		System.out.println("変数strは"+ str +"です");
        
		//ブーリアン型
		boolean bl;
		bl= false;
		bl= true;
		
		System.out.println("------------------");
		
		System.out.println("変数blは"+ bl +"です");//ブーリアン型
		
		long result;
		result = 0;
		result = b + s + i + (int)l;
		System.out.println("------------------");
		System.out.println("b + s + i + l は"+ (b + s + i + l) +"です");
		
		double result1;
		result1 = 0;
		result1 = d + f;
		System.out.println("------------------");
		System.out.println("d + f は"+ (Math.round(d + f)) +"です");
		
		String result2;
		result2 = null;
		result2 = c + str + bl;
		System.out.println("------------------");
		System.out.println("c + str + bl は"+ (c + str + bl) +"です");
		
		double result3;
		result3 = 0;
		result3 = b + s + i + l + f + d;
		System.out.println("------------------");
		System.out.println("b + s + i + l + f + d は"+ (Math.round(b + s + i + l + f + d)) +"です");
		
		double result4;
		result4 = 0;
		result4 = b * s * i * l;
		System.out.println("------------------");
		System.out.println("b * s * i * l は"+ (b * s * i * l) +"です");
		
		double result5;
		result5 = 0;
		result5 = d / s;
		System.out.println("------------------");
		System.out.println("d / s は"+ (d / s) +"です");
		
		double result6;
		result6 = 0;
		result6 = b - s;
		System.out.println("------------------");
		System.out.println("b - s は"+ (b - s) +"です");
		
		//「ハローJAVA2023」を「ハローJAVA43」と表示させる
		String num = "20";
		int num01 = Integer.parseInt(num);
		int num1 = 23;
		
		System.out.println("------------------");
		System.out.println("ハローJAVA"+ (num01 + num1) +"です");
		
		//『山田太郎 18歳 170.5cm 62.2kg 寿司』
		String Str;
		Str = null;
		Str = "山田太郎";
		
		byte by;
		by = 0;
		by = 18;
		
		float fl;
		fl = 0.0f;
		fl = 170.5f;
		
		double fl1;
		fl1 = 0.0d;
		fl1 = 62.2d;
		
		String STR;
		STR = null;
		STR = "寿司";
		
		//「初めまして○○です」
		System.out.println("------------------");
		System.out.println("初めまして"+ Str +"です");
		
		//「年齢は○○歳です」
		System.out.println("------------------");
		System.out.println("年齢は"+ by +"歳です");
		
		//「身長は○○cmです」
		System.out.println("------------------");
		System.out.println("身長は"+ fl +"cmです");
		
		//「体重は○○kgです」
		System.out.println("------------------");
		System.out.println("体重は"+ fl1 +"kgです");
		
		//「好きな食べ物は○○です」
		System.out.println("------------------");
		System.out.println("好きな食べ物は"+ STR +"です");

		
		//BMIを代入
		double result25;
		fl = 1.705f;
		result25 = Math.pow(fl, fl);
		System.out.println("------------------");
		System.out.println("BMIは"+ String.format("%.1f",fl1 / (fl * fl)) +"です");
		
		//再代入する
		//初めまして鈴木一郎です
		Str = "鈴木一郎";
		
		//年齢は24歳です
		by = 24;
		
		//身長168.5cmです
		fl = 168.5f;
		
		//体重は64.2kgです
		fl1 = 64.2d;
		
		//好きな食べ物はオムライスです
		STR = "オムライス";
		
		//BMIは22.6です
		fl = 168.5f;
		fl1 = 64.2d;
		
		System.out.println("------------------");
		System.out.println("初めまして"+ Str +"です");
		

		
		System.out.println("------------------");
		System.out.println("年齢は"+ by +"歳です");
		
		
		System.out.println("------------------");
		System.out.println("身長は"+ fl +"cmです");
		
				
		System.out.println("------------------");
		System.out.println("体重は"+ fl1 +"kgです");
				
		System.out.println("------------------");
		System.out.println("好きな食べ物は"+ STR +"です");
		
		//身長をｍに直した。
		double result22;
		fl = 1.685f;
		
		result22 = Math.pow(fl, fl);
		System.out.println("------------------");
		System.out.println("BMIは"+ String.format("%.1f",fl1 / (fl * fl)) +"です");
		
		//年齢・身長・体重】の数値を和算で自己代入
		Str = "鈴木一郎";
		
		//年齢は48歳です
		by = 24;
		
		//身長337.0cmです
		fl = 168.5f;
		
		//体重は64.2kgです
		fl1 = 64.2d;
		
		//好きな食べ物はオムライスです
		STR = "オムライス";
		
		System.out.println("------------------");
		System.out.println("初めまして"+ Str +"です");
		
		System.out.println("------------------");
		System.out.println("年齢は"+ (by + by) +"歳です");
		
		System.out.println("------------------");
		System.out.println("身長は"+ String.format("%.1f", fl + fl) +"cmです");
		
		System.out.println("------------------");
		System.out.println("体重は"+ String.format("%.1f",fl1 + fl1) +"kgです");
		
		System.out.println("------------------");
		System.out.println("好きな食べ物は"+ STR +"です");
		
		//身長をｍに直した。
		double result29;
		fl = 3.37f;
		
		result29 = Math.pow(fl , fl);
		System.out.println("------------------");
		System.out.println("BMIは"+ String.format("%.2f",(fl1 + fl1) / (fl * fl)) +"です");
		
		//年齢が25歳以上ならtrue
		by = 24;
		
		System.out.println("------------------");
		
		System.out.println("変数blは"+ bl +"です");//ブーリアン型
		
		
		
		
		
		
		
		
	}

}
