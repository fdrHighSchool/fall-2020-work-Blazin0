import java.util.*;
public class RNG{

  public static void main(String[] args) {
    Scanner test = new Scanner(System.in);
    int again = 0;
    //Name
    String name;
    System.out.println("Hello! what is your name?");
    name = test.nextLine();
    System.out.println(name);
    //play again
    while (again != 2){
      Random random = new Random();
      int max = 0;
      int min = 1;
      int count;
      int guess = 1;
      int choice = 0;
      System.out.println("What difficulty do you want the RNG to be?(type the number)");
      System.out.println("1 easy\n 2 medium\n 3 hard");
      int difficulty = test.nextInt();
      //easy
      if (difficulty == 1){
        max = 25;
        System.out.println("max is now 25!");
      }
      //medium
      if (difficulty == 2){
        max = 50;
        System.out.println("max is now 50!");
      }
      //hard
      if (difficulty == 3){
        max = 100;
        System.out.println("max is now 100!");
      }
      int number = random.nextInt(max) + 1;
      // System.out.println(number); // this is printing out the random number
      //                               Start of the game
      while (number != choice){
        System.out.println("guess a number from " + min + " to " + max);
        choice = test.nextInt();
        guess += 1;
        //hint 1
        if (choice < number){
          System.out.println("higher");
        }
        if (choice > number){
          System.out.println("lower");
        }
        //hint 2
        if (number % 2 == 0 ){
          System.out.println("even");
        }
        if (number % 2 == 1){
          System.out.println("odd");
        }
        //adjust the range
        if (choice <= max && choice <= number ){
          min = choice -1 ;
        }
        if (choice >= number && choice <= max && max >= number){
          max = choice + 1;
        }
        //how many guesses it took for you
        if (number == choice){
        System.out.println("congratulations! it took you " + guess + " guesses!" + name);
        }
      }
      //play again
      System.out.println("would you like you play again? 1 Yes\n 2 No (type the number)"
      +name);
      again = test.nextInt();
    }
  }
}
      //Difficulty
