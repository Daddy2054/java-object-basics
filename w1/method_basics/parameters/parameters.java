package w1.method_basics.parameters;

public class parameters {
    /**
     * This method adds two integers together
     * 
     * @param num1 The first integer
     * @param num2 The second integer
     */
    public static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    /**
     * This method adds three integers together
     * 
     * @param num1 The first integer
     * @param num2 The second integer
     * @param num3 The third integer
     */
    public static void add(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    /**
     * This method adds an integer to a string
     * 
     * @param num1 The integer
     * @param num2 The string
     */
    public static void add(int num1, String num2) {
        System.out.println(num1 + num2);
    }

    /**
     * This method divides one integer by the other
     * 
     * @param num1 The first integer
     * @param num2 The second integer
     */
    public static void divide(int num1, int num2) {
        try {
            System.out.println(num1 / num2);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void myMethod(String x, int y) {
        System.out.println(x + y);
    }

    public static void main(String args[]) {
        add(5, 7);
        divide(5, 0);
        myMethod("High", 5);
    }
}
