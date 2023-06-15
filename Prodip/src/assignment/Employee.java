package assignment;

public class Employee {
	
		private final int employeeID; 
		
		private final String name; 
		
		private final double salary;
		
		
		public Employee(int employeeID,String name,double salary) {
			
			this.employeeID= employeeID;
			this.name=name;
			this.salary=salary;
			
			}
		
		
		public int getEmployeeID() {
			
			return employeeID;
		}
		
		public String getName() { 
			
			return name;
		}
		
		public double getSalary() {
			
			return salary;
			
		}
		
		public String toString() {
			
		return "EmployeeID: "+employeeID+ "\nName: "+name+"\nSalary: "+salary; 
		
		}
		public static double totalSalary(Employee[]employees) { 
			
			double totalSalary=0;
			
		       for(Employee employee:employees) { 
		    	   
		    	   totalSalary+=employee.getSalary();
		}
		return totalSalary; 
		
		}
	
	}



