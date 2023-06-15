package assignment;

public class SupportStuff extends Employee {

	private final String jobtitle;

	public SupportStuff(int employeeID,String name,double salary,String jobtitle){
		
	super(employeeID,name,salary);
	
	this.jobtitle=jobtitle; 
	
	
	}
	public String getjobtitle(){
		
	return jobtitle;
	
	}
	
	public String toString(){
		
	return super.toString()+"\nJobTitle: "+jobtitle;
	
	
	  }
	
	}