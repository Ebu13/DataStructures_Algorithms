public class MergeSort {

    // İlk alt dizi [p..m]
    // ikinci alt dizi [m+1..r]

    void merge(int arr[], int p, int m, int r)
    {
        // dizinin başlangıç noktaları
        int n1 = m - p + 1;
        int n2 = r - m;

        /* alt dizileri tanımla */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Dizinin elemanlarını alt dizilere kopyala*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[p + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];



        int i = 0, j = 0;

        // Karşılaştırma ve yer değiştirme
        int k = p;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //L de sıralama bozulduysa düzel
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        //R'de sıralama bozulduysa düzelt
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void divideandconquer(int arr[], int p, int r)
    {
        if (p < r) {
            // Orta noktayı bul
            int m = p + (r - p) / 2;

            // diziyi ikiye böl
            divideandconquer(arr, p, m);
            divideandconquer(arr, m + 1, r);

            // Sıralanmış dizileri birleştir
            merge(arr, p, m, r);
        }
    }


    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
