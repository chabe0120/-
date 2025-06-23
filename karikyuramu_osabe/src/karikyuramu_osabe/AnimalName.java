package karikyuramu_osabe;

public class AnimalName {
	
	public void animaldata(String[] animalarray) {
		for(int i = 0; i < animalarray.length; i++) {
			String[] Animals = animalarray[i].split(":");
			
			System.out.println("動物名："+ Animals[0]);
			System.out.println("体長："+ Animals[1] +"m");
			System.out.println("速度："+ Animals[2] +"km/h");
			System.out.println("学名："+ this.getScientificName(Animals[0]) +"\n");
		}
	}
	
	public  String getScientificName(String animalName){
		// 動物を格納する変数を初期化
		String scientificName = null;
		
		// animalName : コンソールで入力された値
		switch (animalName) {
		case "ライオン":
			scientificName = "パンテラ レオ";
			break;
	
		case "ゾウ":
			scientificName ="ロキソドンタ・サイクロティス";
			break;
	
		case "パンダ":
			scientificName ="アイルロポダ・メラノレウカ";
			break;
	
		case "チンパンジー":
			scientificName ="パン・トゥログロディテス";
			break;
	
		case "シマウマ":
			scientificName ="チャップマンシマウマ";
			break;
	
		case "インコ":
			scientificName ="不明";
			break;
	}
		// 格納した動物情報を返却
		return scientificName;
	}
}