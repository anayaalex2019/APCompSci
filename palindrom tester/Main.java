import java.util.Scanner;
public class Main {

    public static Boolean palindrome = true;

    public static void main(String[] args) {

        test();
        out();

        test();
        out();

        test();
        out();

        test();
        out();

        test();
        out();

        test();
        out();

        test();
        out();

        test();
        out();

        test();
        out();
    }
        public static boolean test(){
            String original = "";
            String reverse = "";

            System.out.println("Enter a string to check if it is a palindrome");

            Scanner in = new Scanner(System.in);
            original = in.nextLine();


            original = original.replaceAll("[,]", "");
            original = original.replaceAll("[?]", "");
            original = original.replaceAll("[.]", "");
            original = original.replaceAll("[:]", "");
            original = original.replaceAll(" ", "");

            original = original.toLowerCase();

            int length = original.length();

            for (int i = length - 1; i >= 0; i--) {
                reverse = reverse + original.charAt(i);
            }

            if (original.equals(reverse))
                return(palindrome = true);
            else
                return(palindrome = false);

        }
        public static void out(){if (palindrome)
            System.out.println("The string is a palindrome.");
        else if (palindrome == false)
            System.out.println("The string isn't a palindrome.");}

    }

