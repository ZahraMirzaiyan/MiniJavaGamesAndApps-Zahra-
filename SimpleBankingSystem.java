import java.util.Scanner;
public class SimpleBankingSystem {

    
  
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Welcome to the Bank ");

      double balance = 1000;
      int option;
      double deposit;
      double withdraw;


      while(true){
        System.out.println("\nSelect an option:");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdraw money");
        System.out.println("4. Exit");
        System.out.print("Your option: ");
       option = scanner.nextInt();
       scanner.nextLine();
       
      

      switch (option) {
        case 1:
          System.out.printf("Your balance is: %.2f euro%n", balance);
          break;
        case 2:
          System.out.print("Enter amount: ");
          deposit = scanner.nextDouble();
          if (deposit > 0){
          balance += deposit;
          System.out.printf("Deposit successful. Your balance is: %.2f euro%n", balance);
          }
          else
            System.out.println("Enter a valid amount! ");
          break;
        case 3:
          System.out.print("Enter amount: ");
          withdraw = scanner.nextDouble();
          if (balance >= withdraw && withdraw > 0){
          balance -= withdraw;
          System.out.printf("Withdraw successful. Your balance is: %.2f euro%n", balance); 
          }
          else
            System.out.println("Invalid amount or insufficient balance.");
          break;

      
        case 4:
          System.out.println("Thanks.");
          scanner.close();
          return;
      }
      }
      

      
 

    }
    
}
