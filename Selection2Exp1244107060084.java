import java.util.Scanner;

public class Selection2Exp1244107060084 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();


        boolean isLeapYear = false;

       
        if (year % 4 == 0) 
            
            if (year % 100 != 0 || year % 400 == 0) 
                isLeapYear = true;
            
        

        if (isLeapYear) 
            System.out.println(year + " is a leap year.");
         else 
            System.out.println(year + " is not a leap year.");
        
    


    if (year % 4 == 0) 
      if (year % 100 != 0) 
        System.out.println("Leap year");

    else
      System.out.println("Not a Leap year");
  }
}

