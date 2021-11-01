package JAVA;

public class Varargs {
	
	static int sum(int ...a) {
		int result=0;
		for(int arr:a) {
			result +=arr; // result = result+arr;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1,2,4,5,6,3));
		System.out.println(sum());

	}

}
