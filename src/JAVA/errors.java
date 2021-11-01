package JAVA;

import java.util.Scanner;

import javax.naming.AuthenticationException;

public class errors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = new int[3];
		marks[0] = 1;
		marks[1] = 2;
		marks[2] = 3;
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("enter the value of index ");
			int a = scanner.nextInt();
			try {
				System.out.println("welcome");
				try {
					System.out.println("the index is " + marks[a]);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("something went wrong");
				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("exception is true");
			}
			System.out.println("thank you");

		}

	}

}
