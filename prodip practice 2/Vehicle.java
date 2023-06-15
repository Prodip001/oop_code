public class Vehicle {
    private String regNo;
    private String make;
    private int yearOfManufacture;
    private double value;

    public Vehicle(String rN,String m,int yom,double v){

        this.regNo=rN;
        this.make=m;
        this.yearOfManufacture=yom;
        this.value = v;

    }
    public String getRegNumber(){
        return regNo;

    }
    public String getMake(){
        return make;
    }
    public int getYear(){
        return yearOfManufacture;
    }
    public double getValue(){
        return value;

    }
    public void setValue(double v){
        this.value =v;
    }
    public int calculateAge(int a){
        return a;
    }
    public void AllInfo(){
        System.out.println ("Regestration Number : "+regNo);
        System.out.println ("Make :"+make);
        System.out.println ("Year of manufacture : "+yearOfManufacture);
        System.out.println ("Value : "+value);
    }
}
