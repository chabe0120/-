package karikyuramu_osabe;

import java.util.Random;

public class Character extends sub{
	private Random rand = new Random();
	
	public Character() {
		super();
	}
	
	public void randomStatus() {
		setStatus("ステータス");
		setHp(rand.nextInt(1000));
		setMp(rand.nextInt(1000));
		setStr(rand.nextInt(1000));
		setDex(rand.nextInt(1000));
		setDp(rand.nextInt(100));
	}
	
}
