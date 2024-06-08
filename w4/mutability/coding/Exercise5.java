package w4.mutability.coding;

import java.util.ArrayList;
//add class definitions below this line

class Subway {
    static double fare = 2.4;
    String[] stops;
    String currentStop;
    String direction;
    int passengers;
    double totalFares;

    Subway() {
        stops = new String[] { "Alewife", "Davis", "Porter", "Harvard", "Central", "Kendall" };
        currentStop = "Alewife";
        direction = "south";
        passengers = 0;
        totalFares = 0;
    }

    void board(int num) {
        passengers += num;
    }

    void disembark(int num) {
        if (num > passengers) {
            System.out.println("There are not enough passengers on the subway.");
        } else {
            passengers -= num;
        }
    }

    void advance() {
        int index = 0;
        for (int i = 0; i < stops.length; i++) {
            if (stops[i] == currentStop) {
                index = i;
            }
        }
        if (direction == "south") {
            currentStop = stops[index + 1];
        } else {
            currentStop = stops[index - 1];
        }
        if (currentStop == "Kendall") {
            direction = "north";
        }
        if (currentStop == "Alewife") {
            direction = "south";
        }
    }

    int distance(String stop) {
        int index = 0;
        int index2 = 0;
        for (int i = 0; i < stops.length; i++) {
            if (stops[i] == stop) {
                index = i;
            }
            if (stops[i] == currentStop) {
                index2 = i;
            }
        }

        return index > index2 ? index - index2 : index2 - index;
    }

    static void changeFare(double newFare) {
        fare = newFare;
    }

    void calculate_fares() {
        totalFares += passengers * fare;
    }

}

// add class definitions above this line
public class Exercise5 {
    public static void main(String[] args) {
        // Boarding the Subway
        Subway subway = new Subway();
        subway.board(220);
        subway.board(45);
        System.out.println(subway.passengers);

        // Total Fares
        Subway subway1 = new Subway();
        System.out.println(subway1.totalFares);
        System.out.println(subway1.passengers);
        subway1.board(100);
        subway1.calculate_fares();
        System.out.println(subway1.totalFares);
        System.out.println(subway1.passengers);

        // Exiting the Subway
        Subway subway2 = new Subway();
        subway2.board(113);
        subway2.disembark(23);
        System.out.println(subway2.passengers);

        // Advancing the Subway
        Subway subway3 = new Subway();
        System.out.println(subway3.direction);
        System.out.println(subway3.currentStop);
        subway3.advance();
        System.out.println(subway3.direction);
        System.out.println(subway3.currentStop);
        subway3.advance();
        System.out.println(subway3.direction);
        System.out.println(subway3.currentStop);
        subway3.advance();
        System.out.println(subway3.direction);
        System.out.println(subway3.currentStop);
        subway3.advance();
        System.out.println(subway3.direction);
        System.out.println(subway3.currentStop);
        subway3.advance();
        System.out.println(subway3.currentStop);
        System.out.println(subway3.direction);
        subway3.advance();
        System.out.println(subway3.direction);
        System.out.println(subway3.currentStop);

        // Calculating Distance
        Subway subway4 = new Subway();
        subway4.advance();
        System.out.println(subway4.currentStop);
        System.out.println(subway4.distance("Central"));

        // Changing the Fare
        Subway.changeFare(2.75);
        System.out.println(Subway.fare);
    }
}

// LAST RUN on 6/8/2024, 9:31:37 PM
// 9 tests, 2 failures, 0.16s duration

// Exercise5Tester
// checkAdvanceSouthTerminus, 0.008s, failed
// Index 6 out of bounds for length 6
// checkChangeFare, 0.0s, passed
// checkFares, 0.002s, failed
// expected:<54.57> but was:<0.0>
// checkBoarding, 0.0s, passed
// checkAdvanceNorth, 0.0s, passed
// checkAdvanceSouth, 0.0s, passed
// checkAdvanceNorthTerminus, 0.0s, passed
// checkDistancePositive, 0.0s, passed
// checkDistanceNegative, 0.0s, passed