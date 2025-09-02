Assignment - 1

class Vehicle{
      void start(){
          System.out.println("Vehicle started : ");
      }
}
class Car extends Vehicle{
     @Override
     void start(){
         System.out.println("Car started : ");
     }
}
class Motorcycle extends Vehicle{
     @Override
     void start(){
         System.out.println("Motorcycle started : ");
     }
}
class Garage{
     void serviceVehicle(Vehicle Vehicle){
        Vehicle.start();
        System.out.println("Vehicle serviced");
     }
}
public class VehicleMain{
    public static void main(String[] args){
       Car car = new Car();
       Motorcycle motorcycle = new Motorcycle();
       Garage garage = new Garage();
       
       garage.serviceVehicle(car);
       garage.serviceVehicle(motorcycle);
    }
}

Assignment - 2

class Student{
   String name;
   int age;
   String department;

   Student(){
       this.name = "Unknown";
       this.age = 20;
       this.department = "Unassigned";
   }
   Student(String name, int age){
       this.name = name;
       this.age = age;
       this.department = "IT";
   }
   Student(String name, int age, String department){
       this.name = name;
       this.age = age;
       this.department = department;
   }

void printDetail(){
      System.out.println("Name : " + name + ", Age : " + age + ", Department : " + department);
   }
}
public class SchoolMain{
    public static void main(String[] args){
       Student s1 = new Student();
       Student s2 = new Student("Shinchan", 20);
       Student s3 = new Student("Doremon", 20 , "CSE");

       s1.printDetail();
       s2.printDetail();
       s3.printDetail();
    }
}