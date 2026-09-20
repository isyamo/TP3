public class Harmonique {
    public static void main(String[] args) {
        int n = 1;
        double s = 0;

        for (int i = 1; i <= n; i++) {
            s += 1.0 / i;
            if (i == 1) System.out.print(i);
            else System.out.print(" + 1/" + i);
        }
        System.out.print(" = " + s);
    }
}