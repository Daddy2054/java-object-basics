package w4.mutability;

//add class definitions below this line

class Player {
    int health;
    int score;
    int level;
    
    Player() {
      health = 100;
      score = 0;
      level = 1;
    }
    
    void printPlayer() {
      if (health <= 0) {
        System.out.println("This player is dead. They died on level " + level + " with a score of " + score + ".");
      } else {
        System.out.println("This player has " + health + " health, a score of " + score + " and is on level " + level + ".");
      }
    }
    void changeHealth(int amount) {
        health += amount;
      }
      void changeLevel(){
        level++;
      }
  }
   
  //add class definitions above this line
public class Mutability {
    public static void main(String[] args) {
    //add code below this line

    Player mario = new Player();
    mario.printPlayer();

    //add code above this line
    }
}
