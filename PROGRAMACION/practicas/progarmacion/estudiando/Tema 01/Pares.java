public class Pares {
    public static void main(String[] args) {

        int pairnumber = 0;

        while (pairnumber <= 100) {

            if (pairnumber % 2 == 1) {
            
                System.out.println(pairnumber);
                pairnumber = pairnumber + 2;

            } else { pairnumber ++;}     

        }
    }
}