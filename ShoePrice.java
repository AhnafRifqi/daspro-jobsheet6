import java.util.Scanner;

public class ShoePrice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String brand, category, size;
        double price = 0;

        System.out.print("Enter brand: ");
        brand = input.nextLine();

        System.out.print("Enter category: ");
        category = input.nextLine();

        System.out.print("Enter size: ");
        size = input.nextLine();


        if (brand.equalsIgnoreCase("Converse") && category.equalsIgnoreCase("Slip On") && size.equals("36-40")) 
            price = 800000;
         else if (brand.equalsIgnoreCase("Converse") && category.equalsIgnoreCase("High Top") && size.equals("40-44")) 
            price = 1200000;
         else if (brand.equalsIgnoreCase("Sketcher") && category.equalsIgnoreCase("Woman") && size.equals("36-41")) 
            price = 1000000;
         else if (brand.equalsIgnoreCase("Sketcher") && category.equalsIgnoreCase("Man") && size.equals("41-44")) 
            price = 1800000;
         else if (brand.equalsIgnoreCase("Nike") && category.equalsIgnoreCase("Kids") && size.equals("36-40")) 
            price = 750000;
         else if (brand.equalsIgnoreCase("Nike") && category.equalsIgnoreCase("Adult") && size.equals("40-44")) 
            price = 1500000;
         else 
            System.out.println("Invalid brand, category, or size.");
        

        if (price > 0) 
            System.out.println("Price: " + price);
        

        
    }
}