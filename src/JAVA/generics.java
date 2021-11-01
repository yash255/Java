package JAVA;

import java.util.ArrayList;
import java.util.Scanner;

class MyGeneric<T1,T2>{
	int val = 344;
	private T2 t2;
	private T1 t1;
	
	
	public MyGeneric(int val, T2 t2, T1 t1) {
		super();
		this.val = val;
		this.t2 = t2;
		this.t1 = t1;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public T2 getT2() {
		return t2;
	}
	public void setT2(T2 t2) {
		this.t2 = t2;
	}
	public T1 getT1() {
		return t1;
	}
	public void setT1(T1 t1) {
		this.t1 = t1;
	}
	
	
	
	
	
	
}

public class generics {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		
	//	arrayList.add("str1");
		arrayList.add(25);
		arrayList.add(54);
		
//		arrayList.add(new Scanner(System.in));
		
		
		int a =(int) arrayList.get(0);
	//	System.out.println(a);
		
		MyGeneric<String,String> g1 =new MyGeneric(25, "Yash", "Lucifer");
		String string = g1.getT1();
		String string2 = g1.getT2();
		
		System.out.println(string+" "+string2);
		}
	


}
