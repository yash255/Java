package JAVA;
class One{
	public void name() {
		System.out.println("My name is yash");
	}
	public void greet() {
		System.out.println("Good morning");
	}
}

class Two extends One{
	@Override
	public void name() {
		System.out.println("My name is Lucifer");
	}
	public void welcome() {
		System.out.println("Welcome to Hell");
	}
}
public class dynamic_method_dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		One obj = new One();
//		obj.name();
//		Two obj2 = new Two();
		
		One obj3 = new Two();
		obj3.name();
		obj3.greet();
		
		

	}

}
