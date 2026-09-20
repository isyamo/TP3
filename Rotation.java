import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Lecture de la taille N et création du tableau
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                a[i][j] = sc.nextInt();
            }
        }

        //  échange a[i][j] et a[j][i]
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = tmp;
            }
        }

        // échange le début et la fin de chaque ligne
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = a[i][j];
                a[i][j] = a[i][n - 1 - j];
                a[i][n - 1 - j] = tmp;
            }
        }

        //  Affichage du résultat
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
        
    }
}