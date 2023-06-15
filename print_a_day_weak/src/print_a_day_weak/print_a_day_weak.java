package print_a_day_weak;

import java.util.Scanner;

public class print_a_day_weak {
    public static void main(String[] args) {

        int week;
        System.out.println("enter the week number(1-7) ;");
        Scanner an = new Scanner(System.in);
        week = an.nextInt();

        if (week == 1) {
            System.out.println("Monday");
        } else if (week == 2) {
            System.out.println("Tuesday");
        } else if (week == 3) {
            System.out.println("Wednesday");
        } else if (week == 4) {
            System.out.println("Thursday");
        } else if (week == 5) {
            System.out.println("Friday");
        } else if (week == 6) {
            System.out.println("Saturday");
        } else if (week == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Input! Please enter week number between 1-7.");
        }
    }
}