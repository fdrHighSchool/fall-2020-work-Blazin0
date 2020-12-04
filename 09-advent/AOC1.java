import java.util.*;
//2015 Day 1
public class AOC1{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is floor is he on?");
    String floor = scan.nextLine();
    int level = 0;
    for(int i = 0;i < floor.length();i ++){
      if(floor.charAt(i) == '('){
        level++;
      }
      else{
        level--;
      }
    }
    System.out.println(level);
  }
}
