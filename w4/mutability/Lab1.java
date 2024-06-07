package w4.mutability;

class Coffee {
    String country;
    String region;

    void Country(String c, String r) {
        country = c;
        region = r;
    }

    void printCoffee() {

        System.out.println("This coffee comes from " + country + ".");
        System.out.println("It was harvested in the " + region + " region.");
    }
}

public class Lab1{
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        myCoffee.Country("Ethiopia", "Addis Ababa");
        myCoffee.printCoffee();
    }
}
