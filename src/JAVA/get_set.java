package JAVA;

class MyEmployee{
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
	
	
}
public class get_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyEmployee employee = new MyEmployee();
		
		employee.setId(5);
		System.out.println(employee.getId());
		
		employee.setName("yash");
		System.out.println(employee.getName());

	}

}
