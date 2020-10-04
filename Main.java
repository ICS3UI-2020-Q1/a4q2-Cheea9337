import java.util.Scanner;
/**
 * Keep running until a negative number is entered
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    int userNum;
    do{
      System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
      userNum = input.nextInt();
    }while(userNum > 0);

    // using a loop to keep asking the question
    while(userNum > 0){
      System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
    }
    System.out.println("All Done");
    
  }
}
