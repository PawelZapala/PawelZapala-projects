import java.util.Arrays;

public class BubbleSort {
        static void bubbleSort(int[] arr) {
           int n = arr.length;
           for(int i = 0; i < n; i++){
               for(int j = 1; j < (n-i); j++){
                   if(arr[j-1]>arr[j]){
                       int temp = arr[j-1];
                       arr[j-1] = arr[j];
                       arr[j] = temp;
                   }
               }
           }

}
        public static void main(String[] args) {
            int arr[] ={5,1,4,2,8,9};

            System.out.println("Array Before Bubble Sort");
                System.out.println(Arrays.toString(arr));

            System.out.println();

            bubbleSort(arr);

            System.out.println("Array After Bubble Sort");
            System.out.println(Arrays.toString(arr));
            }

        }
