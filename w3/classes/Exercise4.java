package w3.classes;

class Observation {
    String date;
    double temperature;
    double elevation;
    int penguins;
    double precipitation = 0;

    public Observation(String date, double temperature, double elevation, int penguins) {
        this.date = date;
        this.temperature = temperature;
        this.elevation = elevation;
        this.penguins = penguins;
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Observation s = new Observation("2020-12-01", -1, -1, -1);
        System.out.println(s.date);
        System.out.println(s.temperature);
        System.out.println(s.elevation);
        System.out.println(s.penguins);
        System.out.println(s.precipitation);
    }
}
