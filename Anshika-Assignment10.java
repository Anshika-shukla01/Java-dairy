import java.util.Scanner;

class Test{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the element of x dimension : ");
     int x = sc.nextInt();
     System.out.println("Enter the element of y dimension : ");
     int y = sc.nextInt();
     System.out.println("Enter the element of z dimension : ");
     int z = sc.nextInt();
     
     int[][][] arr = new int[x][y][z];

     System.out.println("Enter the element of 3D array");
     for(int i = 0; i< x; i++){
         for(int j = 0; j < y; j++){
             for(int k = 0; k < z; k++){
                 System.out.println("Enter at arr [ " + i + " ] [ " + j + " ] [ " + k + " ] : ");
                 arr[i][j][k] = sc.nextInt();
            }
         }
     }
      int sum = 0;
      int max = arr[0][0][0];
      int count = 0;

      for(int i = 0; i < x; i++){
         for(int j = 0; j < y; j++){
            for(int k = 0; k < z; k++){
               sum += arr[i][j][k];
               if(arr[i][j][k] > max){
                    max = arr[i][j][k];
               }
               count++;
            }
         }
      }
       double average = sum/count;

       System.out.println("\nSum of all element : " + sum);
       System.out.println("Average of all element : " + average);
       System.out.println("Maximum element : " + max);
  }
}