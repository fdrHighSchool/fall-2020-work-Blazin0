import java.util.*;
public class Strings {
   public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Input a String to show how many of the same letters are used");
     String word = scan.nextLine();
     System.out.println("what letter?");
     String letter = scan.nextLine();
     int e = 0;
     int count = 0;
     for (int i = 0;i < word.length();i++){
       e = word.substring(i, i+1).indexOf(letter);
       if (e >= 0){
          count++;
       }
     }
     System.out.println("It has " + count + " of the same letter/word");
  }
}
