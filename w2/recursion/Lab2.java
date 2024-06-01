package w2.recursion;

public class Lab2 {
    public static void main(String[] args) {

        // add code below this line

        System.out.println(myRecursiveFunction(15)

        );

        // add code above this line
    }

    public static int myRecursiveFunction(int num){
        if (num < 0) {
            return 1;
        } else {
            return num + myRecursiveFunction(num - 1);
        }
    }

}
