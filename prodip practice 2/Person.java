package Encapsulation;

public class Person {
    private  String name,age ;
    public void setInfo(String n,String a){
        this.name = n;
        this.age= a;

    }
    public String getName(){
        return name;
    }
    public String getAge(){
     return age;

    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setInfo (" Anukul chandra","22");
        System.out.println ("Name : "+p.getName ());
        System.out.println ("Age : " +p.getAge ());
    }

}
