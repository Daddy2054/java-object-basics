package w3.classes;

// import java.lang.Class;
import java.lang.reflect.*;

public class BuiltIn {
  public static void main(String[] args) {
    
    //add code below this line

    String s = new String("I am a string");
    System.out.println(s.getClass());
    System.out.println(s.isEmpty());
    System.out.println(s.getBytes());
    System.out.println(s.endsWith("g"));

    Method[] methods = s.getClass().getDeclaredMethods();
    for (Method m : methods) {
      System.out.println("Method name: " + m + "\n");
    }
    //add code above this line
  }
}