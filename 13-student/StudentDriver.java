import java.util.*;
public class StudentDriver{
  public static void main(String[] args){
    Student student1 = new Student("Hans", "123456789");
    Student student2 = new Student("Sophia","234345646");
    System.out.println(student1);
    student1.setName("Joshua");
    System.out.println(student1);
    System.out.println(student1.getName());
    student1.addGrade(100);
    student1.displayGrades();
    student1.addGrade(85);
    student1.displayGrades();
    student2.addGrade(95);
    student2.displayGrades();
  }
}
