package kosta.baseball;

public interface Ball {
	// array 만들기
	public abstract void ballArry();
	//프린트
	public default void ballshow(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "/");
		}
		System.out.println();
	};

}
