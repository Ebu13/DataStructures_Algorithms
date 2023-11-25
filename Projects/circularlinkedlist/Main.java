import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CLinkedList daireselBagli = new CLinkedList();

        while (true) {
            System.out.println("\nMenü:");
            System.out.println("1. Ekle");
            System.out.println("2. Sil");
            System.out.println("3. Dugum Bul");
            System.out.println("4. Cikis");
            System.out.print("Seciminizi girin: ");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Eklenecek degeri girin: ");
                    int eklenecekDeger = scanner.nextInt();
                    daireselBagli.Ekle(eklenecekDeger);
                    break;

                case 2:
                    System.out.print("Silinecek degeri girin: ");
                    int silinecekDeger = scanner.nextInt();
                    daireselBagli.Sil(silinecekDeger);
                    break;

                case 3:
                    System.out.print("Aranacak degeri girin: ");
                    int aranacakDeger = scanner.nextInt();
                    boolean bulundu = daireselBagli.DugumBul(aranacakDeger);
                    if (bulundu) {
                        System.out.println("Dugum bulundu.");
                    } else {
                        System.out.println("Dugum bulunamadi.");
                    }
                    break;

                case 4:
                    System.out.println("Programdan cikiliyor.");
                    System.exit(0);

                default:
                    System.out.println("Gecersiz secim. Lutfen tekrar deneyin.");
            }
        }
    }
}
