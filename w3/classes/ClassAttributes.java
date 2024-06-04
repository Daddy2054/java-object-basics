package w3.classes;
//add class definitions below this line
    
class Actor {
    String firstName;
    String lastName;
    String birthday;
    int totalFilms;
    int oscarNominations;
    int oscarWins;
    static final String UNION = "Screen Actors Guild";
    
    Actor(String fn, String ln, String bd, int tf) {
      firstName = fn;
      lastName = ln;
      birthday = bd;
      totalFilms = tf;
      oscarNominations = 0;
      oscarWins = 0;
    }
  }
    
  //add class definitions above this line
public class ClassAttributes {
    public static void main(String[] args) {
    //add code below this line

    Actor helen = new Actor("Helen", "Mirren", "July 26", 80);
    Actor dwayne = new Actor("Dwayne", "Johnson", "May 2", 34);
    helen.UNION = "Teamsters";

    //add code above this line
    }
}
