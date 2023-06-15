public class SecondHandVehicle extends Vehicle{

  private   int numberOfOwner ;
  private double s;
    public SecondHandVehicle(String rN, String m, int yom, double v, int nof){
       super(rN,m,yom,v);
        this.numberOfOwner=nof;

    }
    public int getNumberOfOwner(){
        return numberOfOwner;
    }

   public void sellVehicle(double s){
      this.s=s;
   }

   public void AllDetails() {
       super.AllInfo ();
       System.out.println (" Number of owner : "+numberOfOwner);

   }


}
