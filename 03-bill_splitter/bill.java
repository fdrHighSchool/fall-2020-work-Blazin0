
import java.util.*;
public class bill{

  public static void main(String[] args){
    		Scanner input = new Scanner(System.in);
    		System.out.println("Welcome to the Bill-Splitter");
    		System.out.print("Enter the total, pre-tax: ");

    		double total = input.nextInt();


        System.out.println("How much tax(percentage)");
        double tax = input.nextDouble();
        System.out.println("ask for amount to tip");
        int tip = input.nextInt();

        double all = ((total * (1+(tax/100.0))) + tip);
        System.out.println(all);

        System.out.print("How many people? ");

        int numPeople = input.nextInt();
        double perPerson =  all / numPeople;
        System.out.println("Each person must pay $" + perPerson + ", plus tip");
    	}//end main method
    }//end class
