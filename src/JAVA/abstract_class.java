package JAVA;

abstract class Base2{
	public Base2() {
		System.out.println("Base class Constructor");
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	abstract public void greet();
	abstract public void greet2();

}
class Child2 extends Base2{
	@Override
	public void greet() {
		System.out.println("Good Morning");
	}
	@Override
	public void greet2() {
		System.out.println("I am good");
	}
}
 
abstract class Child3 extends Base2{
	public void hello() {
		System.out.println("I am good");
	}
	
}
public class abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child2 child2 = new Child2();
		child2.greet2();

	}

}
