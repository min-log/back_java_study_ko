package kosta.baseball;

import java.util.Arrays;

public class BaseBall {
	// 난수 생성
	// 스트라이크 / 볼 체크
	int hidden[];
	
	//디폴트 생성자
	public BaseBall() {
		
		hidden = new int[3];
		hidden[0] = (int)(Math.random()*9)+1; //1~9 
		//같은 값이면 다시 반복
		do {
			hidden[1] = (int)(Math.random()*9)+1; //1~9 
		} while (hidden[0] == hidden[1]);
		
		do {
			hidden[2] = (int)(Math.random()*9)+1; //1~9 
		} while (hidden[0] == hidden[2] || hidden[1] == hidden[2] );
		System.out.println("정답" + Arrays.toString(hidden));
	}
	
	
	//strike 값 증가
	public int countStrike(int input[]) { //input[] 값
		int strike = 0;
		for (int i = 0; i < 3; i++) {
			if (hidden[i] == input[i]) {
				strike++;
			}
		}
		return strike;
	}
	
	//ball
	public int countBall(int input[]) {
		int ball = 0;
		for(int i=0;i<3;i++) {
			if(hidden[i] == input[(i+1)%3]) {
				ball++;
			}else if(hidden[i] == input[(i+2)%3]) {
				ball++;
			}
		}
		return ball;
	}
	
	
}
