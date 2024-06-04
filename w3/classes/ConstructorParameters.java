package w3.classes;
//add class definitions below this line

class Actor {
    String firstName;
    String lastName;
    String birthday;
    int totalFilms;
    int oscarNominations;
    int oscarWins;

    Actor(String fn, String ln, String bd, int tf) {
        firstName = fn;
        lastName = ln;
        birthday = bd;
        totalFilms = tf;
        oscarNominations = 0;
        oscarWins = 0;
    }
}

// add class definitions above this line
public class ConstructorParameters {
    public static void main(String[] args) {
        // add code below this line

        Actor helen = new Actor("Helen", "Mirren", "July 26", 80);
        System.out.println(helen.oscarNominations);
        System.out.println(helen.oscarWins);

        helen.oscarNominations = 4;
        helen.oscarWins = 1;

        System.out.println(helen.oscarNominations);
        System.out.println(helen.oscarWins);
        Actor tom = new Actor("Tom", "Hanks", "July 9", 76);
        Actor denzel = new Actor("Denzel", "Washington", "December 28", 47);
        System.out.println(helen.firstName + " " + helen.lastName);
        System.out.println(tom.firstName + " " + tom.lastName);
        System.out.println(denzel.birthday + " " + denzel.totalFilms);

        // add code above this line
    }
}
