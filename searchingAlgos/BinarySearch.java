package searchingAlgos;

public class BinarySearch {
  public static void main(String[] args) {
    int arr[]= {0,1,2,3,4,5,6,7,8,9};
    //The Array should always be in sorted form to work for binary search
    int n =4;
    System.out.println(isPresent(arr,n,0,arr.length-1));
  }
  public static boolean isPresent(int [] arr,int n,int start,int end){
   if(start>end) return false;
    int i=start;
    int j=end;
    int mid =(i+j)/2;
    if(arr[mid]==n) return true;

   if (n<arr[mid]) {
    return isPresent(arr, n, start, mid-1);
   } else {
    return isPresent(arr, n, mid+1, end);
   }
  // return false;
  }
}
