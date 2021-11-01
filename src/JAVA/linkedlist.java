package JAVA;

import java.util.*;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l1.add(7);
		l1.add(5);
		l1.add(7);
		l1.add(6);
		l1.add(0, 8);
		l1.add(2, 9);
	//	l1.clear();
		
		l1.set(0, 69);
		
		
		l2.add(111);
		l2.add(112);
		l2.add(113);
		l2.add(114);
		l2.add(115);
		l2.addAll(l1);
		l2.addAll(0,l1);
		
		
		l2.addFirst(25);
		l2.addLast(99);
		
		
		l1.remove(0);
		l2.removeFirst();
		l2.removeLast();
		
//		for(int num:l1) {
//			System.out.println(num);
//		}
		
		for(int i=0;i<l1.size();i++) {
			System.out.print(l1.get(i));
			System.out.print(",");
		}
		
		for(int i=0;i<l2.size();i++) {
			System.out.println(l2.get(i));
		}
		
		System.out.println(l2.contains(9));
		System.out.println(l1.contains(99));
		
		System.out.println(l2.indexOf(6));
		System.out.println(l1.indexOf(363));
		System.out.println(l1.indexOf(7));
		System.out.println(l1.lastIndexOf(7));
		
		
		System.out.println(l2.isEmpty());

	}

}
