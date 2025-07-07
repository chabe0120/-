package todofuken;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Todofuken_main {

	public static void main(String[] args) {
		
		System.out.println("コンソールに数字を入力してください（0～10）");
		Scanner scanner = new Scanner(System.in);
		
		String[] indices = scanner.nextLine().split(",");
		
		System.out.print("昇順 or 降順？（asc / desc）: ");
        String order = scanner.nextLine().trim();
		
		Integer[] num = new Integer[indices.length];
		for(int i = 0; i < indices.length; i++) {
			num[i] = Integer.parseInt(indices[i]);
		}
		
		if(order.equals("asc")) {
			Arrays.sort(num);
		}else {
			Arrays.sort(num,Collections.reverseOrder());
		}
		
		todoufuken_sort animal = new todoufuken_sort();
		animal.todofuken(num);
		
		
		
		
		
	}

}