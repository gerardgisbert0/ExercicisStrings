import java.util.Scanner;

public class SearchBook2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] catalogo = {
                "Los muertos vivientes",
                "Brevisima historia del tiempo",
                "La clave secreta del universo",
                "Mi universo",
                "Patria",
                "De mayor quiero ser feliz",
                "Empieza por los zapatos"
        };

        System.out.println("Bienvenido a nuestra biblioteca");
        System.out.println("Escribe una palabra o palabras del titulo:");

        String buscar = sc.nextLine().toLowerCase();

        for (int i = 0; i < catalogo.length; i++) {
            if (catalogo[i].toLowerCase().contains(buscar)) {
                System.out.println(catalogo[i]);
            }
        }
    }
}

