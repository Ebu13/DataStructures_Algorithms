import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Ekle");
            System.out.println("2. Sil");
            System.out.println("3. Sırala");
            System.out.println("0. Çıkış");
            System.out.print("Seçenek girin: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Eklenecek değeri girin: ");
                    int insertValue = scanner.nextInt();
                    tree.insert(insertValue);
                    break;
                case 2:
                    System.out.print("Silinecek değeri girin: ");
                    int deleteValue = scanner.nextInt();
                    tree.delete(deleteValue);
                    break;
                case 3:
                    System.out.println("Sıralı liste:");
                    tree.inorder();
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçenek, tekrar deneyin.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
