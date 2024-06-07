package w4.mutability;
//add class definitions below this line

class Rectangle {
    int width;
    int length;
    
    Rectangle(int w, int l) {
      width = w;
      length = l;
    }
    
    int area() {
      return width * length;
    }
    
    static int combinedArea(Rectangle r1, Rectangle r2) {
      return r1.area() + r2.area();
    }
    static void describe(Rectangle r) {
        System.out.println("The rectangle has width of " + r.width + " and a length of " + r.length + ".");
      }
  }
   
  //add class definitions above this line
public class StaticMethods {
    public static void main(String[] args) {
    //add code below this line

    Rectangle rect1 = new Rectangle(12, 27);
    Rectangle rect2 = new Rectangle(9, 3);
    System.out.println(Rectangle.combinedArea(rect1, rect2));

    //add code above this line
    }
}
