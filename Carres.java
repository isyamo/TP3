
import java.util.Scanner;

    public class Carres {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Combien de valeurs : ");
        int n = s.nextInt();

        int nombre = 1;

        for (int i = 0; i < n; i++) {
            int carre = nombre * nombre;
            System.out.println(nombre + " a pour carre " + carre);
            nombre = nombre + 2;
        }
    }
}

