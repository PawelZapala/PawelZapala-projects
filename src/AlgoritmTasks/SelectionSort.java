package AlgoritmTasks;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String a[]) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Before Selection Sort");
        System.out.println(Arrays.toString(arr));

        System.out.println();

        selectionSort(arr);

        System.out.println("After Selection Sort");
        System.out.println(Arrays.toString(arr));
    }
}
