// Import the Scanner class for reading input from the user
import java.util.Scanner;

// Define the Diamond class
public class Diamond {
  public static void main(String[] args) {
    // Create a Scanner object for reading user input
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the size of the diamond
    System.out.print("Enter the size of the diamond: ");

    // Read the user input and store it in the 'size' variable
    int size = input.nextInt();
      if(size < 2){
          System.out.println("Invalid size");
          System.exit(0);
        }
      // Calculate the maximum number of rows in the diamond
      int maxRows = size ;

      // Calculate the index of the middle row of the diamond
      int middleRow = maxRows / 2;

      // If the size of the diamond is even, adjust the maximum number of rows and the index of the middle row
      if (size % 2 == 0) {
         maxRows = size + 3;
         middleRow = (size / 2) + 1; ;


               // Loop through each row of the diamond
        for (int row = 0 ; row < maxRows; row++) {
          int spaces = Math.abs(middleRow - row);







          for (int col = 0; col < spaces; col++) {
            if( col == middleRow) {
              System.out.print("  ");
            }else if(row == 1){
              System.out.print("  ");
            }else if(row == maxRows){
              System.out.print("  ");
            }

            else{
              System.out.print( "  ");
            }

          }
          if(row == 1) {
            System.out.print("*");
            System.out.println();
          }else if(row == size + 1) {
            System.out.print("*");
            System.out.println();
          }
          else{


          int asterisks = size - spaces * 2;


          // Print the necessary number of asterisks in the current row
          for (int col = 0; col < asterisks * 2; col++) {



             if(col % 2 == 0 || col == 0) {

              System.out.print(" *");
              }


          }

          // Move to the next line to start the next row
          System.out.println();


    }
  }
      }

      // Loop through each row of the diamond
      if(size % 2 != 0){
        for (int row = 0; row < maxRows; row++) {
          // Calculate the number of spaces needed before the first asterisk in the current row
          int spaces = Math.abs(middleRow - row);

          // Print the necessary number of spaces before the first asterisk
          for (int col = 0; col < spaces; col++) {
              System.out.print(" ");
          }

          // Calculate the number of asterisks needed in the current row
          int asterisks = size - spaces * 2;

          // Print the necessary number of asterisks in the current row
          for (int col = 0; col < asterisks; col++) {
              System.out.print("*");
          }

          // Move to the next line to start the next row
          System.out.println();
      }
    }
      // Close the Scanner object to prevent resource leak
      input.close();
  }
}


