package sortingAlgos;

public class InsertionSort {
   public static void main(String[] args) {
    int[] arr={2,1,8,3,6,2,9};
    insertionSort(arr);
    for (int i : arr) {
        System.out.print(i+" ");
    }
   }
   public static void insertionSort(int[] arr){
    for (int i = 1; i < arr.length; i++) {
        int temp =arr[i];
        int j =i-1;
        while (j>=0&& arr[j]>temp) {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;     
    }
   }
}
