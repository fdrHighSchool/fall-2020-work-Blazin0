public class FizzBuzz{
  public static void main(String[] args) {
    int upperBound = 100;

    for(int i = 1; i <= upperBound; i++){
      //insert logic here to execute FizzBuzz and generate output
      boolean f = isFizz(i);
      boolean b = isBuzz(i);
      if (isFizz(i)){
        System.out.print("Fizz")
      }
      if (isBuzz(i)){
        System.out.print("Buzz")
      }
      if (!(f || b)){
        System.out.print(i);
      }
      System.out.println();
    }//end for loop
  }//end main method
  //***********************************************************//
  /*
   * N: isFizz
   * P: determine if the number is to be classified as "fizz"
        a number is classified as "fizz" if it's divisible by 3
   * I: an integer
   * R: true/false value
   */
  public static boolean isFizz(int num){
  return (num % 3 ==0);
  }//end isFizz method

  //***********************************************************//

  /*
   * N: isBuzz
   * P: determine if the number is to be classified as "buzz"
        a number is classified as "buzz" if it's divisible by 5
   * I: an integer
   * R: true/false value
   */
  public static boolean isBuzz(int num){
  return (num % 5 ==0);
  }//end isBuzz method

}//end class
