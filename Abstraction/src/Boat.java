
public class Boat extends Vehicle2{
    public void move (){
        System.out.println (" Boat moves very Slowly");
    }

    public static void main(String[] args) {
        Boat b = new Boat();
        b.move ();
        b.carry ();
    }
}