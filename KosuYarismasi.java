
public class KosuYarismasi {
    public static int enKucukBul(int[] dakika) {
        int min = 0;
        for (int i = 1; i < dakika.length; i++) {
            if (dakika[i] < dakika[min]) {
                min = i;
            }
        }
        return min;
    }
    public static void ogrenciGruplandirma(int[] dakikalar) {
        int[] gruplandirma = new int[3];

        for (int i = 0; i < dakikalar.length; i++) {
            if (dakikalar[i] >= 200 && dakikalar[i] <= 299) {
                gruplandirma[0]++;
            } else if (dakikalar[i] >= 300 && dakikalar[i] <= 399) {
                gruplandirma[1]++;
            } else {
                gruplandirma[2]++;
            }
        }
        System.out.println("A -> " + gruplandirma[0]);
        System.out.println("B -> " + gruplandirma[1]);
        System.out.println("C -> " + gruplandirma[2]);
    }
    public static void ilkUcOgrenciyiBul(String[] ogrenciler, int[] dakika) {
        int[] ilkUc = new int[3];

        int[] dakika2 = new int[dakika.length];
        for (int i = 0; i < dakika.length; i++) {
            dakika2[i] = dakika[i];
        }

        for (int i = 0; i < 3; i++) {
            int min = enKucukBul(dakika2);
            ilkUc[i] = min;
            dakika2[min] = 875806495;
        }

        for (int i = 0; i < 3; i++) {
            int indis = ilkUc[i];
            System.out.printf("%d.Öğrenci %s %ddk %n", (i + 1), ogrenciler[indis], dakika[indis]);
        }
    }


}
