import java.util.Scanner;

public class SearchBook1 {
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
        System.out.println("Escribe el titulo del libro que quieres buscar:");

        String buscar = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < catalogo.length; i++) {
            if (catalogo[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Se ha localizado el libro");
        } else {
            System.out.println("No se ha localizado el libro");
        }
    }
}
