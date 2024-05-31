package w1.method_basics.lab;

import java.util.*; 

public class LabChallenge {
  
  //add code below this line

  public static void sayHello(ArrayList<String> variable) {
    for (String s : variable) {
      System.out.println("Hello " + s);
    }
  }

  //add code above this line
  
  public static void main(String args[]) {
    ArrayList<String> names = new ArrayList<String>();
    for (String s : args) {
      names.add(s);
    }
    sayHello(names);
  }
  
}