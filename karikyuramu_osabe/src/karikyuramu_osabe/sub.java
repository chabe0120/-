package karikyuramu_osabe;

public class sub {
	private String status;//アクセス権を制限する
	private int hp;
	private int mp;
	private int str;
	private int dex;
	private int dp;
	
	public  void setStatus(String status){
		this.status = status;
	}
	
	public  void setHp(int hp){
		this.hp = hp;
	}
	
	public  void setMp(int mp){
		this.mp = mp;
	}
	
	public void setStr(int str){
		this.str = str;
	}
	
	public  void setDex(int dex){
		this.dex = dex;
	}
	
	public  void setDp(int dp){
		this.dp = dp;
	}
	
	public  String getStatus(){
		return status;
	}
	
	public int getHp(){
		return hp;
	}
	
	public int getMp() {
		return mp;
	}
	
	public int getStr() {
		return str;
	}
	
	public int getDex() {
		return dex;
	}
	
	public int getDp() {
		return dp;
	}
	
	public void showStatus() {
		
		System.out.println();
		System.out.println(status);
		
		System.out.println("HP:"+ hp);
		
		System.out.println("MP:"+ mp);
		
		System.out.println("攻撃力:"+ str);
		
		System.out.println("素早さ:"+ dex);
		
		System.out.println("防御力:"+ dp);
	}
	 //名前を入力したら下記がコンソールに出力されるように作ってください
		//条件：数値は毎回変わるように作ってください
		 	 //サブクラスを使用してください
			 //スーパークラスを使用してください
			 //getterとsetterを使用してください
			 //packageを2つ作ってメインと処理を分けてください
			// 命名する場合は規則にのっとってください
			// コンストラクタを使用してください

		//こんにちは 「 名前 」 さん
		//ステータス
		//HP：849
		//MP：862
		//攻撃力：375
		//素早さ：937
		//防御力：24

		//さあ冒険に出かけよう！
}
