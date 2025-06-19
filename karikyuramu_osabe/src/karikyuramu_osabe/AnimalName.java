package karikyuramu_osabe;

public class AnimalName {
	
	public void MainAnimal(String[] Animalarray) {
		for(int i = 0; i < Animalarray.length; i++) {
			String[] Animals = Animalarray[i].split(":");
			
			System.out.println("動物名："+ Animals[0]);
			System.out.println("体長："+ Animals[1] +"m");
			System.out.println("速度："+ Animals[2] +"km/h");
			System.out.println("学名："+ this.getName(Animals[0]) +"\n");
		}
	}
	
	public  String getName(String Name){
	
	switch (Name) {
	case "ライオン":
		Name = "パンテラ レオ";
		break;
	
	case "ゾウ":
		Name ="ロキソドンタ・サイクロティス";
		break;

	case "パンダ":
		Name ="アイルロポダ・メラノレウカ";
		break;

	case "チンパンジー":
		Name ="パン・トゥログロディテス";
		break;

	case "シマウマ":
		Name ="チャップマンシマウマ";
		break;

	case "インコ":
		Name ="不明";
		break;
	}
	return Name;

	}
}
