

public class Car2 extends Vehicle2{
    public void move(){
        System.out.println (" Car2 Moves Faster");
    }

    public static void main(String[] args) {
        Car2 c= new Car2 ();
        c.move ();
        c.carry ();
    }
}