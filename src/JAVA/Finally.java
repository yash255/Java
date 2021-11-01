package JAVA;



public class Finally {
	public static int greet() {
		try {
			int a=10;
			int b = 3;
			int c = a/b;
			return c;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			System.out.println("Khatam bye bye tata");
		}
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int k =	greet();
	System.out.println(k);
	
	int aa=7;
	int bb = 8;
	
	while (true) {
		try {
			System.out.println(aa/bb);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			break;
			//System.out.println(e);
		}
		finally {
			System.out.println("value of b  "+bb);
		}
		bb--;
		
	}
		

	}

}
