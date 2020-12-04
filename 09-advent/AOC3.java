import java.util.*;
import java.io.*;
//2020 Day 1
public class AOC3{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("input a list of numbers");
    int numbers = s.nextInt();
    int arr[] = new int[numbers];
    for(int i = 0; i< numbers; i++){
      arr[i] = scanner.nextInt();

    }
    System.out.println(Arrays.toString(arr));
    System.out.println(getAverage(arr));
  }
  public static double getAverage(int[arr]){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
      sum += arr[i]
    }
    return sum/arr.length;
  }
}
