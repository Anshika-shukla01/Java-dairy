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

           }

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