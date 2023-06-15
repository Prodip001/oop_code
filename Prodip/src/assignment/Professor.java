package assignment;

public class Professor extends Employee{
	
private String SubjectOfExpertise;


public Professor(int employeeID,String name,double salary,String SubjectofExpertise){
	
	super(employeeID,name,salary);
	

	this.SubjectOfExpertise=SubjectofExpertise;
	
	}
 
 public String getSubjectofExpertise(){
	 
	 
return SubjectOfExpertise; 

 }
public String toString(){
	
return super.toString()+"\nSubjectofExpertise: "+SubjectOfExpertise; 


   }

  
}

