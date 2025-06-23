package karikyuramu_osabe;

import java.util.Scanner;

public class MainAnimal {

	public static void main(String[] args) {
		
		System.out.println("コンソールに文字を入力してください");
		Scanner scan = new Scanner(System.in);
		
		//入力した値を動物区切りにする
		String[] Animals = scan.nextLine().split(",");
		AnimalName animal = new AnimalName();
		animal.animaldata(Animals);
	}


}
