package Lecture_8;

public class MyCalculation extends Calculation{
    public void multiplication(int x,int y){
        z = x*y;
        System.out.println("Multiplication :"+z);
    }
    public void divison(int x,int y){
        z = x/y;
        System.out.println("division :"+z);
    }

    public static void main(String[] args) {
        MyCalculation demo1 = new MyCalculation();
        demo1.addition(26,73);
        demo1.divison(52,85);
        demo1.subtraction(65,64);
    }
}

