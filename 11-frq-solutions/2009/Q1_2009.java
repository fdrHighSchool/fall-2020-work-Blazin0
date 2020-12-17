import java.util.*;
 public class Q1_2009{
  public static void main(String[] args){
    int[] toss = getCubeTosses(new Q1_2009(), 10);
    //I dont know why I named my main class this
    for (int i : toss){
      System.out.println(i);
    }
    System.out.println(getLongestRun(toss));
  }
  public static int[] getCubeTosses(Q1_2009 cube, int numtosses){
    int[] arr = new int[numtosses];
    for(int i = 0; i < arr.length; i++){
      arr[i]=cube.toss();
    }
    return arr;
  }
  public static int getLongestRun(int[] values){
    //Mr. Hans code
    int maxrunindex=-1;
    int maxrunlength=1;
    int runindex=0, runLength = 1;
    for(int i =0; i<values.length;i++){
      if(values[i] == maxrunlength){
        if(runLength>maxrunlength){
          maxrunlength = runLength;
          maxrunindex = runindex;
        }
      }
      else{
        runindex=i;
        runLength=1;
      }
    }
    return maxrunindex;
  }
  public int toss(){
    return (int)Math.floor(Math.random() * 6)+1;
  }
}
