import java.util.*;
public class AccountDriver{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    boolean pw = false;
    System.out.println("username?");
    String user = s.nextLine();
    System.out.println("password?");
    String pass = s.nextLine();
    Account acc1 = new Account(user,pass);
    acc1.displayuser();
    acc1.hiddenpw();
    System.out.println("Show password? yes or no?");
    String input = s.nextLine();
    if(input.contains("y") || input.contains("Y")){
      acc1.displaypw();
    }
  }
}
