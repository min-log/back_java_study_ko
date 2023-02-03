package kosta.baseball;

import java.util.Scanner;

public class User implements Ball {
	Scanner sc = new Scanner(System.in);
	int Array[] = new int[3];
	
	@Override
	public void ballArry() {
		System.out.print("숫자 입력 : ");
		
		for (int i = 0; i < Array.length; i++) {
			Array[i] = sc.nextInt(); // 2 5 6
		}

	}

	public int[] getArray() {
		return Array;
	}

	public void setArray(int[] array) {
		Array = array;
	}

	
	

}
