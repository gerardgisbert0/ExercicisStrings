public class ParaulaMesLlarga {
    public static void main(String[] args) {

        String[] paraules = {
                "casa", "ordinador", "cotxe", "programacio", "sol"
        };

        String mesLlarga = paraules[0];

        for (int i = 1; i < paraules.length; i++) {

            if (paraules[i].length() > mesLlarga.length()) {
                mesLlarga = paraules[i];
            }
        }

        System.out.println("Paraula mes llarga: " + mesLlarga);
        System.out.println("Longitud: " + mesLlarga.length());
    }
}

