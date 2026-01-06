package JAVA;
public class RescueResource extends Resource {

    public RescueResource(int quantity) {
        super("Rescue Equipment", quantity);
    }

    @Override
    public void relocate(String location) {
        System.out.println(quantity + " Rescue Equipment units relocated to " +
                location + " using helicopters.");
    }
}
 
