public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle ("2221-00", "Alluminium", 2019, 22200);
        Vehicle v2= new Vehicle ("444343","Aluminiuam",2018,22000);
        System.out.println (" The vehicle details :");
        v.AllInfo ();
        System.out.println ("The second Hand vehicle details :");
        SecondHandVehicle s = new SecondHandVehicle ("33332", "Aluminimuam", 2010, 11000, 3);
         SecondHandVehicle s2 = new SecondHandVehicle ("526762","Aluminiuam",2010,10000,4);
         s.AllDetails ();

         System.out.println ("Age is :"+v.calculateAge (10));
    }
}