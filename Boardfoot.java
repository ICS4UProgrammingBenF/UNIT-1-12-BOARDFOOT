//import necessary libraries
import java.util.Scanner;

/**
* This program takes 2 user inputs and solves for the third
*
* @author  Ben Falsetto
* @version 1.0
* @since   2020-09-17
*/

public class boardfoot {
  public static void main(String[] args) {
    //declare variables
    double firstDim = 0;
    double secDim = 0;
    double thirdDim = 0;
    double volume = 0;
    boolean valid = false;
    
    //create the scanner
    Scanner scanner = new Scanner(System.in);
    
    do {
      //get the user's input's
      try {
        //get the first dimension
        System.out.print("Enter the first dimenstion: ");
        firstDim = scanner.nextDouble();
        
        //checking for correct inputs
        if (0 < firstDim || firstDim <= 12) {
          valid = true;
        } else {
          valid = false;
        }
        } catch(Exception e) {
          System.out.println("Invalid input. Try again");
        }
    } while (valid == false);
    
    //get the user's second dimension
    do {
      //get the user's input's
      try {
        //get the first dimension
        System.out.print("Enter the second dimenstion: ");
        secDim = scanner.nextDouble();
        
        //checking for correct inputs
        if (0 < secDim || secDim <= 12) {
          valid = true;
        } else {
          valid = false;
        }
        } catch(Exception e) {
          System.out.println("Invalid input. Try again");
        }
    } while (valid == false);
    
    //actually do the calculations now and print to the console
    System.out.println("The third dimension is: " + calcVol(firstDim, secDim) + " units");
  }
  
  /**
   * Calculate volume function.
  */
  public static double calcVol(double val1, double val2) {
    //calculating the 2d area
    double area = val1 * val2;
    
    //calculating the height
    double height = 144 / area;
    
    //return the height
    return height;
  }
}