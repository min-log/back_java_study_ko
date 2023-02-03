package kosta.mission;

public class HomeStudy04_01 {

	public static void main(String[] args) {
		//1-1 number =5
				// 
//				int a = 0;
//				int b = 0;
//				for(int i= 1;i<=5;i++) {
//					//a++;	
//					for(a= 1+b; a <= 5+b;a++) {
//						System.out.print(a + " ");
//					}
//					b = b+5;
//					System.out.println();
//				}
				
				//1-2 
//				int b =21 ; // 출력 시작점
//				for(int i = 1; i <= 5; i++) { // 5줄
//					for(int a=1;a<=5;a++) { // 5라인
//						System.out.print(b + " ");
//						b++; // 1씩 증가
//					}
//					System.out.println();
//					b= b-10; // 10씩 빼서 다음줄로 넘김
//				}
//				
				//1-3. 2씩 숫자 증가
//				int number = 1;
//				for(int i =1; i<=5;i++) {
//					for(int a =1; a<=5;a++) {
//						//number = number*3;
//						System.out.print(number + " ");
//						number++; // 1증가
//						number++; // 1증가
//					}
//					System.out.println();
//				}
				
				//1-4
//				int i = 1;
//				int a = 1;
//				for(i=1;i<=5; i++) { //5줄
//					for(a=1;a<=i;a++) {
//						System.out.print(a + " ");
//					}
//					System.out.println("");
//				}
				
				
				//1-5
//				int num= 1;
//				for(int i= 1;i<=5;i++) {
//					for(int a= 1; a <= i; a ++) {
//						
//						System.out.print( num+" ");
//						num++;
//					}
//					System.out.println();
//				}
				
				//1-6
//				for(int i = 1; i<=5;i++) {
//					for(int a =1; a<=6-i;a++) {
//						System.out.print(a + " ");
//					}
//					System.out.println();
//				}
				
				//1-7
//				int num = 1;
//				for(int i = 1; i<=5; i++) {
//					for(int a =1 ; a <= 6-i; a++) {
//						
//						System.out.print( num +" ");
//						num++;
//					}
//					System.out.println();
//				}
				
				
				//1-8
//				int num = 1;
//				for(int i = 1; i<=5; i++) {
//					for(int a = 1; a<=5; a++) {
//						if(i<=1) {// 1번 줄
//							System.out.print(a);
//						}else{
//							System.out.print((i+a)-1);
//						}
//					}
//					System.out.println();
//				}
				
				//1-9
//				for(int i=1; i<=5; i++) {
//					
//					for(int a=1; a<=5; a++) {
//						if(i==1) {
//							System.out.print(a);
//						}else if(a <= 5 - i + 1){
//							System.out.print(a+(i - 1));
//						}else {
//							System.out.print( a-(5 - i + 1));
//						}
//					}
//					System.out.println();
//					
//				}
				
				//1-10
//				int count = 1;
//				for(int i=1;i<=5;i++) {
//					for(int a=1;a<=5;a++) {
//						if(a <= 5-i) {
//							System.out.print(" ");
//						}else {
//							
//							System.out.print(count);
//							count++;
//						}
//					}
//					System.out.println();
//				}
				
				
		/////////////////////////////////////////////////////////////////////////////
				
				
				//2-1
//				for(int i=1;i<=5;i++) {
//					for(int a =1;a<=5;a++ ) {
//						System.out.print("*");
//					}
//					System.out.println();
//				}
				
				//2-2
//				for(int i = 1; i<=5; i++) {
//					for(int a=1;a<=i;a++) {
//						System.out.print("*");
//					}
//					System.out.println();
//				}
				
				
				//2-3.
//				for(int i = 1; i<=5; i++) {
//					for(int a=1;a<=5;a++) {
//						
//						if( (a <= 5 - i) == true) {
//							
//							System.out.print(" ");
//							
//						}else{
//							System.out.print("*");
//						}
//					}
//					System.out.println();
//				}
				
				//2-4.
//				for(int i =1; i<=5;i++) {
//					for(int a=1; a<=9;a++) {
//						if(a <= 5-i || a >= 5+i) {
//							System.out.print(" ");
//						}else {
//							System.out.print("*");
//						}
//					}
//					System.out.println();
//				}
//				
				//2-5
				
//				for(int i= 1; i<=9; i++) {
//					for(int a =1;a <=9; a++ ) {
//						if(i<=5) {
//							if( a <= 5-i || a >= 5+i) {
//								System.out.print(" ");
//							}else {
//								System.out.print("*");
//							}
//						}else {
//							int b = -(5-i); // 5번째 줄 이후 부터 새로 1부터 라인;
//							//System.out.println(b);
//							
//							if(a <= b || a >= 10-b) {
//								System.out.print(" ");
//							}else {
//								System.out.print("*");
//							}
//						}
//						
//					}
//					System.out.println();
//				}
				
				
				//2-6
//				int num = 18;
//				for(int i=1; i<=9; i++) {
//					
//						
//						for(int a=1; a<=18; a++) {
//							if(i==1) {
//								//System.out.println(i);
//								if(a > 4 & ) {
//									System.out.print("*");
//								}else {
//									System.out.print(" ");
//								}
//								
//							} 
//							
//							
//						}
//						
//					
//						
//					
//					System.out.println();
//					
//				}
				
				//2-7
				//2-8
				
				
				//2-9
//				for(int i = 1; i <= 7; i++) {
//					for(int a = 1;a <= 7; a++) {
//						if(i==1||i==7) {
//							System.out.print("$");
//						}else if(a == 1||a == 7){
//							System.out.print("$");
//						}else {
//							System.out.print("*");
//						}
//					}
//					System.out.println();
//				}
				
				//2-10 
		/*		
				for(int i=1; i<=7; i++) {
					for(int a=1; a<=7; a++) {
						if(a <= i) {
							//System.out.print(a);
							if(a==1) {
								System.out.print("*");
							}else if(a==i){
								System.out.print("*");
							}else if(a<=i){
								System.out.print("@");
							}
						}
						
					}
					System.out.println();
				}
				
				for(int i=1; i<=7; i++) {
					for(int a=1; a<=7; a++) {
						if(a <= 7-i) {
							//System.out.print(a);
							if(a==1) {
								System.out.print("*");
							}else if(a==7-i){
								System.out.print("*");
							}else if(a<=7-i){
								System.out.print("@");
							}
						}
						
					}
					System.out.println();
				}
		*/
				

	}

}
