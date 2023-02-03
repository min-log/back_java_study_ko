package kosta.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission06 {
	public static void main(String[] args) {

		//updown 게임
		//임의의 난수를 생성 : 1~100 사이 > 정답
		// 키보드로부터 정소를 입력 (1~100) > 이외의 값일 경우 validation check
		//정답과 숫자를 비교해서
		// 정답 : 축하합니다., 몇번만에 성공,
		// 오답 : Up 더 크면 , Down 작으면 출력
		
//		Scanner sc = new Scanner(System.in);
//		Random ran = new Random();
//		
//		int value = ran.nextInt(100)+1;
//		int v = 0;
//		int v2 = 0;
//		
//		while(true) {
//			int user = sc.nextInt();
//			v2 = ++v;
//			
//			if(user == value) {
//				System.out.print("축하합니다."+ v2 + "만에 성공하였습니다.");
//				
//				System.out.println("정답:" + value );
//				return;
//			} else if (user < value) {
//				System.out.print("Up");
//			} else if (user > value) {
//				System.out.print("Down");
//			}else if (user > 100) {
//				System.out.print("다시 입력해주세요.");
//			}
//			
//			
//		}
		
		
		
		// 선생님 방법
//		Scanner sc = new Scanner(System.in);
//		Random r = new Random();
//		
//		int re = r.nextInt(100)+1;
//		System.out.println("정답:"+ re);
//		
//		int n =0;
//		int count = 0;
//		
//		while(true) {
//			// 키보드 입력
//			do {
//				System.out.println("1~100까지 정수만 입력:");
//				n = sc.nextInt();
//			}while(n > 100 || n < 1);
//			
//			count++;
//			
//			
//			if(re == n) {
//				System.out.println("축하합니다."+ count + "성공");
//				return;
//			}else if (re < n) {
//				System.out.println("down");
//			}else if (re > n) {
//				System.out.println("up");
//			}
//		}
		
		
		
		
	}
}
