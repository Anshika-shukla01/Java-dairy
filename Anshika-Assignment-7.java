class Vehicle{
     String make;
     String model;
     int year;
     int maxispeed;
  
    Vehicle(String make, String model, int year, int maxispeed){
        this.make = make;
        this.model = model;
        this.year = year;
        this.maxispeed = maxispeed;
    }
 
    void drive(){
       System.out.println("Vehicle is Driving");
    }
    public void printDetail(){
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("year : " + year);
        System.out.println("maxispeed : " + maxispeed);
    }
}
class Car extends Vehicle{
    Car(String make, String model, int year, int maxispeed){
         super(make , model, year, maxispeed);
    }
   void drive(){
      System.out.println(make + " " + model + "Car is Driving");
   }
}
class Bike extends Vehicle{
     Bike(String make, String model, int year, int maxispeed){
         super(make, model, year, maxispeed);
     }

     void drive(){
        System.out.println(make + " " + model + "Bike is Driving");
     }
}
public class Main{
    public static void main(String[] args){
         Car car = new Car("KIA", "Syros", 2024, 180 );
         car.printDetail();
         car.drive();

         System.out.println();

         Bike bike = new Bike("HERO", "HDSHDS" , 2024, 180);
         bike.printDetail();
         bike.drive();
    }
}