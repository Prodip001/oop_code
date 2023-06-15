package maximumNumber;

import java.util.Scanner;

public class Maximum_number_from_3_numbers {
    private static Scanner an;

	public static void main(String[] args) {
        int a, b, c, max;
        System.out.println("Enter three numbers :");
        an = new Scanner(System.in);
        a = an.nextInt();
        b = an.nextInt();
        c = an.nextInt();

        if ((a > b) && (a > c)) {

            max = a;

        } else if (b > c) {
            max = b;
        } else {

            max = c;

        }

        System.out.println("Maximum of all three numbers is :" + max);
    }
}

