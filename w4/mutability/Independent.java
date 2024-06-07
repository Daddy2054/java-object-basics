package w4.mutability;
//add class definitions below this line

class Car {
    String make;
    String model;
    String color;
    
    Car(String ma, String mo, String co) {
      make = ma;
      model = mo;
      color = co;
    }
    
    static void honk() {
      System.out.println("Beep! Beep!");
    }

    static void describe(Car c) {
        System.out.println(c.color + " " + c.make + " " + c.model);
      }
  }
   
  //add class definitions above this line
public class Independent {
    public static void main(String[] args) {
        Car.honk();
    //add code below this line

    Car myCar = new Car("Honda", "Accord", "red");
    Car.describe(myCar);

    //add code above this line
        System.out.println(Math.max(17, 142));
        System.out.println(Math.abs(-2.34));
        System.out.println(Math.pow(3, 5));
        System.out.println(Math.cos(34.1));
        System.out.println(Math.random());
    }
}
