import java.util.Scanner;

public class PrimersUltims {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix una cadena:");
        String text = sc.nextLine();

        String resultat = "";

        if (text.length() >= 2) {
            resultat = text.substring(0, 2) +
                    text.substring(text.length() - 2);
        }

        System.out.println("Resultat: " + resultat);
    }
}

