import java.util.Scanner;
public class NumberGuessingGame {

    
  
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int number = (int)(Math.random()*100) + 1; // Math.random() generate a pseudorandom double value that is greater than or equal to 0.0 and less than 1.0. We add +1 to have numbers between 0-100
      int guess = 0;

      System.out.println("Number Guessing Game\n");

      while (guess != number){
        System.out.print("Enter your guess between 1 and 100: ");
        guess = scanner.nextInt();

        if(guess < number)
          System.out.println("Too low!");
        else if (guess > number)
          System.out.println("Too high!");
        else
          System.out.println("Correct!");
      }
 
      scanner.close();
    }
    
}
