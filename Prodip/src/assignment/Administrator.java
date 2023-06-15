package assignment;

public class Administrator extends Employee{
	
	
	private final String department;
	
	public Administrator(int employeeID,String name,double salary,String department){
		
	super(employeeID,name,salary);
	
	this.department=department;
	
	}
	
	public String getdepartment(){
		
	return department; }
	
	public String toString(){
		
	return super.toString()+"\nDepartment: "+department; 
	
	}
	
	
}
