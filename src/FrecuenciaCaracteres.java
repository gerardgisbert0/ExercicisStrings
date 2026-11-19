public class FrecuenciaCaracteres {
    public static void main(String[] args) {

        String texto = "google.com";

        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (texto.charAt(j) == letra) {
                    repetido = true;
                }
            }

            if (!repetido) {

                int contador = 0;

                for (int j = 0; j < texto.length(); j++) {
                    if (texto.charAt(j) == letra) {
                        contador++;
                    }
                }

                System.out.println(letra + ": " + contador);
            }
        }
    }
}

