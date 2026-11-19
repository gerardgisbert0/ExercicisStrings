public class Classroom1 {
    public static void main(String[] args) {

        String[] alumnos = {
                "Gerard", "Marc", "Pau", "Alex", "Jordi"
        };

        for (int i = 0; i < alumnos.length; i++) {

            System.out.print(alumnos[i]);

            if (i < alumnos.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}

