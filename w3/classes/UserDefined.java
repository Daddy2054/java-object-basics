package w3.classes;

// import java.lang.Class;

//add class definitions below this line
    
class Actor {
    String firstName;
    String lastName;
    int totalFilms;
  }  
  
//add class definitions above this line

public class UserDefined {  
  public static void main(String[] args) {
    
    //add code below this line

    Actor helen = new Actor();
    helen.firstName = "Helen";
    helen.lastName = "Mirren";
    helen.totalFilms = 80;
    System.out.println(helen.firstName + " " + helen.lastName);
    System.out.println(helen.firstName.toUpperCase() + " " + helen.lastName.toLowerCase());
    System.out.println(helen);
    //add code above this line
  }
}
