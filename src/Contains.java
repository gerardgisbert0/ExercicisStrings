import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix un text:");
        String text = sc.nextLine();

        if (text.isEmpty()) {
            System.out.println("El text esta buit");
        } else {
            System.out.println("Introdueix una paraula:");
            String paraula = sc.nextLine();

            if (text.contains(paraula)) {
                System.out.println("Paraula trobada");
            } else {
                System.out.println("Paraula no trobada");
            }
        }
    }
}

