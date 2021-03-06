import java.util.*;
public class FracCalc {
    public static void main(String[] args){
      boolean calc = true;
      Scanner scan = new Scanner(System.in);
        while (calc){//WHILE LOOP
            System.out.println("Enter a problem!(ex: 4_2/3 + 6_2/1)");
            String problem = scan.nextLine();
            System.out.println(problem);
            String op = problem.substring(problem.indexOf(' ') + 1,problem.indexOf(' ') + 2);//OPERATOR
            if (problem.contains("/0")) { //ERROR NO DENOMINATOR
              System.out.println(" Cant have a zero for a denominator");
              break;
            }   //IF END
            else if (op.length() > 1){ //ERROR MORE THAN 1 OPERATOR
              System.out.println(" This calculator doesnt support more than one operator");
              break;
            }// ELSE IF END
            String answer = produceAnswer(problem);
            String whole = answer.substring(0, answer.indexOf("_"));//takes whole number
            String oper = answer.substring(0, answer.length());//takes the whole fraction
            if (answer.contains("0/1")){//IF ANSWER CONTAINS NO NUMERATOR
              System.out.println(whole);
            }
            else if(whole.equals("0")){// IF WHOLE NUMBER IS 0
              System.out.println(oper.substring(oper.indexOf("_") + 1));
            }
            else{// PRINT OUT THE ANSWER
              System.out.println(answer);
            }
            System.out.println("type 'quit' to quit the Calculator");//QUIT
            String quit = scan.nextLine();
            if(quit.contains("quit")){
              calc = false;
            }//END QUIT
        }//END WHILE
    }//end main method
    public static String produceAnswer(String input){
        //CHECKPOINT 1
        String operand1 = input.substring(0, input.indexOf(' ')); //OPERAND 1\
        operand1 = inttofrac(operand1);//int to fraction
        System.out.println("operand1:" + operand1);
        String op = input.substring(input.indexOf(' ') + 1,input.indexOf(' ') + 2);//finds the operator
        System.out.println("operator:" + op);
        String operand2 = input.substring(input.lastIndexOf(' ') + 1);//OPERAND 2
        operand2 = inttofrac(operand2);//int to fraction
        System.out.println("operand2:" + operand2);
        if (operand1.contains("_") == true){
          String wholenum1 = whole(operand1);//whole number
          String numer1 = operand1.substring(operand1.indexOf('_') + 1, operand1.indexOf('/'));//numerator
          String denom1 = operand1.substring(operand1.indexOf('/') + 1 );//denominator
          System.out.println("whole number 1: " + wholenum1 +  " numerator 1: " + numer1 + " denominator 1: " + denom1 );
        }//end fraction 1
        else{
          System.out.println("whole number1: " + operand1 + " numerator 1: 0" + " denominator 1: 1");
        }
        if (operand2.contains("_") == true){
          String wholenum2 = whole(operand2);
          //numerator and denominator
          String numer2 = operand2.substring(operand2.indexOf('_') + 1, operand2.indexOf('/'));
          String denom2 = operand2.substring(operand2.indexOf('/') + 1 );
          System.out.println("whole number 2: " + wholenum2 + " numerator 2: " + numer2 + " denominator 2: " + denom2 );
        }//end fraction 2
        else{
          System.out.println("whole number 2: " + operand2 + " numerator 2: 0" + " denominator 2: 1");
        }
        operand1 = confrac(operand1);
        operand2 = confrac(operand2);
        //A = Answer,
        int Anum1 = Integer.parseInt(numer(operand1));//Numerator 1st A
        int Aden1 = Integer.parseInt(denom(operand1));//Denominator 1st B
        int Anum2 = Integer.parseInt(numer(operand2));//Numerator 2nd C
        int Aden2 = Integer.parseInt(denom(operand2));//Denominator 2nd D
        if(op.contains("+")){
          String aplus = plus(Anum1,Aden1,Anum2,Aden2);
          System.out.println(plus(Anum1,Aden1,Anum2,Aden2));
          return aplus;
        }
        if(op.contains("-")){

          String aminus = minus(Anum1,Aden1,Anum2,Aden2);
          System.out.println(minus(Anum1,Aden1,Anum2,Aden2));
          return aminus;
        }
        if(op.contains("*")){
          String amultiply = multiply(Anum1,Aden1,Anum2,Aden2);
          System.out.println(multiply(Anum1,Aden1,Anum2,Aden2));
          return amultiply;
        }
        if(op.contains("/")){
          String adivide = divide(Anum1,Aden1,Anum2,Aden2);
          System.out.println(divide(Anum1,Aden1,Anum2,Aden2));
          return adivide;
        }
        return "";
    }//end produceAnswer method
    public static String plus(int num1,int den1,int num2,int den2){//First operand Second operand ADDING
        int totalnum = num1 * den2 + num2 * den1;// (A*D)+(C*B)
        int totalden = den1 * den2;// D*B
        // divides the num to the den then it changes it to the whole num fractions and returns it as a string
        String total = conmix(reduce(totalnum,totalden));
        return total;
    }
    public static String minus(int num1,int den1,int num2,int den2){
       int totalnum = num1 * den2 - num2 * den1; // (A*D)-(C*B)
       int totalden = den1 * den2;
       String total = conmix(reduce(totalnum,totalden));
       return total;
    }
    public static String multiply(int num1,int den1,int num2,int den2){
       int totalnum = num1 * num2;//(A*B)
       int totalden = den1 * den2;//(C*D)
       String total = conmix(reduce(totalnum,totalden));
       return total;
    }
    public static String divide(int num1,int den1,int num2,int den2){
       int totalnum = num1 * den2;//(A*D)
       int totalden = den1 * num2;//(C*B)
       String total = conmix(reduce(totalnum,totalden));
       return total;
    }
    public static String reduce(int n, int d){// REDUCING THE FRACTION (online)
      int c = GCD(n,d); // holder for GCD
      n = n/c;
      d = d/c;
      String total = String.valueOf(n) + "/" + String.valueOf(d);
      return total;
    }
    public static String conmix(String f){//CONVERTS MIXED FRACTIONS TO WHOLE FRACTIONS
      String den1 = f.substring(f.indexOf("/") + 1, f.length());//inital Denominator
      String num1 = f.substring(0,f.indexOf("/"));//inital Numerator
      String red = reduce(Integer.parseInt(num1), Integer.parseInt(den1));//returns the GCD of the numbers
      String num2 = red.substring(0,red.indexOf("/"));// final Numerator
      String den2 = red.substring(red.indexOf("/") + 1, red.length());// final Denominator
      int tnum = Integer.parseInt(num2) % Integer.parseInt(den2);//FINDS REMAINDER
      int whole = Integer.parseInt(num2) / Integer.parseInt(den2);//FINDS WHOLE NUMBERS
      String total = String.valueOf(whole) + "_" + String.valueOf(tnum) + "/" + den2;//COMBINE THEM
      return total;
    }
    public static String confrac(String f){//CONVERTS WHOLE FRACTION TO MIXED FRACTION
      f = negative(f);
      String whole = f.substring(0,f.indexOf("_"));
      String num = f.substring(f.indexOf("_") + 1, f.indexOf("/"));
      String den = f.substring(f.indexOf("/") + 1, f.length());
      int tnum = Integer.parseInt(whole) * Integer.parseInt(den) + Integer.parseInt(num);
      String total = String.valueOf(tnum) + "/" + den;
      return total;
    }
    public static String whole(String f){//Whole number
      if (f.contains("_")){
        String whole1 = f.substring(0,f.indexOf('_'));
        return whole1;
      }
      else{
        return "0";
      }
    }
    public static String numer(String f){//numerator
        String numer = f.substring(f.indexOf("_") + 1,f.indexOf("/"));
        return numer;
      }
    public static String denom(String f){//denominator
      String denom = f.substring(f.indexOf('/') + 1,f.length());
      return denom;
    }
    public static String negative(String f){//TURNS THE NUMERATOR TO A NEGATIVE IF THE WHOLE NUMBER IS NEGATIVE
      String whole = whole(f);
      String num = numer(f);
      String den = denom(f);
      int whole1 = Integer.parseInt(whole);
      int num1 = Integer.parseInt(num);
      if (whole1 < 0){
        num1 = num1 * -1;
      }
      String total = String.valueOf(whole1) + "_" + String.valueOf(num1) + "/" + den;
      return total;
    }
    public static String inttofrac(String a){//TURNS A INTEGER TO A FRACTION
      if (a.contains("/") && !a.contains("_")) {
        a = conmix(a);
      }
      else if (!a.contains("_") && !a.contains("/")){
        a += "_0/1";
      }
      return a;
    }
    public static int GCD(int num, int den) {// Greatest Common Divisor (online)
    if (den == 0) {// If Numerator % Denominator and Denominator = 0
      return num;
    }
    return GCD(den, num % den);
    }
}//end class
//Reducing and GCD I used https://www.geeksforgeeks.org/reduce-the-fraction-to-its-lowest-form/
