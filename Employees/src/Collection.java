
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class Collection {
	static {
		
		HashMap<String, Employee>hashmap = new HashMap();
		
		try {
			
			
			
			
			String fileName="employees.properties";
			Properties property = new Properties();
			FileInputStream fileInput = new FileInputStream(fileName);
			property.load(fileInput);
			
			
			Employee emp1= new Employee(property.getProperty("emp1.id"),property.getProperty("emp1.name"),property.getProperty("emp1.phone"),property.getProperty("emp1.email"));
			Employee emp2= new Employee(property.getProperty("emp2.id"),property.getProperty("emp2.name"),property.getProperty("emp2.phone"),property.getProperty("emp2.email"));
			Employee emp3= new Employee(property.getProperty("emp3.id"),property.getProperty("emp3.name"),property.getProperty("emp3.phone"),property.getProperty("emp3.email"));
			Employee emp4 =new Employee(property.getProperty("emp4.id"),property.getProperty("emp4.name"),property.getProperty("emp4.phone"),property.getProperty("emp4.email"));
			Employee emp5 =new Employee(property.getProperty("emp5.id"),property.getProperty("emp5.name"),property.getProperty("emp5.phone"),property.getProperty("emp5.email"));
			
			hashmap.put(property.getProperty("emp1.id"),emp1);
			hashmap.put(property.getProperty("emp2.id"),emp2);
			hashmap.put(property.getProperty("emp3.id"),emp3);
			hashmap.put(property.getProperty("emp4.id"),emp4);
			hashmap.put(property.getProperty("emp5.id"),emp5);
			
								
		System.out.print(hashmap);
			
			}
		catch(FileNotFoundException e){
			
			e.printStackTrace();
		}	
		catch(IOException e) {
			e.printStackTrace();
			
		}
		searchData(hashmap);

	}		

public static void searchData(HashMap<String,Employee>hashmap) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" \n Enter the ID / Name");
	
	String id_name= sc.nextLine();

	for(Map.Entry<String, Employee>entry:hashmap.entrySet()) {
		String key=entry.getKey();
		Employee value= entry.getValue();
		
		if(id_name.equalsIgnoreCase(key) || id_name.equalsIgnoreCase(value.getName())) {
			System.out.println(hashmap.get(key));
		}
		
	}
	
}

public static void searchIdenticalValues(HashMap<String,Employee>hashmap){
	
	List<String>string = new ArrayList<String>();
	
	Map<String,Integer>counts = new HashMap<String, Integer>();
	
	for(String key: string) {
		
		if(counts.containsKey(key)) {
			counts.put(key, counts.get(key)+1);
		} else {
			counts.put(key,1);
		}
	}
	
	for (Map.Entry<String,Integer>entry : counts.entrySet()) {
		System.out.println(entry.getKey()+ "=" + entry.getValue());
	}
}
 public static void main(String args[]) throws IOException {
			
			
		
	}
		
}

	

	