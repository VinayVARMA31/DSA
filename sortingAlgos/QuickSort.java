package sortingAlgos;
public class QuickSort {

    public static void main(String[] args) {
        int [] arr = {3,6,2,8,4,0};
        quickSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
    }
    public static void quickSort(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
