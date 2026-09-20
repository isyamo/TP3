public class Tab {
    static void affiche(double t[][]) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++)
                System.out.print(t[i][j] + " ");
            System.out.println();
        }
    }

    static boolean regulier(double t[][]) {
        for (int i = 1; i < t.length; i++)
            if (t[i].length!= t[0].length) return false;
        return true;
    }

    static double[] sommeLignes(double t[][]) {
        double[] r = new double[t.length];
        for (int i = 0; i < t.length; i++)
            for (int j = 0; j < t[i].length; j++)
                r[i] += t[i][j];
        return r;
    }

    static double[][] somme(double[][] a, double[][] b) {
        if (!regulier(a) ||!regulier(b)) return null;
        if (a.length!= b.length || a[0].length!= b[0].length) return null;
        double[][] r = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                r[i][j] = a[i][j] + b[i][j];
        return r;
    }

    public static void main(String[] args) {
        double[][] a = {{1, 2, 3}, {4, 5, 6}};
        double[][] b = {{1, 1, 1}, {1, 1, 1}};

        System.out.println("Tableau a :");
        affiche(a);

        System.out.println("Regulier? " + regulier(a));

        double[] s = sommeLignes(a);
        System.out.println("Somme lignes : " + s[0] + " et " + s[1]);

        System.out.println("Somme a+b :");
        affiche(somme(a, b));
    }
}
