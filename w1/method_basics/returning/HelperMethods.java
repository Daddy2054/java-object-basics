package w1.method_basics.returning;
import java.lang.Math;

public class HelperMethods {
    /**
 * This method finds the radius of a circle given 
 * two coordinate points
 * 
 * @param x1 A double of the first x-coordinate
 * @param y1 A double of the first y-coordinate
 * @param x2 A double of the second x-coordinate
 * @param y2 A double of the second y-coordinate
 * @return The radius of a circle in double
 */
public static double findRadius(double x1, double y1, double x2, double y2) {
    return(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
  }
  
  /**
   * This method finds the area of a circle given 
   * two coordinate points
   * 
   * @param x1 A double of the first x-coordinate
   * @param y1 A double of the first y-coordinate
   * @param x2 A double of the second x-coordinate
   * @param y2 A double of the second y-coordinate
   * @return The area of a circle in double
   */
  public static double findArea(double x1, double y1, double x2, double y2) {
    return(Math.PI * Math.pow(findRadius(x1, y1, x2, y2), 2));
  }
  
  public static void main(String args[]) {
    System.out.println(findArea(0.0, 0.0, 4.0, 4.0));
  }
}
