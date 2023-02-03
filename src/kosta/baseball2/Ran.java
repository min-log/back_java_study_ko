package kosta.baseball;

import java.util.Random;

public class Ran implements Ball {
	private int Array[] = new int[3];
	
	
	public Ran() {}
	Random random = new Random();
	
	@Override
	public void ballArry(){
		for (int i = 0; i < Array.length; i++) {
			Array[i] = (random.nextInt(9)+1);
			for (int j = 0; j < i; j++) {
				if(Array[i] == Array[j]) {
					i--;
				}
			}
		}
	}

	public int[] getArray() {
		return Array;
	}

	public void setArray(int[] array) {
		Array = array;
	}


	
	
}
