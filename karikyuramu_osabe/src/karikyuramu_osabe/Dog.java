package karikyuramu_osabe;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	String name;//フィールド
    
	// Q2：フィールドに動物の数の変数を定義してください。
	int animal;
	
	public  Dog(){//メソッド
		// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
		this.name = "犬";
	}
	
	public  Dog(int a){
		// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
		this.animal = a;
	}
}
