public class FindNum {
  public static void main(String[] args) {
    int [] arr = {1,5,9,4,8,7};
     if(find(10, arr)) System.out.println("The number is found.");
     else System.out.println("The number is not found");

  }
  public static boolean find(int n,int [] arr){
     for (int i : arr) {
        if (n==i) {
            return true;
        }
     }
     return false;
  }
}
