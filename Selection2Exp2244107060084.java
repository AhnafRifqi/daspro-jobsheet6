import java.util.Scanner;

public class Selection2Exp2244107060084 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 

    System.out.print("Enter angle 1: ");
    double angle1 = input.nextDouble();
    System.out.print("Enter angle 2: ");
    double angle2 = input.nextDouble();
    System.out.print("Enter angle 3: ");
    double angle3 = input.nextDouble();

   
    double totalAngle = angle1 + angle2 + angle3;

    
    if (totalAngle == 180) 
      if (angle1 == 90 || angle2 == 90 || angle3 == 90) 
        System.out.println("Right triangle");
       else if (angle1 == angle2 && angle2 == angle3) 
        System.out.println("Equilateral triangle");
       else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) 
        System.out.println("Isosceles triangle");
       else 
        System.out.println("Scalene triangle");
      
     else 
      System.out.println("Not a triangle");
    
  }
}