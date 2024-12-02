package searchingAlgos;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr ={2,7,5,8,5,1};
        int n =5;
        System.out.println(isPresent(arr,n));
    }
    public static boolean isPresent(int[] arr,int n){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==n) {
                return true;
            }
        }
        
        return false;
    }
}
