import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        // Creat an object of ShoppingCart class and insert item into the hashmap.
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Bread", 1.25);
        cart.addItem("Chicken", 4.99);
        cart.addItem("Beef", 5.99);

        // Create a scanner for input.
        Scanner keyboard = new Scanner(System.in);

        int action = 0;
        System.out.println("Welcome to the shopping cart app. Choose from the" 
            + " menu below.");

        do {

            if (action == 1){
                // Check if the cart is empty.
                if(!cart.isEmpty()){

                    System.out.println(" ");
    
                    System.out.println("Your shopping cart contents: ");
                    cart.printItems();
                    System.out.println(" ");

                }

            }

            if (action == 2){
                System.out.println("Enter the items name.");
                String product = keyboard.nextLine();

                System.out.println("Enter the items price.");
                Double price = keyboard.nextDouble();
                keyboard.nextLine();

                cart.addItem(product, price);
                System.out.println(" ");
                
            }

            if (action == 3){
                // Get user input to delte items.
                System.out.println("Enter an item to delete.");
                String item = keyboard.nextLine();

                // Remove an item.
                cart.deleteItems(item);
                System.out.println(" ");
            }

            if (action == 4){
                cart.get_total();
                System.out.println(" ");
            }

            System.out.println("1. View shopping cart.");
            System.out.println("2. Add Item.");
            System.out.println("3. Delete Item.");
            System.out.println("4. Calculate total.");
            System.out.println("5. Quit.");
            System.out.println(" ");

            System.out.println("Enter an action.");

            
            action = keyboard.nextInt();
            keyboard.nextLine();

            System.out.println(" ");

        }

        while (action != 5);

        // Say goodbye :/
        System.out.println("Goodbye!");

        // Make sure the scanner is closed to avoid memory leak.
        keyboard.close();

    }
}
