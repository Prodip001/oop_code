package assignment;

public class main {
	
	public static void main(String[]args){
		
		
		Employee employee1=new Employee(221001,"Prodip Sarker",60000.00);
		
		
		Professor professor1=new Professor(201002,"Mredul Arafin",65000.00,"CSE");
		
		Administrator admin1=new Administrator(222002,"Apu paul",35000,"SWE");
		
		SupportStuff stuff1=new SupportStuff(1100011,"Farid Hossain",20000,"Office Boy");
		
		
		
		
		System.out.println(employee1.toString()); 
		
		System.out.println();
		
		System.out.println(professor1.toString()); 
		
		System.out.println();
		
		System.out.println(admin1.toString()); 
		
		System.out.println();
		
		System.out.println(stuff1.toString());
		
		
		Employee[]employees={employee1,professor1,admin1,stuff1};
		
		double totalSalary=Employee.totalSalary(employees);
		
		System.out.println("\nTotal Salary: "+totalSalary); 
		
		System.out.println();

}
}
