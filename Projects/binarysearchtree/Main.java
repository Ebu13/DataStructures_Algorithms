import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();

        int choice;

        do {
            System.out.println("\nBinary Search Tree Operations:");
            System.out.println("1. Insert a node");
            System.out.println("2. Delete a node");
            System.out.println("3. Display InOrder");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to insert: ");
                    int insertValue = scanner.nextInt();
                    tree.insert(insertValue);
                    break;

                case 2:
                    System.out.print("Enter the value to delete: ");
                    int deleteValue = scanner.nextInt();
                    tree.delete(deleteValue);
                    break;

                case 3:
                    System.out.println("InOrder: " + tree.inOrder());
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
