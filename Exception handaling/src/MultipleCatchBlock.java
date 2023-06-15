
public class MultipleCatchBlock {
    public static void main(String[] args) {
        int []a=new int[2];
        a[1]=12;
        try{
            a[3]=23;

        }
        catch(NullPointerException e1 ){
            System.out.println ("EXception type :"+e1);

        }
        catch (ArrayIndexOutOfBoundsException e2){
            System.out.println ("Exception type :"+e2);
        }


        catch(Exception e4){
            System.out.println ("Exception type :"+e4);
        }
        finally {
            System.out.println ("Rest of the code");
        }

    }
}

