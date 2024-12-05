package rough;

import java.util.Scanner;

//hashing
//for numbers
public class Test1 {
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
   