
public class KosuYarismasi {
    private final int[] zamanlar;
    private final String[] isimler;

    public Maraton(int[] zamanlar, String[] isimler) {
        this.zamanlar = zamanlar;
        this.isimler = isimler;
    }
    public void getUcuncu() {
        int iknciEnIyi = getIkinci();
        int min = -1;
        for (int i = 0; i < zamanlar.length; i++) {
            if (i != iknciEnIyi && (min == -1 || zamanlar[i] < zamanlar[min])) {
                min = i;
            }
        }
        int eniyi = min;
        int ucuncuEnIyi = -1;

        for (int i = 0; i < zamanlar.length; i++) {
            if (i != iknciEnIyi && i != eniyi && (ucuncuEnIyi == -1 || zamanlar[i] < zamanlar[ucuncuEnIyi])) {
                ucuncuEnIyi = i;
            }
        }

        System.out.printf("Üçüncü : %s  %d'%n", isimler[ucuncuEnIyi], zamanlar[ucuncuEnIyi]);
    }
    public int getIkinci() {
        int enIyiDerece = getBirinci();
        int ikinciEnIyi = -1;

        for (int i = 0; i < zamanlar.length; i++) {
            if (i != enIyiDerece && (ikinciEnIyi == -1 || zamanlar[i] < zamanlar[ikinciEnIyi])) {
                ikinciEnIyi = i;
            }
        }
        System.out.printf("İkinci : %s %d'%n", isimler[ikinciEnIyi], zamanlar[ikinciEnIyi]);
        return ikinciEnIyi;
    }

    private int getBirinci() {
        int min = 0;
        for (int i = 1; i < zamanlar.length; i++) {
            if (zamanlar[i] < zamanlar[min]) {
                min = i;
            }
        }
        System.out.printf("Birinci: %s %d'%n", isimler[min], zamanlar[min]);
        return min;
    }


    public String[] getIsimler() {
        return isimler;
    }

    public int[] getZamanlar() {
        return zamanlar;
    }

    public void Siniflandir() {
        int[] siniflandirma = new int[3];

        for (int j : zamanlar) {
            if (j >= 200 && j <= 299) {siniflandirma[0]++;
            } else if (j >= 300 && j <= 399) {siniflandirma[1]++;
            } else {siniflandirma[2]++;
            }
        }
        System.out.println("A -> " +
                siniflandirma[0]);
        System.out.println("B -> " +
                siniflandirma[1]);
        System.out.println("C -> " +
                siniflandirma[2]);
    }
}
