package sortingAlgos;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int [] arr= {2,5,8,35,1,9};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int [] arr,int start,int end){
        if (start>=end) return;
        int i=start;
        int j=end;
        int mid= arr[(start+end)/2];
        while(arr[i]<mid) i++;
        while(arr[j]>mid) j--;
        
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
        i++;
        j--;
        quickSort(arr, i, end);
        quickSort(arr, start, j);
     
    }
}
