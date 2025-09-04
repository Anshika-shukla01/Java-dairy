import java.util.Scanner;

class Animal{
    void makeSound(){
        System.out.println("The animal make a sound");
    }
}
class Dog extends Animal{
    void makeSound(){
         System.out.println("Dog barks");
    }
}
class Cat extends Animal{
     void makeSound(){
         System.out.println("Cat meows");
     }
}
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Choose an animal : ");
      System.out.println("1. Dog");
      System.out.println("2. Cat");
      System.out.println("3. New Animal");
      System.out.println("Enter choise : ");
      int choice = sc.nextInt();
      
     Animal animal;

     if(choice == 1) {
       Dog dog = new Dog();
       dog.makeSound();
     } else if(choice == 2){
       Cat cat = new Cat();
       cat.makeSound();
     } else {
       System.out.println("Animal not found...");
     }

   }
}