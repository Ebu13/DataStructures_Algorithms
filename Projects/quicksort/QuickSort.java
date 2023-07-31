public class QuickSort {

    // değiştirme fonksiyonu
    static void degistir(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Bu işlev son elemanı pivot olarak alır, pivot elemanını
    //sıralanmış dizide doğru konumuna yerleştirir ve
    //tüm küçük (pivottan küçük) pivotun soluna ve
    //tüm büyük elemanları pivotun sağına yerleştirir.
    static int partition(int[] arr, int sol, int sag)
    {

        // pivot
        int pivot = arr[sag];

        //pivotun sağı
        int i = (sol - 1);

        for (int j = sol; j <= sag - 1; j++) {

            // eğer pivottan küçükse
            if (arr[j] < pivot) {

                //küçükse indexi artır
                i++;
                degistir(arr, i, j);
            }
        }
        degistir(arr, i + 1, sag);
        return (i + 1);
    }


    static void quickSort(int[] arr, int sol, int sag)
    {
        if (sol < sag) {

            int pi = partition(arr, sol, sag);

            //Öğeleri bölümlemeden önce ve bölmeden sonra ayrı ayrı sıralayın
            quickSort(arr, sol, pi - 1);
            quickSort(arr, pi + 1, sag);
        }
    }


    static void printArray(int[] arr, int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
