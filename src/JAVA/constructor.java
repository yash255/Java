package JAVA;

class MyEmployee1{
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public MyEmployee1() {
		id=32;
		name="abc";
	}
	public MyEmployee1(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	
}
public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyEmployee1 my = new MyEmployee1(25,"yash");
		System.out.println(my.getId());

	}
 
}
