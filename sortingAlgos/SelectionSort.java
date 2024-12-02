package sortingAlgos;

public class SelectionSort {
 public static void main(String[] args) {
    int arr[] = {3,8,52,8,3,5};
    selectionSort(arr);
    for (int i : arr) {
        System.out.print(i+" ");
    }
 }
 public static void selectionSort(int [] arr){
    for (int i = 0; i < arr.length-1; i++) {
        int min =i;
        for (int j = i+1; j < arr.length; j++) {
            if (arr[min]>arr[j]) {
                min=j;
            }
        }
        if (min!=i) {
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
 }
}
