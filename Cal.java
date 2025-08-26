class Calc{
         int a ;
         int b ;
         int c ;
         double d ;
         double e ;
 
     static int add1(int a , int b){
        return a + b;
     }
 
     static int add2(int a , int b, int c){
        return a + b + c;
     }

     public double add3(double d , double e){
        return d + e;
     }     
}


public class Cal{
       public static void main(String[] args) {

        Calc cal = new Calc();

        int sum1 = Calc.add1(5, 3);
        System.out.println("sum of two interger : " + sum1); 

        int sum2 = Calc.add2(3, 6, 9);
        System.out.println("sum of three integer : " + sum2); 

        double sum3 = cal.add3(2.6 , 4.7);
        System.out.println("sum of two double : " + sum3); 

   }

}