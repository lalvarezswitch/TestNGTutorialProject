package code;

import java.util.Random;

public class RandomThings {
	public int[] returnInts() {
		Random rand = new Random();
		return rand.ints(2,0,100).toArray();
	}
}
