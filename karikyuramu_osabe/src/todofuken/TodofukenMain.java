package todofuken;

import java.util.Scanner;

public class TodofukenMain {

	public static void main(String[] args) {
		System.out.println("コンソールに数字を入力してください（0～10）");
		Scanner scanner = new Scanner(System.in);
		String[] indices = scanner.nextLine().split(",");
		
		System.out.print("昇順 or 降順？（asc / desc）: ");
		String order = scanner.nextLine();

        TodoufukenInput number = new TodoufukenInput();
		number.Input(indices, order);
	}
}