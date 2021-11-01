package JAVA;

@FunctionalInterface
 interface multifunctionalInterface{
	void thisMethod();
//	void thisMethod2();
}

class NewClass extends One{     //from dynamic_method_dispatch
	@Override
	public void name() {
		System.out.println("Venom");
	}
	
	@Deprecated
	public int sum(int a,int b) {
		return a+b;
	}
}

public class java_annotation {
	@SuppressWarnings("deprecation")

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewClass class1 = new NewClass();
		class1.name();
		
		
		class1.sum(5, 4);

	}

}
