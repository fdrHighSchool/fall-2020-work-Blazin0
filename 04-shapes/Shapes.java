import java.util.*;
public class Shapes{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while (true){
      double w = 0;//width
      double l = 0;//length
      double h = 0;//height
      double b = 0;//base
      double s = 0;//side
      double r = 0;//radius
      System.out.println("");
      System.out.println("What formula do you want to use? \n1)square \n2)triangle \n3)rectangle \n4)circle \n5)cube");
      System.out.println("6)Triangular prism \n7)rectangular prism \n8)sphere");
      int formula = input.nextInt();
      if (formula == 1){//    SQUARE
        System.out.println("Enter the side length: ");
        s = input.nextDouble();
        square(s);
      }
      if (formula == 2){//    TRIANGLE
        System.out.println("Enter the Base: ");
        b = input.nextDouble();
        System.out.println("Enter the Height: ");
        h = input.nextDouble();
        triangle(b,h);
      }
      if (formula == 3){//    RECTANGLE
        System.out.println("Enter Length: ");
        l = input.nextDouble();
        System.out.println("Enter Width: ");
        w = input.nextDouble();
        rectangle(l,w);
      }
      if (formula == 4){//    CIRCLE
        System.out.println("Enter radius: ");
        r = input.nextDouble();
        circle(r);
      }
      if (formula == 5){//    CUBE
        System.out.println("Enter the side length: ");
        s = input.nextDouble();
        cube(s);
    }
      if (formula == 6){//    TRIANGULAR PRISM
        System.out.println("Enter the base: ");
        b = input.nextDouble();
        System.out.println("Enter the Height: ");
        h = input.nextDouble();
        System.out.println("Enter the length: ");
        l = input.nextDouble();
        triprism(b,l,h);
      }
      if (formula == 7){//    RECTANGULAR PRISM
        System.out.println("Enter the Length: ");
        l = input.nextDouble();
        System.out.println("Enter the Width: ");
        w = input.nextDouble();
        System.out.println("Enter the Height: ");
        h = input.nextDouble();
        rectprism(l,w,h);
      }
      if (formula == 8){
        System.out.println("Enter the radius: ");
        s = input.nextDouble();
        sphere(s);
      }
      System.out.println("\n1)calculator \n2)Exit");
      int Cal = input.nextInt();
      if (Cal == 2){//start if statement
        break;
      }//end if statement
    }
}//end class main
  public static void square(double s){//SQUARE
    double a = s * s;
    System.out.println("A square with side " + s + " has an area of " + a);
    writeChars('-',11);
    System.out.println("");
      for (int i = 0;i<=4;i++){
      writeChars('-',1);
      writeChars(' ',9);
      writeChars('-',1);
      System.out.println("");
   }
    writeChars('-',11);
  }//close square method
  public static void triangle(double b,double h){//TRIANLGE
    double a = (1.0/2*(b*h));
    System.out.println("A triangle with a base of " + b + " and the height of " + h + " has an area of " + a);
    for (int i = 10; i >= 1; i--) {
      writeChars('>', i);
      writeChars(' ', 20 - 2 * i);
      writeChars('<', i);
      System.out.println();
    }
    writeChars('=', 20);
  }//close triangle method
  public static void rectangle(double l, double w){//RECTANGLE
    double a = (l*w);
    System.out.println("A rectangle with a length of " + l + " and the width of " + w + " has an area of " + a);
    writeChars('-',20);
    System.out.println("");
      for (int i = 0;i<=4;i++){
      writeChars('-',1);
      writeChars(' ',18);
      writeChars('-',1);
      System.out.println("");
   }
    writeChars('-',20);
  }//close rectangle method
  public static void circle(double r){//CIRCLE
    double cir = (3.14*(r*r));
    System.out.println("A circle with a radius of " + r + " has an area of " + cir);
  }//close circle method
  public static void cube(double s){//CUBE
    double v = (s*s*s);
    System.out.println("A cube with a side of " + s + " has an volume of " + v);
  }//close circle method
  public static void triprism(double b,double l, double h){//TRIANGULAR PRISM
    double v = (1.0/2*(b*l*h));
    System.out.println("A triangular prism has a base of " + b + ", the length of " + l + " and a height of " + h + " has an volume of " + v);
  }//close circle method
  public static void rectprism(double l,double w,double h){//RECTANGULAR PRISM
    double v = (l*w*h);
    System.out.println("A rectangle prism with a length of " + l + ", the width of " + w + " and the height of "+ h +" has an volume of " + v);
  }//close circle method
  public static void sphere(double r){//SPHERE
    double sphere = (4.0/3*(3.14*(r*r*r)));
    System.out.println("A sphere with a radius of " + r + " has a volume of " + sphere);
  }//close circle method
  public static void writeChars(char ch, int number) {//  WRITECHAR
    for (int i = 1; i <= number; i++) {
        System.out.print(ch);
    }//END WRITECHAR METHOD
  }
}// end public class
