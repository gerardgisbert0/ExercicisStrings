import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto terminado en punto:");
        String texto = sc.nextLine();

        String[] palabras = texto.split(" ");

        int contadorVocales = 0;

        for (int i = 0; i < texto.length(); i++) {

            char letra = Character.toLowerCase(texto.charAt(i));

            if (letra == 'a' || letra == 'e' ||
                    letra == 'i' || letra == 'o' ||
                    letra == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("Numero de palabras: " + palabras.length);
        System.out.println("Numero de vocales: " + contadorVocales);
    }
}

