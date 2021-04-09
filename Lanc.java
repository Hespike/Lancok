public class Lanc {
    static int lanc(Kapcsolat[] kapcsolatok, int darabszam) {
        int[] tomb = new int[darabszam + 1];

        for (int i = 0; i < darabszam - 1; i++) {
            tomb[kapcsolatok[i].lancszem1]++;
            tomb[kapcsolatok[i].lancszem2]++;
        }

        int osszeg = 0;
        for (int i = 0; i < darabszam + 1; i++) {
            if (tomb[i] > 2) {
                osszeg += tomb[i] - 2;
            }
        }

        return osszeg;
    }
}
