      //i searched up the isSelfDivisor i didnt know how to individually go through each digit
import java.util.*;
public class Q1_2007{
  public static void main(String[] args){
     Scanner s = new Scanner(System.in);
     System.out.println("input a positive number");
     int num = s.nextInt();
     System.out.println("How many values?");
     int values = s.nextInt();
     if(isSelfDivisor(num)){
      if (values < 0 || num < 0){
       System.out.println("values or num cant be less than 0");
     }
     else{
       System.out.println(Arrays.toString(firstNumSelfDivisor(num,values)));
       }
     }
  }
  public static boolean isSelfDivisor(int num){
    int number = num;
    while (number > 0){
      if(number % 10 == 0 || num % (number % 10) != 0){
        return false;
      }
      number /= 10;
    }
      return true;
  }
  public static int[] firstNumSelfDivisor(int start, int num){
    int[] arr = new int[num];
    int placement = 0;
    int number = start;//starting number
    while(placement < num){//While Placement is less than array size
      if(isSelfDivisor(number)){
        arr[placement] = number;
        placement++;
        }
      number++;//increase the number
    }
    return arr;
  }
}
