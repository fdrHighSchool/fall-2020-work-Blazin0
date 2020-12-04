import java.util.*;
import java.io.*;
import java.lang.Math;
//2019 Day 1
public class AOC2{
  public static void main(String[] args) {
    int Total = 0;
    double holder = 0.0;
    try{
      Scanner s = new Scanner(new File("data2019.txt"));
      while(s.hasNext()){
        int val = Integer.parseInt(s.next());
        holder = val/3.0 - 2;
        holder = Math.floor(holder);
        Total += (int)holder;
      }//end while loop
      System.out.println(Total);
      s.close();
    }//end try
    catch(Exception e){
      System.out.println("file not found");
    }//end catch
  }//end main method
}//end class
