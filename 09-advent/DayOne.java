import java.util.*;
public class DayOne{
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
