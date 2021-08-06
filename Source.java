import java.util.*;

public class Source {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
       }
       partitionNegativeAndPositive(n, arr);
   }

   // Method to partition negative and positive numbers without comparing with 0
   static void partitionNegativeAndPositive(int n, int arr[]) {
      // Write your code here
      int temparr1[]=new int[n];

      int temparr2[]=new int[n];

      int pos=0;
      
      for(i=0;i<=n;i++){
          
         if(arr[i]^arr[i+1]){
             temparr1[pos]=arr[i];
             pos++;
    }
    else{
        temparr2[pos]=arr[i];
        pos++;

    }
      }
      System.out.println(temparr1+" "+temparr2);
   }
}
