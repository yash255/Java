package JAVA;
class Base1{
	public int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Base1() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("I am a counstructor");
	}
	public Base1(int x) {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("I am a overloaded counstructor"+x);
	}
	
	
	
}

class Derived1 extends Base1{
	public int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Derived1() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("derived constructor");
	}
	public Derived1(int x,int y) {
		super(x);
		// TODO Auto-generated constructor stub
		System.out.println("overloaded derived constructor"+y);
	}
	
	
}


class childDerived extends Derived1{
	public childDerived() {
		System.out.println("child of derived constructor");
	}
	 childDerived(int x,int y,int z){
		 super(x, y);
		 System.out.println("child of derived constructor"+z);
		 
	 }
}
public class constructor_in_inheritance {
	public static void main(String[] args) {
		
//		Base1 base1= new Base1();
		//Derived1 derived1 = new Derived1(9,2);
		childDerived d = new childDerived(1,2,3);
		
		
	}

}
