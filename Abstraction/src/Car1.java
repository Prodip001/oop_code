
public class Car1 extends Vehicle{
    public void move(){
        System.out.println (" Car Moves faster ");
    }
    

    public static void main(String[] args) {
        Car1 c = new Car1();
        c.move ();
        c.carry ();
    }
}
