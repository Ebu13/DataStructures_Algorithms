// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr = { 48, 13, 14, 22, 88, 65, 52, 49 };
        System.out.print("Sıralanmamış dizi:  ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        QuickSort.quickSort(arr, 0, arr.length - 1);
        System.out.print("\nSıralanmış dizi:    ");
        QuickSort.printArray(arr, arr.length);
    }
}