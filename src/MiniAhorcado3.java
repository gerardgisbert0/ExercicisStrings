import java.util.Scanner;

public class MiniAhorcado3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabra = "Forrest Gump";
        String descobertes = "F";

        int intents = 3;

        System.out.println("Bienvenido al Mini juego del ahorcado");
        System.out.println("Intenta adivinar la pelicula");

        for (int i = 0; i < intents; i++) {

            System.out.println("Introduce una letra:");
            String letra = sc.nextLine();

            descobertes = descobertes + letra;

            for (int j = 0; j < palabra.length(); j++) {

                String caracter = palabra.substring(j, j + 1);

                if (descobertes.toLowerCase().contains(caracter.toLowerCase())
                        || palabra.charAt(j) == ' ') {
                    System.out.print(caracter);
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}

