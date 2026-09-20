public class triangle {
    public static void main(String[] args) {
        int n = 4; 

        for (int i = 0; i < n; i++) {
            int nbEtoiles = 2 * i + 1;
            for (int j = 0; j < nbEtoiles; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    

