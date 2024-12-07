public class LongestSubarrayWithGivenSumK {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9};
        int k = 15;
        int longest= findLongestSubArray(arr,k);
        System.out.println(longest);
    }

    public static int findLongestSubArray(int [] arr,int k){
        int max= 0;
        for (int i = 0; i < arr.length; i++) {
            int sum =0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if (sum==k) {
                    max = Math.max(max, j-i+1);
                }
            }
        }
        return max;
    }
}
