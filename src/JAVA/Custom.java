package JAVA;
class Employee{
		int id;
		String name;
		
		public void details() {
			System.out.println(id);
			System.out.println(name);
		}
		
	}
public class Custom {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp =new Employee();
		Employee emp1 =new Employee();
		
	
		emp.id=1;
		emp.name="yash";
		
		emp1.id=2;
		emp1.name="abc";
		
		emp.details();
		emp1.details();
		
//		System.out.println(emp.id);
	
		
		
			
		
		

	}

}
