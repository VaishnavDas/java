

public class Employee {
	
		
	
	private  String ID;
	private  String Name;
	private  String Phone;
	private  String Email;
	
	
	
	
	public Employee(String ID, String Name, String Phone,  String Email ) {
		
		this. Name = Name;
		this. ID = ID.toLowerCase();
		this. Phone = Phone;
		this.Email = Email;
	
	}
	
	/*public Employee() {
		
		  String ID;
		  String Name;
		  long Phone;
		  String Email;	
	

	}*/
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
	
	public  String getPhone() {
		
		return Phone;
	}
	
	public void setPhone(String value) {
		
		this. Phone= value;
		
	}
	
	public  String getEmail() {
		
		return Email;
		
	}
	
	public void setEmail(String Email) {
		
		this.Email= Email;
		
	}
	
	public String toString() {
		
		return this.ID+" "+this.Name+" "+this.Phone+" "+this.Email;
	}

}
	

/*public static void duplicate(List<Employee> fileName) {
	
	
	for(Employee FileName:fileName) {
		
		String var = ( fileName.getID());
		if(!list.contains(fileName)) {
		//list.add(var);
			
			System.out.println(" No Invalid data");
			break;
			
		}
		else {
		System.out.println(" Invalid Data");
		
		}
	
	}
}
}*/
	
	
	
	
	

