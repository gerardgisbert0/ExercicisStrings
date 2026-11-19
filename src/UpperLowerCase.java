import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix un text:");
        String text = sc.nextLine();

        System.out.println("Majuscules: " + text.toUpperCase());
        System.out.println("Minuscules: " + text.toLowerCase());
    }
}

