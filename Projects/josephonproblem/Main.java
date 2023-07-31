import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Circular liste = new Circular();
        System.out.println("Lütfen bir sayı giriniz");
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();
        for (int i = 1; i <= sayi; i++) {

            liste.Insert(i);
        }

        Node mevcut = liste.ilk;


        while(liste.Adet()>2)
        {
            liste.Sil(mevcut.next);

            mevcut = mevcut.next.next;

        }

        liste.Yazdir();

    }
}