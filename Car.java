import java.util.Scanner;
class Car{
      String make ;
      String model ;
      Short year ;
      int price ;
 
     public Car(String make , String model , Short year , int price ){
           this.make = make;
           this.model = model;
           this.year = year;
           this.price = price;
     }

     public void displayDetail(){
        System.out.println("make" + make);
        System.out.println("model" + model);
        System.out.println("year" + year);
        System.out.println("price" + price);

     }
}

public class Main{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter make: " + make);
       String make = sc.nextLine();

       System.out.println("Enter model: " + model);
       String model = sc.nextLine();

       System.out.println("Enter year : " + year);
       Short year = sc.nextLine();

       System.out.println("Enter price: " + price);
       int price = sc.nextLine();

  }
}