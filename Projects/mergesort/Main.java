// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        int arr[] = { 89, 2, 56, 28, 92, 4, 16, 36, 95, 13, 125, 112, 1, 33, 29, 48 };

        System.out.println("Given Array");
        MergeSort.printArray(arr);

        MergeSort ob = new MergeSort();
        ob.divideandconquer(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        MergeSort.printArray(arr);
    }
}