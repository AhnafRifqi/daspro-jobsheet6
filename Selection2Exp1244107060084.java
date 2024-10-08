import java.util.Scanner;

public class Selection2Exp1244107060084 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Input year: ");
    int year = input.nextInt();

    if (year % 4 == 0)  // Check divisibility by 4 first
      if (year % 100 != 0) // Check divisibility by 100 only if divisible by 4
        System.out.println("Leap year");

    else
      System.out.println("Not a Leap year");
  }
}