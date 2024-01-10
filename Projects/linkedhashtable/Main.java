import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NodeOp nodeOp = new NodeOp();
        boolean cikis=true;
        while (cikis) {
            System.out.println("\nMenu:");
            System.out.println("1. Ekle");
            System.out.println("2. Yazdir");
            System.out.println("3. Cikis");

            System.out.print("Seçim: ");
            int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Ekle sayiyi: ");
                        int numberToAdd = scanner.nextInt();
                        nodeOp.ekle(numberToAdd);
                        break;
                    case 2:
                        System.out.println("\nİçerik:\n");
                        nodeOp.yazdir();
                        break;
                    case 3:
                        System.out.println("Çıkılıyor..");
                        cikis = false;
                        break;
                    default:
                        System.out.println("Hatalı Seçim. Tekrar seç.");
                }
            }
    }
}
