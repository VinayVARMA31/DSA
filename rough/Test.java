package rough;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//hashing
//there are limitations doing this type of hashing i.e it can store until 10^7 values
//for numbers
//array hashing
 class Test1 {
 public static void main(String[] args) {
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
        System.out.println("Enter the input: ");
        arr[i]=sc.nextInt();
    }
    int hash[] = new int[10];
    for (int j = 0; j < arr.length; j++) {
       int n = hash[arr[j]];
       n+=1;
       hash[arr[j]]=n;
    }
    for (int i = 0; i < hash.length; i++) {
        System.out.println(i+ ":" +hash[i]);
    }
    sc.close();
 }
}

//hashing for lowerCaseAlphabets
class Test2 {
    public static void main(String[] args) {
       char arr[] = new char[10];
       Scanner sc = new Scanner(System.in);
       for (int i = 0; i < arr.length; i++) {
           System.out.println("Enter the input: ");
           arr[i]=sc.next().charAt(0);
       }
       int hash[] = new int[26];
       for (int j = 0; j < arr.length; j++) {
          int n = hash[arr[j]-'a'];
          n+=1;
          hash[arr[j]-'a']=n;
       }
       for (int i = 0; i < hash.length; i++) {
        char c = (char)(97+i);
           System.out.println(c+ ":" +hash[i]);
       }
       sc.close();
    }
   }
   //now it's time for doing them using Hashmap
   class Test3{
      public static void main(String[] args) {
         Map<Integer,Integer> map = new HashMap<>();
         map.put(1, 5);
         map.put(2, 6);
         map.put(3, 7);
         map.put(4, 2);
         map.put(5, 4);

         //this works for the keys if they are present 
      //    int [] arr = {1,3,5};
      //   for (int i = 0; i < arr.length; i++) {
      //       map.put(arr[i], map.get(arr[i])+1);
      //   }

       //if there is no key to it will throw null pointer exception so we create a other way
       int[] arr = {1,3,5,6,22};
       for (int i = 0; i < arr.length; i++) {
           // Use getOrDefault() to handle non-existent keys
           map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
       }
        for (Map.Entry m : map.entrySet()) {
         System.out.println(m.getKey()+":"+m.getValue());
        }
        
     }
 }

     