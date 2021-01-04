import java.util.*;
import java.lang.Math;
public class Grades2D{
  public static void main(String[] args) {
    int[][] arr = new int[30][10];
    for(int row=0; row < arr.length; row++){
      for(int col = 0;col < arr[row].length;col++){
      arr[row][col] = (int)Math.floor(Math.random()*100+55);
      }
    }
    System.out.println(Arrays.deepToString(arr));
  }
}
