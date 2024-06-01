package w2.recursion.coding;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(reverseString("abbababa"));
    }

    public static String reverseString(String str) {
        if (str.length() == 0) {
            return "";
        }
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }
}
