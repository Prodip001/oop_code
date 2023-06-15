
public class Exceptiondemo {
    public static void main(String[] args) {

        int y = 0;
        try {
            int[] x = new int[4];
            x[5] = 34;
        } catch (Exception e2) {
            System.out.println ("The result is : " + e2);
        } finally {

            System.out.println ("Rest of the code ....");
            System.out.println ("jdhdjk");
            System.out.println ("ijhriuruoi");
        }
    }
}