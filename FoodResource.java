package JAVA;
public class FoodResource extends Resource {

    public FoodResource(int quantity) {
        super("Food", quantity);
    }

    @Override
    public void relocate(String location) {
        System.out.println(quantity + " units of Food relocated to " + location +
                " using refrigerated transport.");
    }
}
   

