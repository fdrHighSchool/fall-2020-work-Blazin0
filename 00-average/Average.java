import java.util.*;
public class Average{
  public static void main(String[] args) {
    //ask for 3 test grades
    Scanner input = new Scanner(System.in);
    int sum = 0;
    System.out.print("Enter the first score: ");
    sum += input.nextInt();
    System.out.print("Enter the second score: ");
    sum += input.nextInt();
    System.out.print("Enter the third score: ");
    sum += input.nextInt();
    double average = sum/3;
    System.out.println(average);
    //print statement to test that things are working!
    //System.out.println(sum);
    //calculate the Average
    //output the data on the screen
  }//end main method
}//end class
