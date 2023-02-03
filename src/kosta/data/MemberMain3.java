package kosta.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MemberMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member3> mlist = new ArrayList<Member3>();
		mlist.add(new Member3("길동이", 20, "서울"));
		mlist.add(new Member3("홍씨", 30, "남양주"));
		mlist.add(new Member3("박씨", 10, "경기"));
		Collections.sort(mlist);
		
		Collections.sort(mlist, new Comparator<Member3>() {
			@Override
			public int compare(Member3 o1, Member3 o2) {
				//이름을 기준으로 오름 차순
				//compareTo
				//사전적으로..
				//0 -> 서로같다
				//음수 -> aa.compareTo(BB);
				//양수 -> BB.compareTo(aa);
				if (o1.getName().compareTo(o2.getName()) > 0) {
					//o1이더 크다..
					return 1;
				}else if(o1.getName().compareTo(o2.getName()) < 0) {
					return -1;
				}
				return 0;
			}
		});
		
		for (Member3 m : mlist) {
			System.out.println(m.getAge() + m.getName());
		}
		
	}

}
