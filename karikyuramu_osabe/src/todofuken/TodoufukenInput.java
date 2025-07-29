package todofuken;

import java.util.Arrays;
import java.util.Collections;

public class TodoufukenInput {
	String[] data = {
		"北海道:札幌市:83424",
		"青森県:青森市:9646",
		"岩手県:盛岡市:15275",
		"宮城県:仙台市:7282",
		"秋田県:秋田市:11638",
		"山形県:山形市:9323",
		"福島県:福島市:13784",
		"茨城県:水戸市:6097",
		"栃木県:宇都宮市:6408",
		"群馬県:前橋市:6362",
		"埼玉県:さいたま市:3798"
	};
	public void Input(String[] indices,String order) {

		Integer[] num = new Integer[indices.length];
		for(int i = 0; i < indices.length; i++) {
			num[i] = Integer.parseInt(indices[i]);
		}
		num = Sort(num,order);
		Display(num);
	}
	public Integer[] Sort(Integer[] num,String order) {
		if(order.equalsIgnoreCase("asc")) {
			Arrays.sort(num);
			}else {
			Arrays.sort(num,Collections.reverseOrder());
		}
		return num;
	}
	public void Display(Integer[] num) {
		for(int i = 0; i < num.length; i++) {
			String[] Todofuken = data[num[i]].split(":");
			System.out.println("都道府県名："+ Todofuken[0]);
			System.out.println("県庁所在地："+ Todofuken[1]);
			System.out.println("面積："+ Todofuken[2] +"km2\n");
		}
	}
}