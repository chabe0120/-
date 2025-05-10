import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class New_question {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1
		sub1("Hello JavaSE", 11);
		
		// Q2
		sub2(10, 8);
		
		// Q3
		int i[] = {1, 5, 10, 14};
		sub3(i);
		
		// Q4
		sub2(1.5, 5.3);
		
		//Q5
		List<Integer> numbers = sub4(5);
		
		//Q6
		double average = sub4(numbers);
		    
		//Q7
		//平均値が50以上か判定（ここでQ7のメソッドを呼び出す！）
		 boolean  bl = sub4(average);
	    }
	
	//Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void sub1(String str1, int num1) {
    	
		System.out.println(str1 + " " + num1);
		System.out.println();
        }
        
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void sub2(int num1, int num2) {
    	
		System.out.println(num1 * num2);
		System.out.println();
       }
    
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void sub3(int nums1[]) {
    	System.out.println(Arrays.toString(nums1));
    	System.out.println();
       }
    
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void sub2(double num1, double num2) {
    	System.out.println(num1 + num2);
    	System.out.println();
    }
    
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
    public static List<Integer> sub4(int num1) {
        List<Integer> resultList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < num1; i++) {
            int randomNum = rand.nextInt(100) + 1;
            resultList.add(randomNum);
            System.out.println(randomNum);
        }
		return resultList;
    }
    
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double sub4(List<Integer> nums) {
		double sum = 0;
		
		for (int num : nums) {
	        sum += num;
	    }

	    double average = sum / nums.size();
		
    	System.out.println("平均値: " + average);
    	return average;
    }
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
    // 作成したメソッドをここで呼び出してください
	public static boolean sub4(double average) {
		boolean bl = average >= 50;
		
    	System.out.println(bl);
    	return bl;
    }
	
	
}
