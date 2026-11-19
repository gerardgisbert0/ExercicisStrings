public class Substrings {
    public static void main(String[] args) {

        String path = "home/user/index.html";

        int punt = path.lastIndexOf('.');
        int barra = path.lastIndexOf('/');

        String extensio = path.substring(punt);
        String nom = path.substring(barra + 1, punt);

        System.out.println("Extensio: " + extensio);
        System.out.println("Nom: " + nom);
    }
}

