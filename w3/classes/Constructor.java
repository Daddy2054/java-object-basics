package w3.classes;
//add class definitions below this line

class Actor {
    String firstName;
    String lastName;
    String birthday;
    int totalFilms;
    int oscarNominations;
    int oscarWins;

    Actor() {
        firstName = "Helen";
        lastName = "Mirren";
        birthday = "July 26";
        totalFilms = 80;
        oscarNominations = 4;
        oscarWins = 1;
    }
}

// add class definitions above this line
public class Constructor {
    public static void main(String[] args) {
        // add code below this line

        Actor helen = new Actor();
        System.out.println(helen.firstName + " " + helen.lastName);
        System.out.println(helen.firstName + " " + helen.lastName + "\'s birthday is " + helen.birthday);
        System.out.println(helen.firstName + " " + helen.lastName + " won " + helen.oscarWins + " Oscar out of " + helen.oscarNominations + " nominations");
        // add code above this line
    }
}