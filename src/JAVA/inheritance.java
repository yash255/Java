package JAVA;


class Base{
	int x;

	public Base() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	  
}

class Derived extends Base{
	int y;

	public Derived() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base base = new Base();
		base.setX(4);
		System.out.println(base.getX());
		
		Derived derived = new Derived();
		derived.setX(5);
		derived.setY(6);
		System.out.println(derived.getX());
		System.out.println(derived.getY());

	}

}
