package kosta.test;

public class FileT {
	String title;
	String content;
	int dage;
	
	public FileT () {}
	
	
	
	public FileT(String title, String content, int dage) {
		super();
		this.title = title;
		this.content = content;
		this.dage = dage;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getDage() {
		return dage;
	}

	public void setDage(int dage) {
		this.dage = dage;
	}
	
	
	
}
