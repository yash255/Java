package JAVA;
import java.util.*;

public class Array_Deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> a1 = new ArrayDeque<Integer>();
		a1.add(7);
		a1.add(5);
		a1.add(6);
		a1.add(8);
		a1.addFirst(2);
		a1.addLast(1);
		
		a1.offerFirst(3);
		a1.offerLast(4);
		
		a1.removeFirst();
		a1.removeLast();
		
		a1.pollFirst();
		a1.pollLast();
		
		
		
		
		
		
		
		
		System.out.println(a1.getFirst());
		System.out.println(a1.getLast());
		
		System.out.println(a1.peekFirst());
		System.out.println(a1.peekLast());
		
		
		

	}

}
