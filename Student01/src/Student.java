
public class Student {
    private  String id;
    private String name ;
    private double cGpa;
    private String dept;

    public void  setInformation(String i,String n,double c,String d){
        id = i;
        name = n;
        cGpa =c;
        dept = d;

    }

    public void getInformation(){
        System.out.println("Id is "+id);
        System.out.println("Name is :"+name);
        System.out.println("Dept is :"+dept);
        System.out.println("CGPA is :"+cGpa);



    }
}