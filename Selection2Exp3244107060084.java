import java.util.Scanner;

public class Selection2Exp3244107060084 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String category;
        int income;
        double netSalary;
        double tax = 0;

        System.out.print("Input category (worker/businessman): ");
        category = input.nextLine();

        System.out.print("Input income: ");
        income = input.nextInt();

        if (category.equalsIgnoreCase("worker")) {
            if (income <= 2000000) {
                tax = 0.1;
            } else if (income <= 3000000) {
                tax = 0.15;
            } else {
                tax = 0.2;
            }
            netSalary = income - (tax * income);
            System.out.println("Net salary = " + netSalary);
        } else if (category.equalsIgnoreCase("businessman")) {
            if (income <= 2500000) {
                tax = 0.15;
            } else if (income <= 3500000) {
                tax = 0.2;
            } else {
                tax = 0.25;
            }
            netSalary = income - (tax * income);
            System.out.println("Net salary = " + netSalary);
        } else 
            System.out.println("Invalid category!");
        

    }
}