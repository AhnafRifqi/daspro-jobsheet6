import java.util.Scanner;

public class BookDiscount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String bookCategory;
        int numberOfBooks;
        double discount = 0;

        System.out.print("Enter book category (dictionary, novel, other): ");
        bookCategory = input.nextLine();

        System.out.print("Enter number of books bought: ");
        numberOfBooks = input.nextInt();

        if (bookCategory.equalsIgnoreCase("dictionary")) {
            discount = 10;
            if (numberOfBooks > 2) 
                discount += 2;
            
        } else if (bookCategory.equalsIgnoreCase("novel")) {
            discount = 7;
            if (numberOfBooks > 3) 
                discount += 2;
             else if (numberOfBooks >= 3) 
                discount += 1;
            
        } else {
            if (numberOfBooks > 3) 
                discount = 5;
            
        }

        System.out.println("Discount amount: " + discount + "%");

    
    }
}