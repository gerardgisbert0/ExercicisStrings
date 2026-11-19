public class MiniAhorcado1 {
    public static void main(String[] args) {

        String palabra = "Forrest Gump";

        System.out.println("Bienvenido al Mini juego del ahorcado");
        System.out.println("Intenta adivinar la pelicula");

        for (int i = 0; i < palabra.length(); i++) {

            if (i == 0) {
                System.out.print(palabra.charAt(i));
            } else if (palabra.charAt(i) == ' ') {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }

        System.out.println();
    }
}

