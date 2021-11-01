package JAVA;

@FunctionalInterface
interface test {
	void meth();
//	void meth2();
	
}

//class AnonyDemo implements test{
//	public void display() {
//		System.out.println("Hello");
//	}
//
//	@Override
//	public void meth() {
//		// TODO Auto-generated method stub
//		System.out.println("I am meth");
//		
//	}
//
//	@Override
//	public void meth2() {
//		// TODO Auto-generated method stub
//		System.out.println("I am meth2");
//		
//	}
//	
//	
//	
//	
//}

public class Lamda {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test ad = new AnonyDemo();
//		ad.meth2();
		
		
		//Anonymous Class
//		test t  = new test() {
//			
//			@Override
//			public void meth2() {
//				// TODO Auto-generated method stub
//				System.out.println("I am meth2");
//				
//			}
//			
//			@Override
//			public void meth() {
//				// TODO Auto-generated method stub
//				System.out.println("I am meth");
//				
//			}
//		};
//		t.meth2();
		
		
		//Lamda Expression
		
		test ob = ()->{ 
			System.out.println("I am Lamda" ); 
		};
		ob.meth();
	}

}
