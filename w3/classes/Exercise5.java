package w3.classes;

class BigCat {
    String species;
    String commonName;
    String[] habitat;
    static String genus = "panthera";

    public BigCat(String species, String commonName, String[] habitat) {
        this.species = species;
        this.commonName = commonName;
        this.habitat = habitat;
    }
}

public class Exercise5 {
    public static void main(String[] args) {
        BigCat s = new BigCat("tigris", "tiger", new String[] { "jungle", "savanna", "asia" });
        System.out.println(s.species);
        System.out.println(s.commonName);
        System.out.println(s.habitat);
        System.out.println(BigCat.genus);
    }
}
