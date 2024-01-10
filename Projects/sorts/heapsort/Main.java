import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here

        int[] dizi = new int[7];

        int lastindex = 0;

        while (lastindex < 7) {
            System.out.println("Lütfen bir sayı giriniz");
            Scanner sc = new Scanner(System.in);

            int sayi = sc.nextInt();

            if (lastindex == 0) {
                dizi[0] = sayi;
            } else {
                dizi[lastindex] = sayi;

                int parentindex = (lastindex - 1) / 2;
                int currentindex = lastindex;

                while (sayi < dizi[parentindex]) {
                    dizi[currentindex] = dizi[parentindex];
                    dizi[parentindex] = sayi;
                    currentindex = parentindex;
                    parentindex = (parentindex - 1) / 2;
                }

            }

            lastindex += 1;
        }

        for (int i = 0; i < 7; i++) {
            System.out.print(Integer.toString(dizi[i]) + "  ");
        }

        System.out.println("");
        System.out.println("Heap Sort:");

        int[] siralidizi = new int[7];
        int i = 0;
        while (lastindex > 0) {
            lastindex -= 1;
            siralidizi[i] = dizi[0];

            dizi[0] = dizi[lastindex];

            int sonindex = 0;
            int sayi1 = dizi[sonindex];

            int cocuk1 = dizi[(sonindex+1)*2 -1];
            int cocuk2 = dizi[(sonindex+1)*2];

            while (sayi1 > cocuk1 || sayi1 > cocuk2) {
                if (cocuk1 < cocuk2) {
                    dizi[sonindex] = cocuk1;
                    dizi[(sonindex+1)*2 -1] = sayi1;
                    sonindex = (sonindex+1)*2 -1;
                }
                else
                {
                    dizi[sonindex] = cocuk2;
                    dizi[(sonindex+1)*2] = sayi1;
                    sonindex = (sonindex+1)*2;
                }

                if( (sonindex+1)*2 -1 < lastindex)
                {
                    cocuk1 = dizi[(sonindex+1)*2 -1];
                }
                else
                {
                    cocuk1 = 100000;
                }
                if( (sonindex+1)*2 < lastindex)
                {
                    cocuk2 = dizi[(sonindex+1)*2];
                }
                else
                {
                    cocuk2 = 100000;
                }
            }
            i += 1;
        }
        for (int j = 0; j < 7; j++) {
            System.out.print(Integer.toString(siralidizi[j]) + "  ");
        }
    }
}