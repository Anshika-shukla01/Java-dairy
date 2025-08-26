Assignment - 1
-----------------------------------
import java.util.Scanner;

class BankAccount {
    String accountHolderName;
    String bankName;
    double accountBalance;

    BankAccount(String name, String bank, double balance) {
       accountHolderName = name;
       bankName = bank;
       accountBalance = balance;
   }

    double getBalance() {
        return accountBalance;
    }

    void deposit(double amount) {
        accountBalance += amount;
        System.out.println(amount + " deposited. New balance = " + accountBalance);
    }

    void withdraw(double amount) {
        if(amount <= accountBalance) {
             accountBalance -= amount;
             System.out.println(amount + " withdrawn. New Balance = " + accountBalance);
        } else {
             System.out.println("Not enough balance ! ");
        }
    }
}

public class BankMain {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter Account Holder Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Bank Name : ");
            String bank = sc.nextLine();

            System.out.println("Enter Initial balance : ");
            double balance = sc.nextDouble();

            BankAccount acc = new BankAccount(name, bank, balance);

            System.out.print("Enter amount to deposit : ");
            double dep = sc.nextDouble();
            acc.deposit(dep);

            System.out.print("Enter amount to withdraw : ");
            double wd = sc.nextDouble();
            acc.withdraw(wd);

            System.out.println("FInal Balance + " + acc.getBalance());
      }
}


Assignment - 2
-----------------------------------
import java.util.Scanner;

class Animal{
       void makeSound() {
           System.out.println("The animal make a sound.");
       }
}

class Dog extends Animal {
      void makeSound() { 
           System.out.println("The dog barks.");
      }
}

class Cat extends Animal{
     void makeSound() {
          System.out.println("The cat meows.");
     }
}

public class AnimalMain{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Choose an animal: 1. Dog  2. Cat  3. Animal : ");
         int choice = sc.nextInt();
         Animal a;
         
         if(choice == 1) {
             a = new Dog();
         } else if (choice == 2) {
             a = new Cat();
         } else {
             a = new Animal();
         }

         a.makeSound();
    }
}
