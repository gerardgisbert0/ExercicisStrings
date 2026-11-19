import java.util.Scanner;

public class Reversed {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto:");
        String text = sc.nextLine();

        String invertido = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            invertido = invertido + text.charAt(i);
        }

        System.out.println("Texto invertido: " + invertido);
    }
}

