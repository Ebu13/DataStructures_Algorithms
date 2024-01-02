import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        System.out.println("Sistemimize Hoşgeldiniz...");
        int secim;
        boolean cikis = true;
        while (cikis) {
            System.out.print("\n1.Öne Ekle\n2.Sona Ekle\n3.Önce Ekle\n4.Sonra Ekle\n5.Yazdir\n6.Bul\n7.Çıkış\nSeçimin = ");
            secim=scanner.nextInt();
            switch (secim){
                case 1 :
                    System.out.print("\nÖne Eklenecek Sayıyı Gir = ");
                    list.OneEkle(scanner.nextInt());
                    break;
                case 2 :
                    System.out.print("\nSona Eklenecek Sayıyı Gir = ");
                    list.SonaEkle(scanner.nextInt());
                    break;
                case 3 :
                    System.out.print("\nÖnce Eklenecek Sayıyı Gir = ");
                    int eklenecek=scanner.nextInt();
                    System.out.print("\nHangi Sayıdan Önce Eklensin = ");
                    int hangi = scanner.nextInt();
                    list.OnceEkle(list.Bul(eklenecek),hangi);
                    break;
                case 4 :
                    System.out.print("\nÖnce Eklenecek Sayıyı Gir = ");
                    int eklen=scanner.nextInt();
                    System.out.print("\nHangi Sayıdan Sonra Eklensin = ");
                    int han = scanner.nextInt();
                    list.SonraEkle(list.Bul(han),eklen);
                    break;
                case 5 :
                    list.Yazdir();
                    break;
                case 6 :
                    System.out.print("\nBulunacak Sayıyı Gir = ");
                    int bulunacaksayi=scanner.nextInt();
                    if (list.Bul(bulunacaksayi)!=(null)){
                        System.out.println("Sayı Bulundu..");
                    }else {
                        System.out.println("Bulunamadı..");
                    }
                    break;
                case 7 :
                    System.out.print("\nÇıkış Yapılıyor..");
                    cikis=false;
                    break;
            }
        }
    }
}