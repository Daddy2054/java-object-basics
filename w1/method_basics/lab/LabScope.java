package w1.method_basics.lab;

import java.util.Scanner;

public class LabScope {
    static double input1; //global
    static double input2; //global
    static double input3; //global
    static double input4; //global
    
    /**
     * This method prints the slope between two sets
     * of coordinate points by calculating their coordinate
     * changes separately
     * 
     * @param x1 A double for first x-coordinate
     * @param y1 A double for first y-coordinate
     * @param x2 A double for second x-coordinate
     * @param y2 A double for second y-coordinate
     * @return No return value
     */

    public static void getSlope(double x1, double y1, double x2, double y2) {
        double yChange = y2 - y1;
        double xChange = x2 - x1;
        System.out.println(yChange / xChange);
    }

    public static void main(String args[]) {
  Scanner input = new Scanner (System.in);
  System.out.println("Enter first x-coordinate: ");
  input1 = input.nextDouble();
  System.out.println("Enter first y-coordinate: ");
  input2 = input.nextDouble();
  System.out.println("Enter second x-coordinate: ");
  input3 = input.nextDouble();
  System.out.println("Enter second y-coordinate: ");
  input4 = input.nextDouble();
  input.close();
  
  getSlope(input1, input2, input3, input4);
}
}
