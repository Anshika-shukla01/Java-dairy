import java.util.Scanner;

public class SimpleCalculator{
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      try{
          System.out.println("Enter first number : ");
          double num1 = sc.nextDouble();

          System.out.println("Enter second number : ");
          double num2 = sc.nextDouble();
 
          System.out.println("Enter the operator (+, -, *, /) ;");
          char operator = sc.next().charAt(0);

         double result;
         switch(operator){
            case '+':
                result = num1 + num2;
                System.out.println("Result : " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result : " + result);
                break;
           case '*':
                result = num1 * num2;
                System.out.println("Result : " + result);
                break;
          case '/':
                if(num2 == 0 ){
                    System.out.println("Error: Division by zero is not allowed .");
                } else {
                    result = num1 / num2;
                    System.out.println("Result : " + result);
                }
                break;
               default:
                   System.out.println("Error : invalid operator, Please use +, -, *, / ");
         }
          } catch (Exception e){
              System.out.println("Error : invalid input , please enter numeric value.");
         }  finally{
            sc.close();
          }
      
   }
}