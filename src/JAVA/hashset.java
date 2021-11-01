package JAVA;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	HashSet<Integer> myset = new HashSet<Integer>();
		HashSet<Integer> myset2 = new HashSet<Integer>(6,0.5f);
		
		myset2.add(6);
		myset2.add(5);
		myset2.add(4);
		myset2.add(3);
		myset2.add(2);
		
		System.out.println(myset2);

	}

}
