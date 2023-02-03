package kosta.io;

import java.io.Serializable;

public class Member implements Serializable {
		private String name;
		private int age;
		private Video video; // 비디오 객체 선언.
		
		
		
		public Member() {}
		
		public Member(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		
		public Member(String name, int age, Video video) {
			super();
			this.name = name;
			this.age = age;
			this.video = video;
		}

		



		@Override
		public String toString() {
			return "Member [name=" + name + ", age=" + age + ", video=" + video + "]";
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

		public Video getVideo() {
			return video;
		}

		public void setVideo(Video video) {
			this.video = video;
		}
		
		
}
