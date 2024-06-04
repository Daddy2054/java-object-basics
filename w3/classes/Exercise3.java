package w3.classes;


class Superhero{
    String name;
    String secretIdentity;
    String[] powers;

    public Superhero(String name, String secretIdentity, String[] powers) {
        this.name = name;
        this.secretIdentity = secretIdentity;
        this.powers = powers;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        String[] powers = {"superhuman strength", "superhuman speed", "superhuman reflexes", "superhuman durability", "healing factor", "spider-sense alert", "heightened senses", "wallcrawling"};
        Superhero s = new Superhero("Spider-Man","Peter Parker",powers);
        System.out.println(s.name);
        System.out.println(s.secretIdentity);
        System.out.println(s.powers);
    }
}
