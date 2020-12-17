import java.util.*;
public class Temp{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println(" Is your temperature 1)Fahrenheit\n 2)Celsius");
      int Temp= input.nextInt();
      System.out.println("What is number of the temperature?");
      double num = input.nextDouble();
      System.out.println("do you want to convert your temperature to 1)fahrenheit to Celsius? \n 2)Celsius to fahrenheit \n 3) no");
      int user = input.nextInt();
      if(user == 1){
        System.out.printf(num+"F"+"="+"%.1f"+"C"+"\n", FtoC(num));
      }
      if (user == 2){
        System.out.printf(num+"C"+"="+"%.1f"+"F"+"\n", CtoF(num));
      }
      if (user == 3){
        System.out.print(num + "F");
      }
}
    public static double FtoC(double n){
      double total = ((n-32)* 5.0/9);
      return total;
    }
    public static double CtoF(double n){
      double total = ((n*(9.0/5))+32);
      return total;
    }
}
