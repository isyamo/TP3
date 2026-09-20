import java.util.Scanner;

public class Fenetre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] T = new int[n];
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
        }

        int[] freq = new int[100001];
        int distinct = 0;

        int totalFenettres = n - k + 1;
        int[] resultats = new int[totalFenettres];

        System.out.println("Fenêtres (taille " + k + ")");

        // Première fenêtre
        for (int i = 0; i < k; i++) {
            if (freq[T[i]] == 0) distinct++;
            freq[T[i]]++;
        }
        resultats[0] = distinct;

        // Affichage fenêtre 1
        System.out.print("[");
        for (int j = 0; j < k; j++) {
            System.out.print(T[j] + (j == k - 1 ? "" : " "));
        }
        System.out.println("] → " + distinct + " distincts");

        // Glissement de la fenêtre
        for (int i = k; i < n; i++) {
            freq[T[i - k]]--;
            if (freq[T[i - k]] == 0) distinct--;

            if (freq[T[i]] == 0) distinct++;
            freq[T[i]]++;

            int indexFenetre = i - k + 1;
            resultats[indexFenetre] = distinct;

            // Affichage des fenêtres suivantes
            System.out.print("[");
            for (int j = indexFenetre; j < indexFenetre + k; j++) {
                System.out.print(T[j] + (j == indexFenetre + k - 1 ? "" : " "));
            }
            System.out.println(" ] -> " + distinct + " distincts");
        }

        System.out.println("Sortie");
        for (int i = 0; i < totalFenettres; i++) {
            System.out.print(resultats[i] + (i == totalFenettres - 1 ? "" : " "));
        }
        System.out.println();

        sc.close();
    }
}