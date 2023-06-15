
public class FlowOfControlInTry {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

       int num1 = x*y;
        System.out.println (num1);
        int num3 = x+y;
        System.out.println (num3);
        try {
            int num2 = x / y;
            System.out.println ("all ok");
        }
        catch(Exception e1){
            System.out.println ("HI:"+e1);
        }
        finally {
            System.out.println ("Rest of all");
        }
    }
}