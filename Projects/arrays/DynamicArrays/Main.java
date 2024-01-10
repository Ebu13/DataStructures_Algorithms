import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DynamicArraysOperation arraysOperation = new DynamicArraysOperation();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1- Eleman Ekle");
            System.out.println("2- Eleman Sil");
            System.out.println("3- Diziyi Yazdır");
            System.out.println("4- Çıkış");
            System.out.print("Seçiminiz: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Eklemek istediğiniz sayıyı giriniz: ");
                    int eleman = scanner.nextInt();
                    arraysOperation.elemanekle(eleman);
                    break;
                case 2:
                    arraysOperation.elemansil();
                    break;
                case 3:
                    arraysOperation.yazdir();
                    break;
                case 4:
                    System.out.println("Programdan çıkılıyor.");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
            }
        }
    }
}
