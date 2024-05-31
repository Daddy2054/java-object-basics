package w1.method_basics.lab;

import java.util.Scanner;

/**
 * This method returns the slope between two sets
 * of coordinate points by calculating their coordinate
 * changes separately
 * 
 * @param x1 A double of the first x-coordinate
 * @param y1 A double of the first y-coordinate
 * @param x2 A double of the second x-coordinate
 * @param y2 A double of the second y-coordinate
 * @return A String expression of the slope in rise / run format
 */
public class LabReturn {

    static double input1;
    static double input2;
    static double input3;
    static double input4;
    // public static double getSlope(double x1, double y1,
    // double x2, double y2) { // replace void with double
    // double yChange = y2 - y1;
    // double xChange = x2 - x1;
    // return yChange / xChange; // returns a double
    // }

    public static String getSlope(double x1, double y1,
            double x2, double y2) { // replace double with string
        double yChange = y2 - y1;
        double xChange = x2 - x1;
        return yChange + " / " + xChange; // returns a string
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first x coordinate: ");
        input1 = input.nextDouble();
        System.out.println("Enter first y coordinate: ");
        input2 = input.nextDouble();
        System.out.println("Enter second x coordinate: ");
        input3 = input.nextDouble();
        System.out.println("Enter second y coordinate: ");
        input4 = input.nextDouble();
        input.close();

        System.out.println(getSlope(input1, input2, input3, input4));
    } //prints what is returned by the getSlope() method
}
