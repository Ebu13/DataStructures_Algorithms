import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CLinkedList daireselBagli = new CLinkedList();
        boolean cikis=true;
        while (cikis) {
            System.out.println("\nMenü:");
            System.out.println("1. Ekle");
            System.out.println("2. Sil");
            System.out.println("3. Dugum Bul");
            System.out.println("4. Cikis");
            System.out.println("5. Yazdir");
            System.out.print("Seciminizi girin: ");
            int secim = 0;
            try {
                secim = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage()+"\nInvalid input. Please enter a valid integer.");
                scanner.nextLine();
                continue;
            }

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
                    if (daireselBagli.ara(aranacakDeger)!=null){
                        System.out.println("Bulundu");
                    }
                    break;

                case 4:
                    System.out.println("Programdan cikiliyor.");
                    cikis=false;
                    break;
                case 5:
                    daireselBagli.yazdir();
                    break;
                default:
                    System.out.println("Gecersiz secim. Lutfen tekrar deneyin.");
            }
        }
    }
}
