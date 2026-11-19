import java.util.Scanner;

public class Longitud {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix una cadena:");
        String text = sc.nextLine();

        System.out.println("Longitud: " + text.length());
    }
}

