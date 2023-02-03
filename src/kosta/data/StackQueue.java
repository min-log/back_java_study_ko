package kosta.data;

import java.util.LinkedList;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		
		//stack >> push,pop
		Stack<Integer> s = new Stack<Integer>(); //stack 자료구조
		
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println("=========================stack");
		while (!s.isEmpty()) { //isEmpty 비어 있는지 안 비어있는지 확인.
			
			System.out.println(s.pop()); //pop뽑아내기
			
		}
		

		//Queue >> offer ,poll
		LinkedList<Integer> q = new LinkedList<Integer>(); //Queue 자료구조
		q.offer(1);
		q.offer(2);
		q.offer(3);
		System.out.println("=========================Queue");
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
		

	}

}
