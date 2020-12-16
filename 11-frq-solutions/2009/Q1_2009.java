import java.util.*;
public class Q1_2009{
  public static void main(String[] args){
  }
  public static int[] getCubeTosses(Numbercube cube, int numtosses){
    int[] arr = new int[numtosses];
    for(int i = 0; i < arr.length; i++){
      arr[i]=cube.toss();
    }
    return arr;
  }
  public static int getLongestRun(int[] values){
    int maxrunindex=-1;
    int maxrunlength=1;
    int runindex=0,runLength=1;
    for(int i =0; i<values.length;i++){
      if(values[i] == maxrunlength){
        if(runlength>maxrunlength){
          maxrunlength = maxlength;
          maxrunindex = runindex;
        }
      }
      else{
        runindex=i;
        runlength=1;
      }
    }
    return maxrunindex;
  }

}
