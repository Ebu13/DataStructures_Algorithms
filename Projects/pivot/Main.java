package main;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int Enazislem = Integer.MAX_VALUE;//Her defasında karşılaştırma olduğu için en büyük değer verilmesi lazımdı.0 verince işlem sayısı hep 0 ya da değer vermeyince yine 0
        int ipivot = -1;
        int[] dizi = new int[100];
        int[] pivots = {0, 9, 19, 29, 39, 49, 59, 69, 79, 89, 99};
        for (int i = 0; i < 100; i++) {
            dizi[i] = random.nextInt(100);
        }

        //Yukarısı rastgele 100 elemanlı dizi oluşturma
        for (int p : pivots) {
            int pivot = dizi[p];
            int i = 0;
            int j = dizi.length - 1;
            while (i <= j) {
                while (dizi[i] < pivot) {
                    i++;
                }
                while (dizi[j] > pivot) {
                    j--;
                }
                if (i <= j) {
                    int temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                    i++;
                    j--;
                }
            }
            int islemsayisi = i;

            //en az işlem sayılı olan pivotu ve o pivota ait işlem sayısını buluyor
            if (islemsayisi < Enazislem) {
                Enazislem = islemsayisi;
                ipivot = p;
            }
            switch (p) {
            case 0 ->
                System.out.println("Pivot ilk eleman olunca islem sayisi :" + islemsayisi );
            case 99 ->
                System.out.println("Pivot son eleman olunca islem sayisi :" + islemsayisi );
            default ->
                System.out.println("Pivot % " + (p+1) + ". eleman olunca islem sayisi :" + islemsayisi );
        }
        }
        System.out.println("\n\n");
        switch (ipivot) {
            case 0 ->
                System.out.println("Pivot ilk eleman olunca islem sayisi en azdir.\n" + Enazislem + " tane islem yapildi.");
            case 99 ->
                System.out.println("Pivot son eleman olunca islem sayisi en azdir.\n" + Enazislem + " tane islem yapildi.");
            default ->
                System.out.println("Pivot % " + (ipivot + 1) + ". eleman olunca islem sayisi en azdir.\n" + Enazislem + " tane islem yapildi.");
        }

    }

}
