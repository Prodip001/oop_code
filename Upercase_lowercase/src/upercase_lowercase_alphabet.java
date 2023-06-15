import java.util.Scanner;

public class upercase_lowercase_alphabet {



        public static void main(String[] args) {
            char alphabet ;
            System.out.print("Enter an alphabet: ");
            Scanner an = new Scanner(System.in);
             alphabet =an.next().charAt(0);
            if (Character.isUpperCase(alphabet))
            {
                System.out.println(alphabet + " is an uppercase alphabet.");
            }
            else if (Character.isLowerCase(alphabet))
            {
                System.out.println(alphabet + " is a lowercase alphabet.");
            }
            else {
                System.out.println(alphabet + " is not an alphabet.");
            }
        }
    }


