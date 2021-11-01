package JAVA;
interface sampleInterface{
	public void meth1();
	public void meth2();
}
interface childInterface extends sampleInterface{
	public void meth3();
	public void meth4();
}

class MyClass implements childInterface{
	public void meth3() {
		System.out.println("meth3");
	}
	public void meth4() {
		System.out.println("meth4");
	}
	public void meth1() {
		System.out.println("meth1");
	}
	public void meth2() {
		System.out.println("meth2");
	}
}
public class inheritance_in_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
		obj.meth3();

	}

}
