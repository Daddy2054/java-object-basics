package w1.method_basics.lab;

import java.util.Scanner;

public class LabHelperMethods {
static double input1;
static double input2;
static double input3;
static double input4;
  
/**
 * This method returns the difference in y values
 * 
 * @param y1 A double of the first y-coordinate
 * @param y2 A double of the second y-coordinate
 * @return The difference of y1 and y2 as a double
 */
public static double getRise(double y1, double y2) {
  return y2 - y1;
}

/**
 * This method returns the difference in x values
 * 
 * @param x1 A double of the first x-coordinate
 * @param x2 A double of the second x-coordinate
 * @return The difference of x1 and x2 as a double
 */
public static double getRun(double x1, double x2) {
  return x2 - x1;
} 

/**
 * This method returns the slope in decimal form
 * 
 * @param x1 A double of the first x-coordinate
 * @param y1 A double of the first y-coordinate
 * @param x2 A double of the second x-coordinate
 * @param y2 A double of the second y-coordinate
 * @return A double expression of the slope
 */
public static double getSlopeDecimal(double x1, double y1, 
                                     double x2, double y2) {
    return getRise(y1, y2) / getRun(x1, x2);
}

/**
 * This method returns the slop in fraction form
 * 
 * @param x1 A double of the first x-coordinate
 * @param y1 A double of the first y-coordinate
 * @param x2 A double of the second x-coordinate
 * @param y2 A double of the second y-coordinate
 * @return A String expression of the slope in rise / run format
 */
public static String getSlopeFraction(double x1, double y1, 
                                      double x2, double y2) {
    return getRise(y1, y2) + " / " + getRun(x1, x2);
}
  
public static void main(String args[]) {
  Scanner input = new Scanner (System.in);
  System.out.println("Enter first x coordinate: ");
  input1 = input.nextDouble();
  System.out.println("Enter first y coordinate: ");
  input2 = input.nextDouble();
  System.out.println("Enter second x coordinate: ");
  input3 = input.nextDouble();
  System.out.println("Enter second y coordinate: ");
  input4 = input.nextDouble();
  input.close();
  
  System.out.print("Rise: ");
  System.out.println(getRise(input2, input4));
  System.out.print("Run: ");
  System.out.println(getRun(input1, input3));
  System.out.print("Calculated form: ");
  System.out.println(getSlopeDecimal(input1, input2, input3, input4));
  System.out.print("Slope form: ");
  System.out.println(getSlopeFraction(input1, input2, input3, input4));
}
}
