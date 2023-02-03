package kosta.baseball;


public class Game {
	int s = 0;
	int b = 0;
	Boolean gameStart = true;
	

	public Game() {
		Ran ranball = new Ran();
		User userball = new User();
		
		System.out.print("정답 : ");
		ranball.ballArry();
		ranball.ballshow(ranball.getArray());		
		int RanArray[] = ranball.getArray();
	
		while (gameStart) {
			s = 0;
			b = 0;
			
			
			userball.ballArry();
			userball.ballshow(userball.getArray());
			int UserArray[] = userball.getArray();
			
			
			for (int i = 0; i < RanArray.length; i++) {
				for (int j = 0; j < UserArray.length; j++) {
					if(RanArray[i] == UserArray[j] && i == j) {
						s++;
					}else if(RanArray[i] == UserArray[j] && i != j){
						b++;
					}
				}
				
			} //for
			System.out.println(s + "s" + b + "b");
			
			if(s == 3) {
				System.out.println("성공 !!");
				
				break;
			}
		
		
		
		
		}
		
		
		
		
		
	}
	
	
}
