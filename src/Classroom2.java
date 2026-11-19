import java.util.Scanner;

public class Classroom2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] alumnos = {
                "Gerard", "Marc", "Pau", "Alex", "Jordi"
        };

        System.out.println("Introduce la posicion que quieres cambiar:");
        int posicion = sc.nextInt();
        sc.nextLine();

        if (posicion >= 0 && posicion < alumnos.length) {

            System.out.println("Nombre actual: " + alumnos[posicion]);

            System.out.println("Introduce el nuevo nombre:");
            String nombre = sc.nextLine();

            alumnos[posicion] = nombre;

            System.out.println("Nueva lista:");

            for (int i = 0; i < alumnos.length; i++) {

                System.out.print(alumnos[i]);

                if (i < alumnos.length - 1) {
                    System.out.print(", ");
                }
            }

        } else {
            System.out.println("La posicion no existe");
        }
    }
}

