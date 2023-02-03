package kosta.basic;

import java.util.Random;

public class RendomExam {

	public static void main(String[] args) {
		// rendom > 난수(임의의 수)
		// 1.Math.random() -> 0.0~0.9: double
		//주사위 1~6
//		int num = (int)(Math.random()*6) + 1;
//		System.out.println(num);

	
		//2. Random 클레스 nextInt();
		Random r = new Random();
		int num2 = r.nextInt(6)+1;
		System.out.println(num2);
	
	
	}
	
	

}
