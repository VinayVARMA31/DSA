package sortingAlgos;

import java.util.Arrays;

public class MergeSort {
  public static void main(String[] args) {
    int arr[]={1,4,6,3,0,8,9};
    sort(arr);
    String s =Arrays.toString(arr);
    System.out.println(s);
  }
  public static void sort(int []arr){
    if(arr.length==1) return;
    int[] left = new int[arr.length/2];
    int[] right= new int[arr.length-left.length];

    for (int i = 0; i < left.length; i++) { left[i]=arr[i];}
    for (int i = 0; i < right.length; i++) { right[i]=arr[left.length+i];}

    sort(left);
    sort(right);
    merge(arr,left,right);
  }
  public static void merge(int [] arr,int [] left, int[]right){
      
    int i=0;
    int j=0;
    int k=0;
    while (left.length>i && right.length>j) {
        if (left[i]>right[j]) arr[k++]=right[j++];
        else arr[k++]=left[i++];
    }
   while(i<left.length) arr[k++]=left[i++];
   while(j<right.length) arr[k++]=right[j++];
  }
}
