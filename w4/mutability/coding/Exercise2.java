package w4.mutability.coding;

class CelestialBody {
    String name;
    double diameter;
    long distance;
    int moons;

    CelestialBody(String n, double diam, long dist, int m) {
        name = n;
        diameter = diam;
        distance = dist;
        moons = m;
    }

    static String closerToSun(CelestialBody b1, CelestialBody b2) {
        return (b1.distance < b2.distance) ? b1.name : b2.name;
    }
}

public class Exercise2 {
    public static void main(String[] args) {

        CelestialBody mercury = new CelestialBody("Mercury", 4879.4, 57909000, 0);
        CelestialBody venus = new CelestialBody("Venus", 12103.6, 108160000, 0);
        System.out.println(CelestialBody.closerToSun(mercury, venus));
    }
}
