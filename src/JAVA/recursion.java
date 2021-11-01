package JAVA;
 
public class recursion {
	
	static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		System.out.println(factorial(x));

	}

}
