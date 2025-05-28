package karikyuramu_osabe;

public class rion {
	private String animal;
	private double height;
	private double speed;
	
	//コンストラクタ
	public  rion(){//メソッド
		this.animal = "ライオン";
	}
	//セッター
	public  void setheight(double height){
		this.height = height;
	}
	
	public  void setspeed(double speed){
		this.speed = speed;
	}
	
	//ゲッター
	public String getAnimal() {
		return this.animal;
	}
	
	public double getheight() {
		return this.height;
	}
	
	public double getspeed() {
		return this.speed;
	}
	
	public static void main(String[] args) {
		rion lion = new rion(); // インスタンス生成
		lion.setheight(2.1);    // 体長設定
		lion.setspeed(80);     // 速度設定

		// 出力
		System.out.println("動物名：" + lion.getAnimal());
		System.out.println("体長：" + lion.getheight() + "m");
		System.out.println("速度：" + lion.getspeed() + "km/h");
		
		
		
		
	  	//動物名：ライオン
		//体長：2.1m
		//速度：80km/h
	}

}
