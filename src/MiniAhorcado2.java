import java.util.Scanner;

public class MiniAhorcado2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabra = "Forrest Gump";

        System.out.println("Bienvenido al Mini juego del ahorcado");
        System.out.println("Intenta adivinar la pelicula");

        System.out.println("F****** ****");

        System.out.println("Introduce una letra:");
        String letra = sc.nextLine();

        for (int i = 0; i < palabra.length(); i++) {

            String caracter = palabra.substring(i, i + 1);

            if (caracter.equalsIgnoreCase(letra) ||
                    i == 0 || palabra.charAt(i) == ' ') {
                System.out.print(caracter);
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}

