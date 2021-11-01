package JAVA;
class A{
	public int a;
	 public int a1() {
		 return 4;
	 }
	 public void a2() {
		 System.out.println("I am method 2 of class A");
	 }
}

class B extends A{
	@Override
	 public void a2() {
		 System.out.println("I am method 2 of class B");
	 }
	public void a3() {
		 System.out.println("I am method 2 of class A");
	 }
}
public class method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.a2();
		
		B b = new B();
		b.a2();

	}

}
