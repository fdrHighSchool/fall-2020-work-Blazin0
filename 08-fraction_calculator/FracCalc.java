import java.util.*;
public class FracCalc {
    public static void main(String[] args){
      boolean calc = true;
        Scanner scan = new Scanner(System.in);
        while (calc){
            System.out.println("Enter a problem!(ex: 4_2/3 + 6_2/1)");
            String problem = scan.nextLine();
            System.out.println(problem);
            if (problem.contains("/0")) { //ERROR DENOMINATOR
              System.out.println(" Cant have a zero for a denominator");
              break;
            }   //IF END
            else if (op.length() > 1){ //ERROR OPERATOR
              System.out.println(" Cant have more than one operator");
              break;
            }//IF END
            String answer = produceAnswer(problem);
            String whole = answer.substring(0, answer.indexOf("_"));//takes whole number
            String oper = answer.substring(0, answer.length());//takes the whole fraction
            if (answer.contains("0/1")){//IF ANSWER CONTAINS NO NUMERATOR
              System.out.println(whole);
            }
            else if(whole.contains("0")){// IF WHOLE NUMBER IS 0
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
        String operand1 = input.substring(0, input.indexOf(' ')); //OPERAND 1
        operand1 = inttofrac(operand1);//int to fraction
        System.out.println("operand1:" + operand1);
        String op = input.substring(input.indexOf(' ') + 1,input.indexOf(' ') + 2);//finds the operator
        System.out.println("operator:" + op);
        String operand2 = input.substring(input.lastIndexOf(' ') + 1);//OPERAND 2
        operand2 = inttofrac(operand2);//int to fraction
        System.out.println("operand2:" + operand2);
        if (operand1.contains("/") && !operand1.contains("_")) {// IF OPERAND 1 HAS NO WHOLE NUMBERS CONVERT TO WHOLE NUMBERS
          operand1 = conmix(operand1);
        }
        if (operand2.contains("/") && !operand2.contains("_")) {// IF OPERAND 1 HAS NO WHOLE NUMBERS CONVERT TO WHOLE NUMBERS
          operand2 = conmix(operand2);
        }
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
          //Fraction 1
          //whole number
          String wholenum2 = whole(operand2);
          //numerator and denominator
          String numer2 = operand2.substring(operand2.indexOf('_') + 1, operand2.indexOf('/'));
          String denom2 = operand2.substring(operand2.indexOf('/') + 1 );
          System.out.println("whole number 1: " + wholenum2 + " numerator 1: " + numer2 + " denominator 1: " + denom2 );
        }//end fraction 2
        else{
          System.out.println("whole number1: " + operand2 + " numerator 1: 0" + " denominator 1: 0");
        }
        operand1 = confrac(operand1);
        operand2 = confrac(operand2);
        if(op.contains("+") == true){
          String aplus = plus(operand1,operand2);
          System.out.println(plus(operand1,operand2));
          return aplus;
        }
        if(op.contains("-") == true){
          String aminus = minus(operand1,operand2);
          System.out.println(minus(operand1,operand2));
          return aminus;
        }
        if(op.contains("*") == true){
          String amultiply = multiply(operand1,operand2);
          System.out.println(multiply(operand1,operand2));
          return amultiply;
        }
        if(op.contains("/") == true){
          String adivide = divide(operand1,operand2);
          System.out.println(divide(operand1,operand2));
          return adivide;
        }
        return "";
    }//end produceAnswer method
    public static String plus(String fo,String so){//First operand Second operand ADDING
        String num1 = numer(fo);//Numerator 1st operand    A
        String den1 = denom(fo);//Denominator 1st operand  B
        String num2 = numer(so);//Numerator 2nd operand    C
        String den2 = denom(so);//Denominator 2nd operand  D
        int totalnum = Integer.parseInt(num1) * Integer.parseInt(den2) + Integer.parseInt(num2) * Integer.parseInt(den1);// (A*D)+(C*B)
        int totalden = Integer.parseInt(den1) * Integer.parseInt(den2);// D*B
        String reduce = reduce(totalnum,totalden);
        String total = conmix(reduce(totalnum,totalden));// divides the num to the den then it changes it to the whole num fractions and returns it as a string
        return total;
    }
    public static String minus(String fo, String so){
       String num1 = numer(fo);//Numerator 1st operand    A
       String den1 = denom(fo);//Denominator 1st operand  B
       String num2 = numer(so);//Numerator 2nd operand    C
       String den2 = denom(so);//Denominator 2nd operand  D
       int totalnum = Integer.parseInt(num1) * Integer.parseInt(den2) - Integer.parseInt(num2) * Integer.parseInt(den1);
       int totalden = Integer.parseInt(den1) * Integer.parseInt(den2);
       String total = conmix(reduce(totalnum,totalden));
       return total;
    }
    public static String multiply(String fo, String so){
       String num1 = numer(fo);//Numerator 1st operand    A
       String den1 = denom(fo);//Denominator 1st operand  B
       String num2 = numer(so);//Numerator 2nd operand    C
       String den2 = denom(so);//Denominator 2nd operand  D
       int totalnum = Integer.parseInt(num1) * Integer.parseInt(num2);
       int totalden = Integer.parseInt(den1) * Integer.parseInt(den2);
       String total = conmix(reduce(totalnum,totalden));
       return total;
    }
    public static String divide(String fo, String so){
       String num1 = numer(fo);//Numerator 1st operand    A
       String den1 = denom(fo);//Denominator 1st operand  B
       String num2 = numer(so);//Numerator 2nd operand    C
       String den2 = denom(so);//Denominator 2nd operand  D
       int totalnum = Integer.parseInt(num1) * Integer.parseInt(den2);
       int totalden = Integer.parseInt(den1) * Integer.parseInt(num2);
       String total = conmix(reduce(totalnum,totalden));
       return total;
    }
    public static String reduce(int n, int d){// n is num d is den
      int c = GCD(n,d); // holder for GCD
      n = n/c;
      d = d/c;
      String total = String.valueOf(n) + "/" + String.valueOf(d);
      return total;
    }
    public static String conmix(String f){//CONVERTS MIXED FRACTIONS
      String den1 = f.substring(f.indexOf("/") + 1, f.length());//inital Denominator
      String num1 = f.substring(0,f.indexOf("/"));//inital Numerator
      String red = reduce(Integer.parseInt(num1), Integer.parseInt(den1));//returns the GCD of the numbers
      String num2 = red.substring(0,red.indexOf("/"));// final Numerator
      String den2 = red.substring(red.indexOf("/") + 1, red.length());// final Denominator
      int whole = Integer.parseInt(num2) / Integer.parseInt(den2);//FINDS WHOLE NUMBERS
      int tnum = Integer.parseInt(num2) % Integer.parseInt(den2);//FINDS REMAINDER
      String total = String.valueOf(whole) + "_" + String.valueOf(tnum) + "/" + den2;//COMBINE THEM
      return total;
    }
    public static String confrac(String f){//CONVERTS WHOLE NUMBERS FROM FRACTIONS
      String whole = f.substring(0,f.indexOf("_"));
      String num = f.substring(f.indexOf("_") + 1, f.indexOf("/"));
      String den = f.substring(f.indexOf("/") + 1 ,f.length());
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
      String numer = f.substring(0,f.indexOf("/"));
      return numer;
    }
    public static String denom(String f){//denominator
      String denom = f.substring(f.indexOf('/') + 1,f.length());
      return denom;
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
    public static int GCD(int num, int den) {// Greatest Common Divisor
    if (den == 0) {
      return num;
    }
    return GCD(den, num % den);
    }
}//end class
