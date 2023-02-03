package kosta.io;

import java.io.Serializable;

//1. Video --> 비디오 정보를 담고 있다.(번호, 제목, 배우) 

public class Video implements Serializable{ // 0x200
	// 1. 필드 선언
	private int videoNo;
	private String videoTitle;
	private String videoActor;
	
	//2. 디폴트 생성자
	public Video() {}
	
	
	//3. 필드를 초기화 할수 있는 생성자 추가
	public Video(int videoNo, String videoTitle, String videoActor) {
		super();
		this.videoNo = videoNo;
		this.videoTitle = videoTitle;
		this.videoActor = videoActor;
	}
	
	
	//4. 비디오 리스트 출력 메소드
	public void VideoShow() {
		System.out.println("회원이 대여한 비디오 번호 : " + videoNo );
		System.out.println("회원이 대여한 비디오 제목 : " + videoTitle);
		System.out.println("회원이 대여한 비디오 배우 : " + videoActor);
	
	}

	//5. set /get 메소드 생성
	public int getVideoNo() {
		return videoNo;
	}


	public void setVideoNo(int videoNo) {
		this.videoNo = videoNo;
	}


	public String getVideoTitle() {
		return videoTitle;
	}


	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}


	public String getVideoActor() {
		return videoActor;
	}


	public void setVideoActor(String videoActor) {
		this.videoActor = videoActor;
	}
	

	
	
	
}
