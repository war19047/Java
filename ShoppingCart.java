import java.util.HashMap;
import java.util.Map;
import java.util.Locale;
import java.text.NumberFormat;

// Create a class called shopping cart. Its methods will be:

public class ShoppingCart {
    // Create a shopping cart hashmap: Map<Key-Datatype, Value-Datatype> HashMapName;
    Map<String, Double> mShoppingCart;
    
    // Format dollars to the United States.
    Locale usa = new Locale("en", "US");
    NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
    
    // Create a HashMap constructor.
    public ShoppingCart(){
        mShoppingCart = new HashMap<String, Double>();
    }

    // Add items into the HashMap.
    public void addItem(String name, Double cost){
        mShoppingCart.put(name, cost);
    }

    // Loop through and displays all the contents of the shopping cart.
    public void printItems(){

        for (String i : mShoppingCart.keySet()){
            System.out.println(i + " - " + dollarFormat.format(mShoppingCart.get(i)));
        }
    }

    // Delete Items.
    public void deleteItems(String item){
        if (mShoppingCart.containsKey(item)){

            mShoppingCart.remove(item);
        }

        else{
            System.out.println(item + " Is not in the cart.");
        }

    }

    // Calculate total. Return total.
    public void get_total(){

        Double total = 0.0;

        for (Double i : mShoppingCart.values()){
            total += i;
        }

        System.out.println("The total is: " + dollarFormat.format(total));
    }

    // Check if the HashMap is empty.
    public Boolean isEmpty(){

        if (mShoppingCart.isEmpty()){
            System.out.println("The shopping cart is empty. Add some items");
            System.out.println(" ");
        }

        return mShoppingCart.isEmpty();
    }

}
