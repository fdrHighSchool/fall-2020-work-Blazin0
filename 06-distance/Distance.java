import java.util.Scanner;

public class Distance{
  public static void main(String[] args) {
    //get two points from the user (x, y)
    //ex: (3, 5)...stored as a String
    Scanner s = new Scanner(System.in);

    System.out.print("Enter point 1: ");
    String point1 = s.nextLine();
    System.out.print("Enter point 2: ");
    String point2 = s.nextLine();

    System.out.printf("The distance between %s and %s is...\n", point1, point2);
    //parse, meaning, get ints from String, the information from the inputs
    //(3, 4) --> x1 = 3, y1 = 4

    int x1 = getX(point1);
    int y1 = getY(point1);
    int x2 = getX(point2);
    int y2 = getY(point2);
    System.out.println(cartesianDistance(x1,y1,x2,y2));
    System.out.println(taxicabDistance(x1,y1,x2,y2));
    //send data to methods to calculate distance


    /*
    TEST CASES:
    (0, 0) & (3, 4) --> euclideanDistance = 5, taxicabDistance = 7
    (0, 0) & (5, 12) --> euclideanDistance = 13, taxicabDistance = 17
    Do negative coordinates work? If not, how would you go about fixing that?
    */

  }//end main


  /*
   * N: euclideanDistance
   * P: determine the distance between any two points on x/y axis (diagonal)
   * I: pass in x1, y1, x2, y2
   * R: the result of the distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
   */
  public static double cartesianDistance(double x1,double y1,double x2,double y2){

    double distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
    return distance;
  }//end cartesianDistance


  /*
   * N: taxicabDistance
   * P:
   * I:
   * R:
   */
  public static double taxicabDistance(double x1,double y1,double x2,double y2){

    double distance = Math.abs((x2-x1) + Math.abs(y2-y1));
    return distance;
  }//end cartesianDistance


  public static int getX(String point){
    //locate the comma
    int comma = point.indexOf(",");

    //we know the x-value in the String starts at index 1
    //we now know where the comma is
    //so, the x-value is from index 1 to the location of the comma
    String x = point.substring(1, comma);
    System.out.println(x);

    return Integer.parseInt(x);
  }//end getX method
    public static int getY(String point){
    //locate the comma
    int comma = point.indexOf(",");
    //locate closed parenthesis
    int para = point.indexOf(')');
    //we know it will start after the comma
    //It will end before the closed parenthesis
    String y = point.substring((comma + 2), para);
    System.out.println(y);
    // ADDING SPACE WILL ADD A SPACE IN THE FRONT
    return Integer.parseInt(y);
  }//end getY method

}//end class
