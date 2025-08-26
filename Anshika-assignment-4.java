Assignment - 1
---------------------------------

import java.util.Scanner;

public class ArmstronginRange{
       public static void printArmstrongNumber(int start , int end){
        for(int i = start; i <= end; i++){
           if(isArmstrong(i)){
              System.out.print(i + " ");
         }
      }
         System.out.println();
   }

   public static boolean isArmstrong(int num){
        int original = num;
        int sum = 0;
        int digits = countDigits(num);

       while(num > 0){
          int digit = num % 10;
          sum = sum + power(digit, digits);
          num = num / 10;
       }
          return sum == original;
  }

   public static int countDigits(int n){
          int count = 0;
          do{
             count++;
             n = n/ 10;
          }
          while(n > 0);
             return count;
  }

   public static int power(int b, int e){
       int result = 1;
       for( int i = 0; i< e; i++){
          result = result * b;
       }
       return result;
   }

   public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.print("Armstrong number start with : ");
         int start = sc.nextInt();

         System.out.print("Armstrong number end with : ");
         int end = sc.nextInt();

         System.out.print("Armstrong number between " + start + " and " + end + " are : ");
         printArmstrongNumber(start , end);

         sc.close();

   }
}

Assignment - 2
--------------------------

import java.util.Scanner;

public class GrosssaleryCalculator{
     public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        
       while(true){
          System.out.print("Enter employee salery : " );
           double basic = sc.nextDouble();
           Double HRA , DA , Gross;

           if( basic > 15000){
              HRA = 0.20 * basic;
              DA = 0.60 * basic;
           } else{
              HRA = 3000.0;
              DA = 0.70 * basic;

              Gross = basic + HRA + DA;

              System.out.println("Gross Salery = " + Gross);

              System.out.println("Enter -1 to continue with next employee else enter any number to exit : ");
              int choice = sc.nextInt();

              if(choice != -1){
                System.out.print("Exiting program ...");
                break;
              }
           }
       }      
   }
}