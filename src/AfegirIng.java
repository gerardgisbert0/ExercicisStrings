import java.util.Scanner;

public class AfegirIng {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix una cadena:");
        String text = sc.nextLine();

        if (text.length() >= 3) {

            if (text.endsWith("ing")) {
                text = text + "ly";
            } else {
                text = text + "ing";
            }
        }

        System.out.println("Resultat: " + text);
    }
}
