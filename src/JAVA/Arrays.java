package JAVA;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] marks = new int[5];
//		marks[0] = 100;
//		marks[1] = 90;
//		marks[2] = 80;
//		marks[3] = 71;
//		marks[4] = 60;
//		System.out.println(marks[1]);
		
		
//		float[]mark = {1.1f,2.2f,3.3f,4.4f,5.5f};
//		String[] name = {"yash","shruti","vaishnavi"};
//		System.out.println(mark[3]);
//		System.out.println(name[2]);
		
		int[] marks= {11,22,33,44,55,66,77,88};
		System.out.println(marks.length);
		
		//for loop
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
//		//Reverse order
//		for(int i=marks.length-1;i>=0;i--) {
//			System.out.println(marks[i]);
//		}
		
		//foreach loop
		for(int p:marks) {
			System.out.println(p);
		}
	}

}
