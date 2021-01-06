import java.util.*;
import java.lang.Math;
public class Grades2D{
  public static void main(String[] args) {
    int[][] arr = new int[30][10];
    //Where the grades start randomizing \/
    for(int row = 0; row < arr.length; row++){
      for(int col = 0;col < arr[row].length; col++){
        arr[row][col] = (int)Math.floor(Math.random()*(100-55+1))+55;
       }
      }
      int valedictorian = vale(average(arr));
      int salutatorian = salut(average(arr),valedictorian);
      System.out.println("Students Grades: " + Arrays.deepToString(arr));
      System.out.println("Averages: " + Arrays.toString(average(arr)));
      System.out.println("Valedictorian: " + valedictorian);
      System.out.println("Salutatorian: " + salutatorian);
  }
  public static int[] average(int[][] arr){
    int[] av = new int [arr.length];
    int max = 0;
    for(int row = 0; row < arr.length; row++){
      for(int col = 0;col < arr[row].length; col++){
        av[row] += arr[row][col];
      }
      av[row] /= arr[0].length;
    }
    return av;
  }
  public static int vale(int[] arr){
    int high = 0;
    for(int index = 0; index < arr.length;index++){
      if (high < arr[index]){
        high = arr[index];
      }
    }
    return high;
  }
  public static int salut(int[] av,int valedictorian){
    int sechigh = 0;
    for(int index = 0; index < av.length;index++){
      if (av[index] < valedictorian && av[index] != valedictorian && sechigh < av[index]){
        sechigh = av[index];
      }
    }
    return sechigh;
  }
}
