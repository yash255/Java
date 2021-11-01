package JAVA;
class c1{
	public int x = 5;
	protected int y =25;
	int z = 6;
	private int a = 10;
	public void meth1() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}
 }
public class Access_Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		c1 c = new c1(); 
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
		//System.out.println(c.a);

	}

}
 