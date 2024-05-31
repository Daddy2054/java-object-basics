package w1.method_basics.lab;
/**
 * This method prints the slope between two sets
 * of coordinate points
 * 
 * @param x1 A double of the first x-coordinate
 * @param y1 A double of the first y-coordinate
 * @param x2 A double of the second x-coordinate
 * @param y2 A double of the second y-coordinate
 * @return No return value
 */
public class LabParameters {
    public static void getSlope(double x1, double y1, double x2, double y2) {
        System.out.println((y2 - y1) / (x2 - x1));
    }

    public static void main(String args[]) {
        getSlope(3, 2, 5, 6);
    }
}