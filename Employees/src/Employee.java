import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private  String ID;
	private  String Name;
	private  long Phone;
	private  String Email;
	
	
	
	
	public Employee(String ID, String Name, long Phone,  String Email ) {
		
		this. Name = Name;
		this. ID = ID.toLowerCase();
		this. Phone = Phone;
		this.Email = Email;
	}
	
	public  String getID() {
		
		return ID;	
		
	}
	
	public void setID(String ID) {
		
		this. ID = ID;
	}
	
	public  String getName() {
		
		return Name;
	}
	
	public void setName(String Name) {
		
		this. Name= Name;
	}
	
	public  long getPhone() {
		
		return Phone;
	}
	
	public void setPhone(long Phone) {
		
		this. Phone= Phone;
		
	}
	
	public  String getEmail() {
		
		return Email;
		
	}
	
	public void setEmail(String Email) {
		
		this.Email= Email;
		
	}



public static void duplicate(List<Employee> emp) {
	
	List<String> list= new ArrayList<>();
	for(Employee employee:emp) {
		
		String var = employee.getID();
		if(!list.contains(employee)) {
		//list.add(var);
			
			System.out.println(" No Invalid data");
			break;
			
		}
		else {
		System.out.println(" Invalid Data");
		
		}
	
	}
}
}
		
	
	
	
	
	

