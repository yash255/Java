package JAVA;

import java.security.PublicKey;

class NegativeRadiusException extends Exception {
	@Override
	public String toString() {
		return "Radius cannot be negative";
	}
	@Override
	public String getMessage() {
		return "Radius cannot be negative";
	}
}




public class throw_throws {
	public static double area(int r) throws NegativeRadiusException {
		if(r<0) {
			throw new NegativeRadiusException();
		}
		double result = Math.PI*r*r;
		return result;
	}
	public static int divide(int a,int b) throws ArithmeticException {
		int result = a/b;
		
		return result;
	}

	public static void main(String[] args) {
		try {
			 double ar = area(-6);
	         System.out.println(ar);
//			int c =divide(10, 5);
//			System.out.println(c);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception");
		}
	
		
	}

}
