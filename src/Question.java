import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Indica cual de las siguientes opciones no es un tipo primitivo en Java:");
        System.out.println("a. int");
        System.out.println("b. char");
        System.out.println("c. boolean");
        System.out.println("d. String");

        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("d")) {
            System.out.println("Respuesta correcta!");
        } else if (resposta.equalsIgnoreCase("a") ||
                resposta.equalsIgnoreCase("b") ||
                resposta.equalsIgnoreCase("c")) {
            System.out.println("Respuesta incorrecta, la respuesta correcta es: d");
        } else {
            System.out.println("Respuesta no valida: a, b, c, d");
        }
    }
}

