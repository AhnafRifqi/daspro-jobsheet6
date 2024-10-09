import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int num1 = 28;
        int num2 = 54;
        int num3 = 15;

        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        System.out.println("Maximum number = " + max);
    }
}