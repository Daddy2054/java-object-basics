package w1.method_basics.parameters;

import java.util.ArrayList;

public class AltParameters {
    /**
     * This method prints all values of an array
     * 
     * @param arr is an array of strings
     */
    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void printArrayList(ArrayList<String> arrayList) {
        for (String s : arrayList) {
            System.out.println(s);
        }
    }

    public static void main(String args[]) {
        String[] names2 = { "Alan", "Bob", "Carol" };
        printArray(names2);

        ArrayList<String> names = new ArrayList<String>();
        names.add("Alan");
        printArrayList(names);
    }
}
