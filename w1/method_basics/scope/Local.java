package w1.method_basics.scope;

public class Local {
  
    //add code below this line
    public static void myMethod1() {
    String myVar = "Hello";
    System.out.println(myVar);
  }
  
  public static void myMethod2() {
    String myVar = "Bonjour";
    System.out.println(myVar);
  }
  
  public static void main(String args[]) {
    myMethod1();
    myMethod2();
  }
  
    
    //add code above this line
    
  }

