import java.util.Scanner;

public class Test{
   public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of array : ");
          int n = sc.nextInt();
         int[] arr = new int[n];
         System.out.println("Enter " + n + " element .");
         for(int i= 0; i<n; i++){
          arr[i] = sc.nextInt();
        }
         int sum = 0;
         for(int i= 0; i<n; i++){
           sum += arr[i];
        }
        double average = sum/n;
        System.out.println("Sum of array element : " + sum);
        System.out.println("Average of array element : " + average);
   }
}