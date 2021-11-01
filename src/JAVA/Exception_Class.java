package JAVA;

import java.util.Scanner;

class MyException extends Exception{
	@Override
	public String toString() {
		return toString()+"I am toString()";
	}
	@Override
	public String getMessage() {
		return getMessage()+"I am getMessage";
	}
}

public class Exception_Class {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int a=8;
		Scanner scanner = new Scanner(System.in);
		a=scanner.nextInt();
		if(a<99) {
			try {
				throw new MyException();
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				System.out.println(e);
				System.out.println("finished");
				e.printStackTrace();
			}
			
		}

	}

}
