import java.util.Scanner;
import java.util.ArrayList;
public class ToDoListManager {

    
  
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    ArrayList<String> tasks = new ArrayList<String>();
    tasks.add("Study Java");
    tasks.add("Go to the gym");
    tasks.add("Buy groceries");
    int option;
    String addTask;
    int removeTask;

    while(true){
      System.out.println("\nSelect an option: ");
      System.out.println("1. Show tasks");
      System.out.println("2. Add task");
      System.out.println("3. Remove task");
      System.out.println("4. Exit");
      System.out.print("Insert your option: ");
      option = scanner.nextInt();
      scanner.nextLine();

      switch (option) {
        case 1:
          if (tasks.isEmpty())
            System.out.println("No task available");
          else {
            for(int i = 0; i < tasks.size(); i++)
              System.out.println((i + 1) + ". " + tasks.get(i));
          }
          break;

        case 2:
          System.out.print("Enter the task you want to add: ");
          addTask = scanner.nextLine();
          if (addTask.trim().isEmpty())
            System.out.println("Task cannot be empty");
          else{
            tasks.add(addTask);
          System.out.println("The task is added. The task list is now: " );
          }
          

          if (tasks.isEmpty())
            System.out.println("No task available");
          else {
            for(int i = 0; i < tasks.size(); i++)
              System.out.println((i + 1) + ". " + tasks.get(i));
          }
          break;

        case 3:
            System.out.print("Enter the number of the task you want to remove: ");
            removeTask = scanner.nextInt();
            if (removeTask > 0 && removeTask <= tasks.size()){
            tasks.remove(removeTask - 1);
            System.out.println("The task is removed. The task list is now: ");
            if (tasks.isEmpty())
              System.out.println("No task available");
            else {
              for(int i = 0; i < tasks.size(); i++)
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
            }
            else 
               System.out.println("Invalid number task");
            break; 

        case 4:
          scanner.close();
          return;
          
      }
    }
    

     
      

      
 

    }
    
}
