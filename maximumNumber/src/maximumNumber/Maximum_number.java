package maximumNumber;

import java.util.Scanner;

public class Maximum_number {
    private static Scanner an;

	public static void main(String[]args){
        int a,b;
        System.out.println("Enter two numbers :");
        an = new Scanner(System.in);
        a = an.nextInt();
        b = an.nextInt();
        if(a>b){
            System.out.println(a+" is maximum");

        }
        else{
            System.out.println(b+" is maximum");
        }

    }
}