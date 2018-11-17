
import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Collection {
	
	public static void main(String []args) throws IOException {
		
		
		
		List<Employee> employee=  new LinkedList<>();
		
		employee.add(new Employee ("E0001", "Abeesh", 9976767999L,"abeesh@gmail.com"));
		employee.add(new Employee ("e0002", "Sheethal", 9876789879L,"sheethal@gmail.com"));
		employee.add(new Employee ("E0003", "Vaishnav", 9845764576L,"vaishnav@gmail.com"));
		employee.add(new Employee ("E0004", "John", 9845321243L,"john@gmail.com"));
		employee.add(new Employee ("e0005", "John", 8767456351L,"john12345@gmail.com"));
		
	
		DataInputStream dis= new DataInputStream(System.in);
		System.out.println("Enter ID or Name");
		String value= dis.readLine();
		searchValue(value,employee);
		
		Employee.duplicate(employee);

		
		}

	public static void searchValue(String value, List<Employee> employee) {
		
		for(Employee emp: employee) {
			
			if(value .equals(emp.getID()) || (value.equalsIgnoreCase(emp.getName()))) {
				
				System.out.println("Your Details:  " + "ID= " + emp.getID()+ " Name=" + emp.getName() + " Phone =" + emp.getPhone() + " Email ="+ emp.getEmail());
				
			}
			 
			
		}
		
		
	}
	
}
	
	
	

	