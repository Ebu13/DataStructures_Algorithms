// Dynamic Arrays App


import java.util.Scanner;

public class Main {
    public static boolean cikis =true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secim;
        System.out.println("Sisteme Hoşgeldiniz\n\n");
        Array array = new Array(1);
        while (cikis){
            System.out.print("\n1.Sona Ekle\n2.Çıkar\n3.Diziyi Yazdır\n4.Ara\n5.Çıkış\n\nSecim = ");
            secim=scanner.nextInt();
            switch (secim) {
                case 1 :
                    //Ekleme
                    System.out.println("Eklenecek sayıyı gir = ");
                    array.sonaekle(scanner.nextInt());
                    break;
                case 2 :
                    //Çıkarma
                    System.out.println("Çıkarılacak sayiyi gir = ");
                    array.sil(scanner.nextInt());
                    break;
                case 3 :
                    //Yazdırma
                    array.yazdir();
                    break;
                case 4 :
                    //Arama
                    System.out.println("Aranacak sayıyı gir = ");
                    boolean sonuc = array.dizideara(scanner.nextInt());
                    System.out.println("Arama Çalışıyor.");
                    if (sonuc){
                        System.out.println("Bulundu.");
                    }else {
                        System.out.println("Bulunamadı.");
                    }
                    break;
                case 5 :
                    //Çıkış
                    System.out.println("Çıkış Yapılıyor.");
                    cikis=false;
                    break;

                default:
                    System.out.println("Yanlış tuşlama yaptınız.");
            }
        }
        scanner.close();
    }
}